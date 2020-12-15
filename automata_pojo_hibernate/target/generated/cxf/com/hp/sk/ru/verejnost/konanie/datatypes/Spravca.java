
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Spravca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Spravca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Znacka" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatumZapisu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Meno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Priezvisko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TitulPredMenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitulZaMenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatumNarodenia" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ObchodneMeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Adresa" type="{datatypes.konanie.verejnost.ru.sk.hp.com}Adresa" minOccurs="0"/&gt;
 *         &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Spravca", propOrder = {
    "znacka",
    "datumZapisu",
    "meno",
    "priezvisko",
    "titulPredMenom",
    "titulZaMenom",
    "datumNarodenia",
    "obchodneMeno",
    "ico",
    "adresa",
    "telefon",
    "email"
})
public class Spravca {

    @XmlElement(name = "Znacka", required = true)
    protected String znacka;
    @XmlElement(name = "DatumZapisu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZapisu;
    @XmlElement(name = "Meno", required = true)
    protected String meno;
    @XmlElement(name = "Priezvisko", required = true)
    protected String priezvisko;
    @XmlElement(name = "TitulPredMenom")
    protected String titulPredMenom;
    @XmlElement(name = "TitulZaMenom")
    protected String titulZaMenom;
    @XmlElement(name = "DatumNarodenia")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNarodenia;
    @XmlElement(name = "ObchodneMeno")
    protected String obchodneMeno;
    @XmlElement(name = "Ico")
    protected String ico;
    @XmlElement(name = "Adresa")
    protected Adresa adresa;
    @XmlElement(name = "Telefon")
    protected String telefon;
    @XmlElement(name = "Email")
    protected String email;

    /**
     * Gets the value of the znacka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZnacka() {
        return znacka;
    }

    /**
     * Sets the value of the znacka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZnacka(String value) {
        this.znacka = value;
    }

    /**
     * Gets the value of the datumZapisu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZapisu() {
        return datumZapisu;
    }

    /**
     * Sets the value of the datumZapisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZapisu(XMLGregorianCalendar value) {
        this.datumZapisu = value;
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
     * Gets the value of the datumNarodenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNarodenia() {
        return datumNarodenia;
    }

    /**
     * Sets the value of the datumNarodenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNarodenia(XMLGregorianCalendar value) {
        this.datumNarodenia = value;
    }

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

}
