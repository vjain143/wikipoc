package com.wiki.poc.rest.services.mortgage;

import com.wiki.poc.util.StringUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("findAvailableBanks")
public class FindAvailableBanks {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String jsonMsg() {
        String retval = null;
        //retval = "[{\"name\":\"HSBC\",\"amt\":\"890\"},{\"name\":\"SBI\",\"amt\":\"500\"}]";
        retval = "[{\"name\":\"HSBC\",\"amt\":\""
                + StringUtil.getTestMsg(999999)
                + "\"},{\"name\":\"LBG\",\"amt\":\""
                + StringUtil.getTestMsg(999999)
                + "\"}]";
        System.out.println("JSON Message >> " + retval);
        return retval;
    }
}
