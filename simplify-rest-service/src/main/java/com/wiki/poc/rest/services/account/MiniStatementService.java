package com.wiki.poc.rest.services.account;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("ministmt")
public class MiniStatementService {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String msg() {
        Random r = new Random();
        String retVal = "<xml><stmt>"
                + "<msg><name>LIDL</name><amt>£" + r.nextInt(200) + "</amt><time>16-Apr-2016 10AM</time><transtype>Debit</transtype></msg>"
                + "<msg><name>Tesco</name><amt>£" + r.nextInt(250) + "</amt><time>16-Apr-2016 11AM</time><transtype>Debit</transtype></msg>"
                + "<msg><name>ATM</name><amt>£200</amt><time>17-Apr-2016 5PM</time><transtype>Debit</transtype></msg>"
                + "<msg><name>FPS Transfer</name><amt>£" + r.nextInt(2000) + "</amt><time>17-Apr-2016 8PM</time><transtype>Credit</transtype></msg>"
                + "<msg><name>ATM</name><amt>£300</amt><time>18-Apr-2016 8AM</time><transtype>Debit</transtype></msg>"
                + "<msg><name>ATM</name><amt>£20</amt><time>18-Apr-2016 5PM</time><transtype>Debit</transtype></msg>"
                + "<msg><name>TFL</name><amt>£4.8</amt><time>18-Apr-2016 8PM</time><transtype>Debit</transtype></msg>"
                + "<msg><name>FPS Transfer</name><amt>£" + r.nextInt(400) + "</amt><time>18-Apr-2016 9PM</time><transtype>Credit</transtype></msg>"
                + "<msg><name>Cineworld</name><amt>£12.8</amt><time>18-Apr-2016 8PM</time><transtype>Debit</transtype></msg>"
                + "<msg><name>Bill Gas</name><amt>£" + r.nextInt(300) + "</amt><time>19-Apr-2016 11AM</time><transtype>Debit</transtype></msg>"
                + "</stmt></xml>";
        return retVal;
    }

}
