
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Konkurz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Konkurz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{datatypes.konanie.verejnost.ru.sk.hp.com}Konanie"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="MalyKonkurz" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DatumPovoleniaOddlzenia" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Konkurz", propOrder = {
    "malyKonkurz",
    "datumPovoleniaOddlzenia"
})
public class Konkurz
    extends Konanie
{

    @XmlElement(name = "MalyKonkurz")
    protected Boolean malyKonkurz;
    @XmlElement(name = "DatumPovoleniaOddlzenia")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPovoleniaOddlzenia;

    /**
     * Gets the value of the malyKonkurz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMalyKonkurz() {
        return malyKonkurz;
    }

    /**
     * Sets the value of the malyKonkurz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMalyKonkurz(Boolean value) {
        this.malyKonkurz = value;
    }

    /**
     * Gets the value of the datumPovoleniaOddlzenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPovoleniaOddlzenia() {
        return datumPovoleniaOddlzenia;
    }

    /**
     * Sets the value of the datumPovoleniaOddlzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPovoleniaOddlzenia(XMLGregorianCalendar value) {
        this.datumPovoleniaOddlzenia = value;
    }

}
