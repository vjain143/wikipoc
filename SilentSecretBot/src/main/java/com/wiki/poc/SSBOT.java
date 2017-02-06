package com.wiki.poc;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Created by vjain143 on 2/4/17.
 */
public class SSBOT
{
    private static String botURL = "https://api.telegram.org/bot306134193:AAFMnaVbj7jVWa6liZ2rG9LP-mMrZI99oX8";
    private static final Logger log = Logger.getLogger(SSBOT.class);

    private static int oldCount = 50;
    private static int newCount = 0;

    private HttpClient client;
    private HttpGet request;
    private HttpResponse response;

    public static void main(String args[])
    {
        SSBOT ssbot = new SSBOT();
        ssbot.startBot();
    }

    public void startBot()
    {
        client = HttpClients.createDefault();
        request = new HttpGet(botURL+"/getUpdates");

        try {
                response = client.execute(request);
                log.debug("SSBOT :: Response Code :: " + response.getStatusLine().getStatusCode());

                BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

                StringBuffer result = new StringBuffer();
                String line = "";
                while ((line = rd.readLine()) != null)
                {
                    result.append(line);
                }
                System.out.println("Result :: "+result.toString());


                JSONParser parser = new JSONParser();
                Object obj = parser.parse(result.toString());
                JSONObject data = (JSONObject) obj;

                JSONArray resultArray = (JSONArray) data.get("result");
                resultArray.size();

                newCount = resultArray.size();
                log.info(oldCount + "::" + newCount);

                if (oldCount < newCount)
                {
                    for (int i = oldCount; i < newCount; i++)
                    {
                        JSONObject message = (JSONObject) resultArray.get(i);
                        JSONObject msg = (JSONObject) message.get("message");
                        JSONObject chat = (JSONObject) msg.get("chat");

                        log.info(message.toString());

                        String id = chat.get("id").toString();
                        String name = (String) chat.get("username");
                        String text = (String) msg.get("text");

                        log.info("Reply to -->" + text);

                        if (name == null || "".equals(name))
                        {
                            name = (String) chat.get("first_name");
                        }

                        //Thread.sleep(1000);
                        //log.info(name);
                       execute(id, name, text.toLowerCase());
                    }
                }
                oldCount = newCount;

                Thread.sleep(2000);
                startBot();

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
    }

    public void execute(String id, String name, String text) throws IOException
    {
        String res = reply(text);
        String url = botURL+"/sendMessage?chat_id="+ id + "&text="+URLEncoder.encode(res, "UTF-8");
        HttpClient clientReply = HttpClients.createDefault();
        HttpGet httpGetReply = new HttpGet(url);
        HttpResponse httpResponseReply = clientReply.execute(httpGetReply);
        log.info("Sending message " + res + " >>>>Response Code : " + httpResponseReply.getStatusLine().getStatusCode());
    }

    public String reply(String input)
    {
        String retval = " Please try asking some questions ..";
        try
        {
            input = input.trim();
            if (input.equalsIgnoreCase("hello") || input.equalsIgnoreCase("hi"))
            {
                retval = "Hello User";
            }
            else if (input.equalsIgnoreCase("I'm tired all the time"))
            {
                retval = "That must be very difficult for you";
            }
            else if (input.equalsIgnoreCase("I hate my life"))
            {
                retval = "Believe in yourself! Have faith in your abilities!";
            }
            else if (input.equalsIgnoreCase("I always feel so alone"))
            {
                retval = "Adopt A Cute Pet";
            }
            else if (input.equalsIgnoreCase("Sick of just being hurt"))
            {
                retval = "Yes, I understand why things had to happen this way. I understand his reason for causing me pain. But mere understanding does not chase away the hurt. It does not call upon the sun when dark clouds have loomed over me. Let the rain come then if it must come! And let it wash away the dust that hurt my eyes!";
            }
            else if (input.equalsIgnoreCase("I can't let anyone know"))
            {
                retval = "It's OK to think about what I need";
            }
            else if (input.equalsIgnoreCase("Feeling Sad"))
            {
                retval = "Everyone gets sad at times, but you can feel better";
            }
            else if (input.equalsIgnoreCase("Feeling Happy"))
            {
                retval = "Share Your Happiness with others";
            }
            else if (input.equalsIgnoreCase("Feeling lonely"))
            {
                retval = "Adopt A Cute Pet";
            }
            else if(input.equalsIgnoreCase("i have many problems"))
            {
                retval = "Problems are not stop signs, they are guidelines.";
            }
            else
            {
                retval = "❤";
            }
        }
        catch (Exception e)
        {
            retval = " Error ..";
            e.printStackTrace();
        }
        return retval;
    }
}