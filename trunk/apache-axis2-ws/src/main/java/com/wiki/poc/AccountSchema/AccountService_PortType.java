/**
 * AccountService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wiki.poc.AccountSchema;

public interface AccountService_PortType extends java.rmi.Remote {
    public com.wiki.poc.AccountSchema.AccountInsertResponse accountInsert(com.wiki.poc.AccountSchema.AccountInsertRequest accountInsertRequest) throws java.rmi.RemoteException;
    public com.wiki.poc.AccountSchema.AccountSelectResponse accountSelect(com.wiki.poc.AccountSchema.AccountSelectRequest accountSelectRequest) throws java.rmi.RemoteException;
}
