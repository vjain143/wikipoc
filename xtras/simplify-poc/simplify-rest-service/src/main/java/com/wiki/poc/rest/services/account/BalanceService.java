package com.wiki.poc.rest.services.account;

import com.wiki.poc.util.StringUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("balance")
public class BalanceService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        String retVal = "";
        int r = StringUtil.getTestMsg(999999);
        System.out.println(BalanceService.class + ": Bank balance instruction executed : =>" + r);
        retVal = "Bank account balance is £" + r;
        return retVal;
    }
}
