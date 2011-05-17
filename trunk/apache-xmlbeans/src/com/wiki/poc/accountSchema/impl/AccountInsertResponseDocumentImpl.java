/*
 * An XML document type.
 * Localname: AccountInsertResponse
 * Namespace: http://poc.wiki.com/AccountSchema
 * Java type: com.wiki.poc.accountSchema.AccountInsertResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.wiki.poc.accountSchema.impl;
/**
 * A document containing one AccountInsertResponse(@http://poc.wiki.com/AccountSchema) element.
 *
 * This is a complex type.
 */
public class AccountInsertResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.wiki.poc.accountSchema.AccountInsertResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountInsertResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTINSERTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountInsertResponse");
    
    
    /**
     * Gets the "AccountInsertResponse" element
     */
    public com.wiki.poc.accountSchema.AccountInsertResponseType getAccountInsertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountInsertResponseType target = null;
            target = (com.wiki.poc.accountSchema.AccountInsertResponseType)get_store().find_element_user(ACCOUNTINSERTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AccountInsertResponse" element
     */
    public void setAccountInsertResponse(com.wiki.poc.accountSchema.AccountInsertResponseType accountInsertResponse)
    {
        generatedSetterHelperImpl(accountInsertResponse, ACCOUNTINSERTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AccountInsertResponse" element
     */
    public com.wiki.poc.accountSchema.AccountInsertResponseType addNewAccountInsertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountInsertResponseType target = null;
            target = (com.wiki.poc.accountSchema.AccountInsertResponseType)get_store().add_element_user(ACCOUNTINSERTRESPONSE$0);
            return target;
        }
    }
}
