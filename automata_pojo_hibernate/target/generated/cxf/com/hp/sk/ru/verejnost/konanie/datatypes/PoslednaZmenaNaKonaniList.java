
package com.hp.sk.ru.verejnost.konanie.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoslednaZmenaNaKonaniList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoslednaZmenaNaKonaniList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PoslednaZmenaNaKonani" type="{datatypes.konanie.verejnost.ru.sk.hp.com}PoslednaZmenaNaKonani" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoslednaZmenaNaKonaniList", propOrder = {
    "poslednaZmenaNaKonani"
})
public class PoslednaZmenaNaKonaniList {

    @XmlElement(name = "PoslednaZmenaNaKonani")
    protected List<PoslednaZmenaNaKonani> poslednaZmenaNaKonani;

    /**
     * Gets the value of the poslednaZmenaNaKonani property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poslednaZmenaNaKonani property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoslednaZmenaNaKonani().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoslednaZmenaNaKonani }
     * 
     * 
     */
    public List<PoslednaZmenaNaKonani> getPoslednaZmenaNaKonani() {
        if (poslednaZmenaNaKonani == null) {
            poslednaZmenaNaKonani = new ArrayList<PoslednaZmenaNaKonani>();
        }
        return this.poslednaZmenaNaKonani;
    }

}
