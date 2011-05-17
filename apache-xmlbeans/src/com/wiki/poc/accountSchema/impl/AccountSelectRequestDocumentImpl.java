/*
 * An XML document type.
 * Localname: AccountSelectRequest
 * Namespace: http://poc.wiki.com/AccountSchema
 * Java type: com.wiki.poc.accountSchema.AccountSelectRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.wiki.poc.accountSchema.impl;
/**
 * A document containing one AccountSelectRequest(@http://poc.wiki.com/AccountSchema) element.
 *
 * This is a complex type.
 */
public class AccountSelectRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.wiki.poc.accountSchema.AccountSelectRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountSelectRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTSELECTREQUEST$0 = 
        new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountSelectRequest");
    
    
    /**
     * Gets the "AccountSelectRequest" element
     */
    public com.wiki.poc.accountSchema.AccountSelectRequestType getAccountSelectRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountSelectRequestType target = null;
            target = (com.wiki.poc.accountSchema.AccountSelectRequestType)get_store().find_element_user(ACCOUNTSELECTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AccountSelectRequest" element
     */
    public void setAccountSelectRequest(com.wiki.poc.accountSchema.AccountSelectRequestType accountSelectRequest)
    {
        generatedSetterHelperImpl(accountSelectRequest, ACCOUNTSELECTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AccountSelectRequest" element
     */
    public com.wiki.poc.accountSchema.AccountSelectRequestType addNewAccountSelectRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountSelectRequestType target = null;
            target = (com.wiki.poc.accountSchema.AccountSelectRequestType)get_store().add_element_user(ACCOUNTSELECTREQUEST$0);
            return target;
        }
    }
}
