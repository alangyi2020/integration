
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
 *         &lt;element name="KonanieId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "konanieId"
})
@XmlRootElement(name = "getKonanieDetailRequest")
public class GetKonanieDetailRequest {

    @XmlElement(name = "KonanieId", required = true)
    protected String konanieId;

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

}
