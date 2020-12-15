
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
 *         &lt;element name="KonanieInfoList" type="{datatypes.konanie.verejnost.ru.sk.hp.com}KonanieInfoList" minOccurs="0"/&gt;
 *         &lt;element name="VysledkovCelkom" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "konanieInfoList",
    "vysledkovCelkom"
})
@XmlRootElement(name = "getKonaniePreObdobieResponse")
public class GetKonaniePreObdobieResponse {

    @XmlElement(name = "KonanieInfoList")
    protected KonanieInfoList konanieInfoList;
    @XmlElement(name = "VysledkovCelkom", defaultValue = "0")
    protected long vysledkovCelkom;

    /**
     * Gets the value of the konanieInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link KonanieInfoList }
     *     
     */
    public KonanieInfoList getKonanieInfoList() {
        return konanieInfoList;
    }

    /**
     * Sets the value of the konanieInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonanieInfoList }
     *     
     */
    public void setKonanieInfoList(KonanieInfoList value) {
        this.konanieInfoList = value;
    }

    /**
     * Gets the value of the vysledkovCelkom property.
     * 
     */
    public long getVysledkovCelkom() {
        return vysledkovCelkom;
    }

    /**
     * Sets the value of the vysledkovCelkom property.
     * 
     */
    public void setVysledkovCelkom(long value) {
        this.vysledkovCelkom = value;
    }

}
