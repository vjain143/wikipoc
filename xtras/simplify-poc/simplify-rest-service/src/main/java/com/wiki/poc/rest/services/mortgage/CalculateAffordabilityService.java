package com.wiki.poc.rest.services.mortgage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

@Path("calculateAffordability")
public class CalculateAffordabilityService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAC() {
        String retVal = "{\"\borrowUpLimit\":\"91600\",\"type-of-borrower\":\"F\",\"depositWorth\":\"20000\"}";
        HttpClient httpclient = HttpClients.createDefault();

        try {
            URIBuilder builder = new URIBuilder(
                    "https://personal.rbs.co.uk/services/tool/mortgagequotation?ajaxcall=true&%3Aformid=mortgageDetails&%3Aformstart=%2Fcontent%2Frbs_co_uk%2Fen_uk%2Fpersonal%2Fmortgages%2Fsecure%2Fhow-much-can-i-borrow%2Fjcr%3Acontent%2Fpar%2Ftool%2Ftoolpar%2Fstart&PropertyValue=120000&PropertyValue-cookie=true&PropertyValueSecond=3000&PropertyValueSecond-cookie=true&PropertyValueThird=&PropertyValueThird-cookie=true&RevolvingDebt=1000&RevolvingDebt-cookie=true&_charset_=UTF-8&debt-repayment=1000&debt-repayment-cookie=true&dependentsover18=0&dependentsover18-cookie=true&dependetsunder18=0&dependetsunder18-cookie=true&depositWorth=20000&depositWorth-cookie=true&depositWorthSecond=2000&depositWorthSecond-cookie=true&depositWorthThird=&depositWorthThird-cookie=true&grossSalary=70000&grossSalary-cookie=true&joint-debt-repayment=&joint-debt-repayment-cookie=true&joint-other-expenditure=&joint-other-expenditure-cookie=true&jointApplicant-cookie=true&jointRevolvingDebt=&jointRevolvingDebt-cookie=true&jointdependentsover18=&jointdependentsover18-cookie=true&jointdependentsunder18=&jointdependentsunder18-cookie=true&jointgrossSalary=&jointgrossSalary-cookie=true&jointterm=&jointterm-cookie=true&jt-other-income=&jt-other-income-cookie=true&mortgage-term=15&mortgage-term-cookie=true&mortgage-term_default=3&mortgage-term_incrementby=1&mortgage-term_max=35&mortgage-term_min=3&mortgage-term_months-cookie=true&mortgage-term_years-cookie=true&other-expenditure=1000&other-expenditure-cookie=true&other-income=1000&other-income-cookie=true&path=%2Fcontent%2Frbs_co_uk%2Fen_uk%2Fpersonal%2Fmortgages%2Fsecure%2Fhow-much-can-i-borrow&term=annual&term-cookie=true&type-of-borrower=F&type-of-borrower-cookie=true&viewlesslabel=Show%20Details&viewlesslabel=Show%20Details&viewmorelabel=Hide%20details&viewmorelabel=Hide%20details");

            URI uri = builder.build();
            HttpGet request = new HttpGet(uri);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                retVal = EntityUtils.toString(entity);
                System.out.println(retVal);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (retVal == null || retVal.equals("")) {
                retVal = "{\"\borrowUpLimit\":\"91600\",\"type-of-borrower\":\"F\",\"depositWorth\":\"20000\"}";

            }
        }

        return retVal;
    }

}
