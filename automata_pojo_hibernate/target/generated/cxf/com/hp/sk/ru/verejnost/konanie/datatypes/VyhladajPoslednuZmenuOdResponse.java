
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
 *         &lt;element name="PoslednaZmenaNaKonaniList" type="{datatypes.konanie.verejnost.ru.sk.hp.com}PoslednaZmenaNaKonaniList"/&gt;
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
    "poslednaZmenaNaKonaniList"
})
@XmlRootElement(name = "vyhladajPoslednuZmenuOdResponse")
public class VyhladajPoslednuZmenuOdResponse {

    @XmlElement(name = "PoslednaZmenaNaKonaniList", required = true)
    protected PoslednaZmenaNaKonaniList poslednaZmenaNaKonaniList;

    /**
     * Gets the value of the poslednaZmenaNaKonaniList property.
     * 
     * @return
     *     possible object is
     *     {@link PoslednaZmenaNaKonaniList }
     *     
     */
    public PoslednaZmenaNaKonaniList getPoslednaZmenaNaKonaniList() {
        return poslednaZmenaNaKonaniList;
    }

    /**
     * Sets the value of the poslednaZmenaNaKonaniList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoslednaZmenaNaKonaniList }
     *     
     */
    public void setPoslednaZmenaNaKonaniList(PoslednaZmenaNaKonaniList value) {
        this.poslednaZmenaNaKonaniList = value;
    }

}
