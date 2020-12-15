
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZmenyOd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaximalnyPocetVysledkov" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zmenyOd",
    "maximalnyPocetVysledkov"
})
@XmlRootElement(name = "vyhladajPoslednuZmenuOdRequest")
public class VyhladajPoslednuZmenuOdRequest {

    @XmlElement(name = "ZmenyOd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zmenyOd;
    @XmlElement(name = "MaximalnyPocetVysledkov", defaultValue = "100")
    protected Integer maximalnyPocetVysledkov;

    /**
     * Gets the value of the zmenyOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZmenyOd() {
        return zmenyOd;
    }

    /**
     * Sets the value of the zmenyOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZmenyOd(XMLGregorianCalendar value) {
        this.zmenyOd = value;
    }

    /**
     * Gets the value of the maximalnyPocetVysledkov property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximalnyPocetVysledkov() {
        return maximalnyPocetVysledkov;
    }

    /**
     * Sets the value of the maximalnyPocetVysledkov property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximalnyPocetVysledkov(Integer value) {
        this.maximalnyPocetVysledkov = value;
    }

}
