
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stranka" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VysledkovNaStranku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TypTriedenia" type="{datatypes.konanie.verejnost.ru.sk.hp.com}TypTriedenia" minOccurs="0"/&gt;
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
    "query",
    "stranka",
    "vysledkovNaStranku",
    "typTriedenia"
})
@XmlRootElement(name = "vyhladajKonanieRequest")
public class VyhladajKonanieRequest {

    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "Stranka", defaultValue = "0")
    protected Integer stranka;
    @XmlElement(name = "VysledkovNaStranku", defaultValue = "10")
    protected Integer vysledkovNaStranku;
    @XmlElement(name = "TypTriedenia", defaultValue = "DatumPoslednejUdalosti")
    @XmlSchemaType(name = "string")
    protected TypTriedenia typTriedenia;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the stranka property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStranka() {
        return stranka;
    }

    /**
     * Sets the value of the stranka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStranka(Integer value) {
        this.stranka = value;
    }

    /**
     * Gets the value of the vysledkovNaStranku property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVysledkovNaStranku() {
        return vysledkovNaStranku;
    }

    /**
     * Sets the value of the vysledkovNaStranku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVysledkovNaStranku(Integer value) {
        this.vysledkovNaStranku = value;
    }

    /**
     * Gets the value of the typTriedenia property.
     * 
     * @return
     *     possible object is
     *     {@link TypTriedenia }
     *     
     */
    public TypTriedenia getTypTriedenia() {
        return typTriedenia;
    }

    /**
     * Sets the value of the typTriedenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypTriedenia }
     *     
     */
    public void setTypTriedenia(TypTriedenia value) {
        this.typTriedenia = value;
    }

}
