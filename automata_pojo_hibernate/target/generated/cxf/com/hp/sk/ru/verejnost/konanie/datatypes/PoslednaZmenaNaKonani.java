
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PoslednaZmenaNaKonani complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoslednaZmenaNaKonani"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="KonanieId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PoslednaZmena" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoslednaZmenaNaKonani")
public class PoslednaZmenaNaKonani {

    @XmlAttribute(name = "KonanieId")
    protected String konanieId;
    @XmlAttribute(name = "PoslednaZmena")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poslednaZmena;

    /**
     * Gets the value of the konanieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonanieId() {
        return konanieId;
    }

    /**
     * Sets the value of the konanieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonanieId(String value) {
        this.konanieId = value;
    }

    /**
     * Gets the value of the poslednaZmena property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPoslednaZmena() {
        return poslednaZmena;
    }

    /**
     * Sets the value of the poslednaZmena property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPoslednaZmena(XMLGregorianCalendar value) {
        this.poslednaZmena = value;
    }

}
