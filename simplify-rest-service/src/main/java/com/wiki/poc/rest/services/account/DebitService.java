package com.wiki.poc.rest.services.account;

import com.wiki.poc.util.StringUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("debit")
public class DebitService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getBalance() {
        String retVal = "";
        int r = StringUtil.getTestMsg(2000);
        System.out.println(DebitService.class + ": DebitService instruction executed : =>" + r);
        retVal = "Your Bank account is debited with £8000 and available balance is £" + r;
        return retVal;
    }

}
