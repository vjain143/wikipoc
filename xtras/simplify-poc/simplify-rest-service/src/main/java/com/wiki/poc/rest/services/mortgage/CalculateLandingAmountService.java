package com.wiki.poc.rest.services.mortgage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("calculateLandingAmount")
public class CalculateLandingAmountService {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String msg() {
        Random r = new Random();
        String retVal = "<xml><msg><name>HSBC</name> <amt>" + r.nextInt(999999) + "</amt></msg><msg><name>SBI</name><amt>" + r.nextInt(999999) + "</amt></msg></xml>";
        return retVal;
    }

}
