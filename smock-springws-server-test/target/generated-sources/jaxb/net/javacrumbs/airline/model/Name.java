//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.30 at 07:40:07 AM GMT+05:30 
//


package net.javacrumbs.airline.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Name">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Name", namespace = "http://www.springframework.org/spring-ws/samples/airline/schemas/types", propOrder = {
    "first",
    "last"
})
public class Name {

    @XmlElement(namespace = "http://www.springframework.org/spring-ws/samples/airline/schemas/types", required = true)
    protected String first;
    @XmlElement(namespace = "http://www.springframework.org/spring-ws/samples/airline/schemas/types", required = true)
    protected String last;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirst(String value) {
        this.first = value;
    }

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast(String value) {
        this.last = value;
    }

}