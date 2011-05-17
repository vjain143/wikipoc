/*
 * XML Type:  AccountInsertResponseType
 * Namespace: http://poc.wiki.com/AccountSchema
 * Java type: com.wiki.poc.accountSchema.AccountInsertResponseType
 *
 * Automatically generated - do not modify.
 */
package com.wiki.poc.accountSchema.impl;
/**
 * An XML AccountInsertResponseType(@http://poc.wiki.com/AccountSchema).
 *
 * This is a complex type.
 */
public class AccountInsertResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.wiki.poc.accountSchema.AccountInsertResponseType
{
    private static final long serialVersionUID = 1L;
    
    public AccountInsertResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "status");
    
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
}
