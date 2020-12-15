
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FyzickaOsobaPodnikatel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FyzickaOsobaPodnikatel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{datatypes.konanie.verejnost.ru.sk.hp.com}Osoba"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObchodneMeno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Meno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Priezvisko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TitulPredMenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitulZaMenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Register" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CisloRegistracie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FyzickaOsobaPodnikatel", propOrder = {
    "obchodneMeno",
    "meno",
    "priezvisko",
    "titulPredMenom",
    "titulZaMenom",
    "ico",
    "register",
    "cisloRegistracie"
})
public class FyzickaOsobaPodnikatel
    extends Osoba
{

    @XmlElement(name = "ObchodneMeno", required = true)
    protected String obchodneMeno;
    @XmlElement(name = "Meno", required = true)
    protected String meno;
    @XmlElement(name = "Priezvisko", required = true)
    protected String priezvisko;
    @XmlElement(name = "TitulPredMenom")
    protected String titulPredMenom;
    @XmlElement(name = "TitulZaMenom")
    protected String titulZaMenom;
    @XmlElement(name = "Ico", required = true)
    protected String ico;
    @XmlElement(name = "Register", required = true)
    protected String register;
    @XmlElement(name = "CisloRegistracie", required = true)
    protected String cisloRegistracie;

    /**
     * Gets the value of the obchodneMeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodneMeno() {
        return obchodneMeno;
    }

    /**
     * Sets the value of the obchodneMeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodneMeno(String value) {
        this.obchodneMeno = value;
    }

    /**
     * Gets the value of the meno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeno() {
        return meno;
    }

    /**
     * Sets the value of the meno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeno(String value) {
        this.meno = value;
    }

    /**
     * Gets the value of the priezvisko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriezvisko() {
        return priezvisko;
    }

    /**
     * Sets the value of the priezvisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriezvisko(String value) {
        this.priezvisko = value;
    }

    /**
     * Gets the value of the titulPredMenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulPredMenom() {
        return titulPredMenom;
    }

    /**
     * Sets the value of the titulPredMenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulPredMenom(String value) {
        this.titulPredMenom = value;
    }

    /**
     * Gets the value of the titulZaMenom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulZaMenom() {
        return titulZaMenom;
    }

    /**
     * Sets the value of the titulZaMenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulZaMenom(String value) {
        this.titulZaMenom = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIco(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegister(String value) {
        this.register = value;
    }

    /**
     * Gets the value of the cisloRegistracie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloRegistracie() {
        return cisloRegistracie;
    }

    /**
     * Sets the value of the cisloRegistracie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloRegistracie(String value) {
        this.cisloRegistracie = value;
    }

}
