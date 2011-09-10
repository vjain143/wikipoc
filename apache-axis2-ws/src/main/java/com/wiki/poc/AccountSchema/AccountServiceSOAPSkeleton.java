/**
 * AccountServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wiki.poc.AccountSchema;

public class AccountServiceSOAPSkeleton implements com.wiki.poc.AccountSchema.AccountService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.wiki.poc.AccountSchema.AccountService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountInsertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", ">AccountInsertRequest"), com.wiki.poc.AccountSchema.AccountInsertRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("accountInsert", _params, new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountInsertResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", ">AccountInsertResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "AccountInsert"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("accountInsert") == null) {
            _myOperations.put("accountInsert", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("accountInsert")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountSelectRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", ">AccountSelectRequest"), com.wiki.poc.AccountSchema.AccountSelectRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("accountSelect", _params, new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountSelectResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", ">AccountSelectResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "AccountSelect"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("accountSelect") == null) {
            _myOperations.put("accountSelect", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("accountSelect")).add(_oper);
    }

    public AccountServiceSOAPSkeleton() {
        this.impl = new com.wiki.poc.AccountSchema.AccountServiceSOAPImpl();
    }

    public AccountServiceSOAPSkeleton(com.wiki.poc.AccountSchema.AccountService_PortType impl) {
        this.impl = impl;
    }
    public com.wiki.poc.AccountSchema.AccountInsertResponse accountInsert(com.wiki.poc.AccountSchema.AccountInsertRequest accountInsertRequest) throws java.rmi.RemoteException
    {
        com.wiki.poc.AccountSchema.AccountInsertResponse ret = impl.accountInsert(accountInsertRequest);
        return ret;
    }

    public com.wiki.poc.AccountSchema.AccountSelectResponse accountSelect(com.wiki.poc.AccountSchema.AccountSelectRequest accountSelectRequest) throws java.rmi.RemoteException
    {
        com.wiki.poc.AccountSchema.AccountSelectResponse ret = impl.accountSelect(accountSelectRequest);
        return ret;
    }

}
