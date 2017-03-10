package com.wiki.poc.rest.services.mortgage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Path("mortgagelist")
public class MortgagePaperworkChecklistService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String msg() throws InterruptedException {
        String retVal = null;
        Random r = new Random();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();

        Calendar yes = Calendar.getInstance();
        // Subtract 1 day
        yes.add(Calendar.DATE, -1);
        yes.add(Calendar.HOUR, -1);
        Date d = new Date(yes.getTimeInMillis());

        int count = 500;

		/*String retVal ="<xml><mortgage>"
				+ "<NAME>XYZ</NAME>"
				+"<ID>Passport Number</ID>"
				+"<YEAR>20</YEAR>"
				+"<PREFERENCES>looking for less rate and good deal</PREFERENCES>"
				+"<TYPE>Buy my first property</TYPE>"
				+"<RIGHT_TO_BUY>Yes</RIGHT_TO_BUY>"
				+ "<AMOUNT>£"+r.nextInt(9999999)+"</AMOUNT>"
				+"<DATE>"+dateFormat.format(date)+"</DATE>"
						+ "</mortgage>"
						+ "<mortgage>"
						+ "<NAME>Vivek</NAME>"
						+"<ID>Passport Number</ID>"
						+"<YEAR>25</YEAR>"
						+"<PREFERENCES>good deal</PREFERENCES>"
						+"<TYPE>Move house/Buy another property</TYPE>"
						+"<RIGHT_TO_BUY>Yes</RIGHT_TO_BUY>"
						+ "<AMOUNT>£"+r.nextInt(88888)+"</AMOUNT>"
								+"<DATE>"+dateFormat.format(d)+"</DATE>"
								+ "</mortgage>"
								+ "</xml>"; */


        //retval = "[{\"name\":\"HSBC\",\"amt\":\"890\"},{\"name\":\"SBI\",\"amt\":\"500\"}]";
        retVal = "[{\"name\":\"Prasad\",\"id\":\"Passport Number\",\"year\":\"20\" ,\"PREFERENCES\":\"Deal should be good\",\"type\":\"Borrow funds - for NEW customers\",\"RIGHT_TO_BUY\":\"Yes\","
                + "\"amt\":\"£"
                + r.nextInt(100000)
                + "\",\"date\":\""
                + dateFormat.format(date)
                + "\" ,\"emailID\":\"xyz@gmail.com\",\"martialStatus\":\"single\""
                + ",\"residentialHistory\":\"45 XYZ ABC\""
                + ",\"employment\":\"XYZ 40000\",\"type\":\"permanent\""
                + ",\"status1\":\"Data validation checks done\""
                + ",\"status2\":\"Data packaging done\""
                + ",\"status3\":\"Data ready to be send\""
                + ",\"status4\":\"Sending\""
                + ",\"status5\":\"Done\""
                + ",\"status6\":\"Approved AIP link recieved\""
                + "}]";

        System.out.println(" >> Data validation checks done <<");
        //Thread.sleep(count);
        System.out.println(" >> Data packaging done <<");
        //Thread.sleep(count);
        System.out.println(" >> Data ready to be send <<");
        //Thread.sleep(count);
        System.out.println(" >> Sending <<");
        //Thread.sleep(count);
        System.out.println(" JSON Object" + retVal);
        //Thread.sleep(count);
        System.out.println(" >> Done  <<");

        System.out.println(" >> Approved AIP link recieved  <<");

        return retVal;
    }

}
