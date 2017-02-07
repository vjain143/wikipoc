package com.wiki.poc.sample;

import org.telehash.core.Channel;
import org.telehash.core.ChannelHandler;
import org.telehash.core.ChannelPacket;
import org.telehash.core.LocalNode;
import org.telehash.core.Switch;
import org.telehash.core.Telehash;
import org.telehash.core.TelehashException;
import org.telehash.storage.Storage;
import org.telehash.storage.impl.StorageImpl;

import java.io.FileNotFoundException;

public class BasicSeed
{

	private static final String LOCALNODE_BASE_FILENAME = "telehash-seed";
	private static final int PORT = 5052;

	public static final void main(String[] args)
	{
		Storage storage = new StorageImpl();
		// load or create a local node
		LocalNode localNode;
		try
		{
			localNode = storage.readLocalNode(LOCALNODE_BASE_FILENAME);
		} 
		catch (TelehashException e)
		{
			if (e.getCause() instanceof FileNotFoundException)
			{
				// no local node found -- create a new one.
				try
				{
					localNode = Telehash.get().getCrypto().generateLocalNode();
					storage.writeLocalNode(localNode, LOCALNODE_BASE_FILENAME);
				} catch (TelehashException e1)
				{
					e1.printStackTrace();
					return;
				}
			} else
			{
				e.printStackTrace();
				return;
			}
		}

		System.out.println("my hash name: " + localNode.getHashName());
		// launch the switch
		Telehash telehash = new Telehash(localNode);
		Switch telehashSwitch = new Switch(telehash, null, PORT);
		telehash.setSwitch(telehashSwitch);
		try
		{
			telehashSwitch.start();
			//below code enable if you know the node to communicate
			/*
			telehashSwitch.registerChannelHandler(EchoChannelHandler.TYPE, new EchoChannelHandler());
			telehashSwitch.openChannel(localNode,EchoChannelHandler.TYPE, new ChannelHandler() {
	            int echoResponsesReceived = 0;
	       
	            public void handleOpen(Channel channel) {
	                System.out.println("channel event: open: "+channel);
	                try {
	                    channel.send("testing123".getBytes());
	                } catch (TelehashException e) {
	                    e.printStackTrace();
	                }
	            }

	            public void handleIncoming(Channel channel, ChannelPacket channelPacket) {
	                String echo = new String(channelPacket.getBody());
	                System.out.println("channel event: incoming echo response #"+(echoResponsesReceived+1)+": "+echo);
	                if (! echo.equals("testing123")) 
	                {
	                	 System.out.println("echo response does not match");
	                    return;
	                }
	                echoResponsesReceived++;
	                if (echoResponsesReceived == 3) {
	                	 System.out.println("");
	                    return;
	                }

	                // send a fresh string to be echoed
	                try {
	                    channel.send("testing123".getBytes());
	                } catch (TelehashException e) {
	                    e.printStackTrace();
	                }
	            }

	            public void handleError(Channel channel, Throwable error) {
	            	System.out.println("channel event: error "+error);
	            	 System.out.println("error");
	            }

	        });
	        */
		} catch (TelehashException e)
		{
			e.printStackTrace();
			return;
		}
		
		try
		{
			System.out.println("preferred local path: " + telehash.getNetwork().getPreferredLocalPath());
			
		} 
		catch (TelehashException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// allow the switch to run for one hour
		try
		{
			Thread.sleep(3600 * 1000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// stop the switch
		telehashSwitch.stop();
	}
}
