/*
 * An XML document type.
 * Localname: AccountSelectRequest
 * Namespace: http://poc.wiki.com/AccountSchema
 * Java type: com.wiki.poc.accountSchema.AccountSelectRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.wiki.poc.accountSchema;


/**
 * A document containing one AccountSelectRequest(@http://poc.wiki.com/AccountSchema) element.
 *
 * This is a complex type.
 */
public interface AccountSelectRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountSelectRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s546443B6C2EC3C44978DBDD25DE23687").resolveHandle("accountselectrequestec9ddoctype");
    
    /**
     * Gets the "AccountSelectRequest" element
     */
    com.wiki.poc.accountSchema.AccountSelectRequestType getAccountSelectRequest();
    
    /**
     * Sets the "AccountSelectRequest" element
     */
    void setAccountSelectRequest(com.wiki.poc.accountSchema.AccountSelectRequestType accountSelectRequest);
    
    /**
     * Appends and returns a new empty "AccountSelectRequest" element
     */
    com.wiki.poc.accountSchema.AccountSelectRequestType addNewAccountSelectRequest();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument newInstance() {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.wiki.poc.accountSchema.AccountSelectRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.wiki.poc.accountSchema.AccountSelectRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
