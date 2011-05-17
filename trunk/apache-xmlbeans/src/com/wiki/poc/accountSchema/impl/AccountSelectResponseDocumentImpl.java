/*
 * An XML document type.
 * Localname: AccountSelectResponse
 * Namespace: http://poc.wiki.com/AccountSchema
 * Java type: com.wiki.poc.accountSchema.AccountSelectResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.wiki.poc.accountSchema.impl;
/**
 * A document containing one AccountSelectResponse(@http://poc.wiki.com/AccountSchema) element.
 *
 * This is a complex type.
 */
public class AccountSelectResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.wiki.poc.accountSchema.AccountSelectResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountSelectResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTSELECTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountSelectResponse");
    
    
    /**
     * Gets the "AccountSelectResponse" element
     */
    public com.wiki.poc.accountSchema.AccountSelectResponseType getAccountSelectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountSelectResponseType target = null;
            target = (com.wiki.poc.accountSchema.AccountSelectResponseType)get_store().find_element_user(ACCOUNTSELECTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AccountSelectResponse" element
     */
    public void setAccountSelectResponse(com.wiki.poc.accountSchema.AccountSelectResponseType accountSelectResponse)
    {
        generatedSetterHelperImpl(accountSelectResponse, ACCOUNTSELECTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AccountSelectResponse" element
     */
    public com.wiki.poc.accountSchema.AccountSelectResponseType addNewAccountSelectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountSelectResponseType target = null;
            target = (com.wiki.poc.accountSchema.AccountSelectResponseType)get_store().add_element_user(ACCOUNTSELECTRESPONSE$0);
            return target;
        }
    }
}
