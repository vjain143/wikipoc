/*
 * An XML document type.
 * Localname: AccountInsertRequest
 * Namespace: http://poc.wiki.com/AccountSchema
 * Java type: com.wiki.poc.accountSchema.AccountInsertRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.wiki.poc.accountSchema.impl;
/**
 * A document containing one AccountInsertRequest(@http://poc.wiki.com/AccountSchema) element.
 *
 * This is a complex type.
 */
public class AccountInsertRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.wiki.poc.accountSchema.AccountInsertRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountInsertRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTINSERTREQUEST$0 = 
        new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountInsertRequest");
    
    
    /**
     * Gets the "AccountInsertRequest" element
     */
    public com.wiki.poc.accountSchema.AccountInsertRequestType getAccountInsertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountInsertRequestType target = null;
            target = (com.wiki.poc.accountSchema.AccountInsertRequestType)get_store().find_element_user(ACCOUNTINSERTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AccountInsertRequest" element
     */
    public void setAccountInsertRequest(com.wiki.poc.accountSchema.AccountInsertRequestType accountInsertRequest)
    {
        generatedSetterHelperImpl(accountInsertRequest, ACCOUNTINSERTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AccountInsertRequest" element
     */
    public com.wiki.poc.accountSchema.AccountInsertRequestType addNewAccountInsertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.wiki.poc.accountSchema.AccountInsertRequestType target = null;
            target = (com.wiki.poc.accountSchema.AccountInsertRequestType)get_store().add_element_user(ACCOUNTINSERTREQUEST$0);
            return target;
        }
    }
}
