package com.wiki.form;

import org.apache.struts.action.ActionForm;

/**
 * @author WIKI(vjain143@gmail.com)
 */
public class HelloWikiForm extends ActionForm
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String            message;

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }
}