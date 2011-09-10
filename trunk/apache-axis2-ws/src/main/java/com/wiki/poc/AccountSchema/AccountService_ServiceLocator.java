/**
 * AccountService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wiki.poc.AccountSchema;

public class AccountService_ServiceLocator extends org.apache.axis.client.Service implements com.wiki.poc.AccountSchema.AccountService_Service {

/**
 * Account Service definition with binding and port.
 */

    public AccountService_ServiceLocator() {
    }


    public AccountService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountServiceSOAP
    private java.lang.String AccountServiceSOAP_address = "http://www.example.org/";

    public java.lang.String getAccountServiceSOAPAddress() {
        return AccountServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountServiceSOAPWSDDServiceName = "AccountServiceSOAP";

    public java.lang.String getAccountServiceSOAPWSDDServiceName() {
        return AccountServiceSOAPWSDDServiceName;
    }

    public void setAccountServiceSOAPWSDDServiceName(java.lang.String name) {
        AccountServiceSOAPWSDDServiceName = name;
    }

    public com.wiki.poc.AccountSchema.AccountService_PortType getAccountServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountServiceSOAP(endpoint);
    }

    public com.wiki.poc.AccountSchema.AccountService_PortType getAccountServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wiki.poc.AccountSchema.AccountServiceSOAPStub _stub = new com.wiki.poc.AccountSchema.AccountServiceSOAPStub(portAddress, this);
            _stub.setPortName(getAccountServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountServiceSOAPEndpointAddress(java.lang.String address) {
        AccountServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wiki.poc.AccountSchema.AccountService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wiki.poc.AccountSchema.AccountServiceSOAPStub _stub = new com.wiki.poc.AccountSchema.AccountServiceSOAPStub(new java.net.URL(AccountServiceSOAP_address), this);
                _stub.setPortName(getAccountServiceSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AccountServiceSOAP".equals(inputPortName)) {
            return getAccountServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://poc.wiki.com/AccountSchema", "AccountServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountServiceSOAP".equals(portName)) {
            setAccountServiceSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
