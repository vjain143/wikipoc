/**
 * AccountService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wiki.poc.AccountSchema;

public interface AccountService_Service extends javax.xml.rpc.Service {

/**
 * Account Service definition with binding and port.
 */
    public java.lang.String getAccountServiceSOAPAddress();

    public com.wiki.poc.AccountSchema.AccountService_PortType getAccountServiceSOAP() throws javax.xml.rpc.ServiceException;

    public com.wiki.poc.AccountSchema.AccountService_PortType getAccountServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
