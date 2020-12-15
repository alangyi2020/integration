
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Restrukturalizacia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Restrukturalizacia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{datatypes.konanie.verejnost.ru.sk.hp.com}Konanie"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="DatumZavedeniaDozornejSpravy" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restrukturalizacia", propOrder = {
    "datumZavedeniaDozornejSpravy"
})
public class Restrukturalizacia
    extends Konanie
{

    @XmlElement(name = "DatumZavedeniaDozornejSpravy")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZavedeniaDozornejSpravy;

    /**
     * Gets the value of the datumZavedeniaDozornejSpravy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZavedeniaDozornejSpravy() {
        return datumZavedeniaDozornejSpravy;
    }

    /**
     * Sets the value of the datumZavedeniaDozornejSpravy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZavedeniaDozornejSpravy(XMLGregorianCalendar value) {
        this.datumZavedeniaDozornejSpravy = value;
    }

}
