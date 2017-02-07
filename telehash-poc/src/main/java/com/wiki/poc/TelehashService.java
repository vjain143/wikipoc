package com.wiki.poc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import org.telehash.core.CipherSetIdentifier;
import org.telehash.core.LocalNode;
import org.telehash.core.SeedNode;
import org.telehash.core.Switch;
import org.telehash.core.Telehash;
import org.telehash.core.TelehashException;
import org.telehash.core.Util;
import org.telehash.crypto.HashNamePublicKey;
import org.telehash.storage.Storage;
import org.telehash.storage.impl.StorageImpl;

public class TelehashService
{
	private static final String TAG = "Telehash";
	private static final String LOCALNODE_BASE_FILENAME = "telehash-node";
	private static final int PORT = 42424;
	private String mLocalNodeBaseFilename;
	private Telehash mTelehash;
	private Switch mSwitch;

	public static void main(String[] args)
	{
		TelehashService service = new TelehashService();
		service.onCreate();
	}

	public void onCreate()
	{
		// org.telehash.core.Log.setLogListener();//FIXME
		mLocalNodeBaseFilename = System.getProperty("user.dir") + File.separator + LOCALNODE_BASE_FILENAME;
		Storage storage = new StorageImpl();
		// load or create a local node
		LocalNode localNode;
		try
		{
			localNode = storage.readLocalNode(mLocalNodeBaseFilename);
		} 
		catch (TelehashException e)
		{
			if (e.getCause() instanceof FileNotFoundException)
			{
				System.out.println("TelehashService :: No local node found -- creating  a new one.");
				try
				{
					localNode = Telehash.get().getCrypto().generateLocalNode();
					storage.writeLocalNode(localNode, mLocalNodeBaseFilename);
				} 
				catch (TelehashException e1)
				{
					e1.printStackTrace();
					return;
				}
			} 
			else
			{
				e.printStackTrace();
				return;
			}
		}

		System.out.println("TelehashService :: Hash name: " + localNode.getHashName());

		
		File seedsJson = new File(System.getProperty("user.dir") + File.separator + "seeds.json");
		if (!seedsJson.exists())
		{
			try
			{
				System.out.println("!seedsJson.exists()");
				writeSeedsJson(seedsJson);
			} 
			catch (IOException e)
			{
				System.err.println("TelehashService :: "+TAG + "cannot write seeds.json" + e);
				return;
			}
		}

		Set<SeedNode> seeds = null;
		try
		{
			seeds = storage.readSeeds(seedsJson.getAbsolutePath());
		} 
		catch (TelehashException e)
		{
			System.err.println("TelehashService :: "+TAG + "cannot read seeds" + e);
			return;
		}

		// debug seeds
		System.out.println("TelehashService :: seeds:");
		for (SeedNode seed : seeds)
		{
			System.out.println("TelehashService :: Hashname :: " + seed.getHashName());
			for (Map.Entry<CipherSetIdentifier, byte[]> entry : seed.getFingerprints().entrySet())
			{
				System.out.println("TelehashService :: cs :: " + entry.getKey() + " fingerprint: " + Util.bytesToHex(entry.getValue()));
			}
			for (CipherSetIdentifier csid : seed.getCipherSetIds())
			{
				System.out.println("TelehashService :: cs :: " + csid);
				try
				{
					HashNamePublicKey publicKey = seed.getPublicKey(csid);
					if (publicKey != null)
					{
						System.out.println("TelehashService :: Public Key :: " + Util.base64Encode(seed.getPublicKey(csid).getEncoded()));
						System.out.println("TelehashService :: Finger Print :: " + Util.bytesToHex(seed.getPublicKey(csid).getFingerprint()));
					}
				} catch (TelehashException e)
				{
					e.printStackTrace();
				}
			}
		}

		// launch the switch
		mTelehash = new Telehash(localNode);
		mSwitch = new Switch(mTelehash, seeds, PORT);
		mTelehash.setSwitch(mSwitch);
		try
		{
			mSwitch.start();
			mSwitch.waitForInit();
		} catch (TelehashException e)
		{
			System.err.println("TelehashService :: "+TAG + " cannot start telehash" + e);
			return;
		}
		System.out.println("TelehashService :: "+TAG + "telehash started.");
	}

	public void onDestroy()
	{
		if (mSwitch != null)
		{
			mSwitch.stop();
		}
	}

	private void writeSeedsJson(File file) throws IOException
	{
		PrintWriter out = new PrintWriter(file);
		out.write(TelehashData.DEFAULT_SEEDS_JSON);
		out.close();
	}
}