
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
 *         &lt;element name="DatumOd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DatumDo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Stranka" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VysledkovNaStranku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "datumOd",
    "datumDo",
    "stranka",
    "vysledkovNaStranku"
})
@XmlRootElement(name = "getKonaniePreObdobieRequest")
public class GetKonaniePreObdobieRequest {

    @XmlElement(name = "DatumOd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumOd;
    @XmlElement(name = "DatumDo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumDo;
    @XmlElement(name = "Stranka", defaultValue = "0")
    protected Integer stranka;
    @XmlElement(name = "VysledkovNaStranku", defaultValue = "10")
    protected Integer vysledkovNaStranku;

    /**
     * Gets the value of the datumOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumOd() {
        return datumOd;
    }

    /**
     * Sets the value of the datumOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumOd(XMLGregorianCalendar value) {
        this.datumOd = value;
    }

    /**
     * Gets the value of the datumDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumDo() {
        return datumDo;
    }

    /**
     * Sets the value of the datumDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumDo(XMLGregorianCalendar value) {
        this.datumDo = value;
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

}
