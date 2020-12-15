
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Obsahuje atribúty inštancie typu Adresa:
 *                 ulica - ulica adresy
 *                 supisneCislo - supisné číslo adresy
 *                 orientacneCislo - orientačné číslo adresy
 *                 obec - obec adresy
 *                 psc - PSČ adresy
 *                 krajina - krajina adresy
 *             
 * 
 * <p>Java class for Adresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ulica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SupisneCislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrientacneCislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Obec" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Psc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Krajina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adresa", propOrder = {
    "ulica",
    "supisneCislo",
    "orientacneCislo",
    "obec",
    "psc",
    "krajina"
})
public class Adresa {

    @XmlElement(name = "Ulica", required = true)
    protected String ulica;
    @XmlElement(name = "SupisneCislo")
    protected String supisneCislo;
    @XmlElement(name = "OrientacneCislo")
    protected String orientacneCislo;
    @XmlElement(name = "Obec", required = true)
    protected String obec;
    @XmlElement(name = "Psc", required = true)
    protected String psc;
    @XmlElement(name = "Krajina", required = true)
    protected String krajina;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the supisneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupisneCislo() {
        return supisneCislo;
    }

    /**
     * Sets the value of the supisneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupisneCislo(String value) {
        this.supisneCislo = value;
    }

    /**
     * Gets the value of the orientacneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientacneCislo() {
        return orientacneCislo;
    }

    /**
     * Sets the value of the orientacneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientacneCislo(String value) {
        this.orientacneCislo = value;
    }

    /**
     * Gets the value of the obec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObec() {
        return obec;
    }

    /**
     * Sets the value of the obec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObec(String value) {
        this.obec = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsc() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsc(String value) {
        this.psc = value;
    }

    /**
     * Gets the value of the krajina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKrajina() {
        return krajina;
    }

    /**
     * Sets the value of the krajina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrajina(String value) {
        this.krajina = value;
    }

}
