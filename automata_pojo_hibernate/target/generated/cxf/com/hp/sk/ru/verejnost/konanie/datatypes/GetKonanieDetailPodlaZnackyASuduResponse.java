
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Konanie" type="{datatypes.konanie.verejnost.ru.sk.hp.com}Konanie"/&gt;
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
    "konanie"
})
@XmlRootElement(name = "getKonanieDetailPodlaZnackyASuduResponse")
public class GetKonanieDetailPodlaZnackyASuduResponse {

    @XmlElement(name = "Konanie", required = true)
    protected Konanie konanie;

    /**
     * Gets the value of the konanie property.
     * 
     * @return
     *     possible object is
     *     {@link Konanie }
     *     
     */
    public Konanie getKonanie() {
        return konanie;
    }

    /**
     * Sets the value of the konanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Konanie }
     *     
     */
    public void setKonanie(Konanie value) {
        this.konanie = value;
    }

}
