
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PravnickaOsoba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PravnickaOsoba"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{datatypes.konanie.verejnost.ru.sk.hp.com}Osoba"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObchodneMeno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PravnaForma" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Register" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CisloRegistracie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PravnickaOsoba", propOrder = {
    "obchodneMeno",
    "ico",
    "pravnaForma",
    "register",
    "cisloRegistracie"
})
public class PravnickaOsoba
    extends Osoba
{

    @XmlElement(name = "ObchodneMeno", required = true)
    protected String obchodneMeno;
    @XmlElement(name = "Ico", required = true)
    protected String ico;
    @XmlElement(name = "PravnaForma", required = true)
    protected String pravnaForma;
    @XmlElement(name = "Register", required = true)
    protected String register;
    @XmlElement(name = "CisloRegistracie", required = true)
    protected String cisloRegistracie;

    /**
     * Gets the value of the obchodneMeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodneMeno() {
        return obchodneMeno;
    }

    /**
     * Sets the value of the obchodneMeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodneMeno(String value) {
        this.obchodneMeno = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIco(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the pravnaForma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPravnaForma() {
        return pravnaForma;
    }

    /**
     * Sets the value of the pravnaForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPravnaForma(String value) {
        this.pravnaForma = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegister(String value) {
        this.register = value;
    }

    /**
     * Gets the value of the cisloRegistracie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloRegistracie() {
        return cisloRegistracie;
    }

    /**
     * Sets the value of the cisloRegistracie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloRegistracie(String value) {
        this.cisloRegistracie = value;
    }

}
