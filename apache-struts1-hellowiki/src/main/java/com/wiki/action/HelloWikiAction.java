package com.wiki.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.wiki.form.HelloWikiForm;
/**
 * 
 * @author WIKI(vjain143@gmail.com)
 *
 */
public class HelloWikiAction extends Action
{
    public ActionForward execute( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) throws Exception
    {
        HelloWikiForm wikiForm = (HelloWikiForm) form;
        wikiForm.setMessage( "Hello wiki this is \"Struts 1\"." );
        return mapping.findForward( "success" );
    }
}