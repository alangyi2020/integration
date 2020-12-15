
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Osoba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Osoba"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Adresa" type="{datatypes.konanie.verejnost.ru.sk.hp.com}Adresa" minOccurs="0"/&gt;
 *         &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankovyUcet" type="{datatypes.konanie.verejnost.ru.sk.hp.com}BankovyUcet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Osoba", propOrder = {
    "adresa",
    "telefon",
    "email",
    "bankovyUcet"
})
@XmlSeeAlso({
    FyzickaOsoba.class,
    FyzickaOsobaPodnikatel.class,
    PravnickaOsoba.class
})
public class Osoba {

    @XmlElement(name = "Adresa")
    protected Adresa adresa;
    @XmlElement(name = "Telefon")
    protected String telefon;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "BankovyUcet")
    protected BankovyUcet bankovyUcet;

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link Adresa }
     *     
     */
    public Adresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresa }
     *     
     */
    public void setAdresa(Adresa value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the bankovyUcet property.
     * 
     * @return
     *     possible object is
     *     {@link BankovyUcet }
     *     
     */
    public BankovyUcet getBankovyUcet() {
        return bankovyUcet;
    }

    /**
     * Sets the value of the bankovyUcet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankovyUcet }
     *     
     */
    public void setBankovyUcet(BankovyUcet value) {
        this.bankovyUcet = value;
    }

}
