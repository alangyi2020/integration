
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FyzickaOsoba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FyzickaOsoba"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{datatypes.konanie.verejnost.ru.sk.hp.com}Osoba"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Meno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Priezvisko" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TitulPredMenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitulZaMenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RodneCislo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatumNarodenia" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="StatneObcianstvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FyzickaOsoba", propOrder = {
    "meno",
    "priezvisko",
    "titulPredMenom",
    "titulZaMenom",
    "rodneCislo",
    "datumNarodenia",
    "statneObcianstvo"
})
public class FyzickaOsoba
    extends Osoba
{

    @XmlElement(name = "Meno", required = true)
    protected String meno;
    @XmlElement(name = "Priezvisko", required = true)
    protected String priezvisko;
    @XmlElement(name = "TitulPredMenom")
    protected String titulPredMenom;
    @XmlElement(name = "TitulZaMenom")
    protected String titulZaMenom;
    @XmlElement(name = "RodneCislo", required = true)
    protected String rodneCislo;
    @XmlElement(name = "DatumNarodenia", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNarodenia;
    @XmlElement(name = "StatneObcianstvo")
    protected String statneObcianstvo;

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
     * Gets the value of the rodneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodneCislo() {
        return rodneCislo;
    }

    /**
     * Sets the value of the rodneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodneCislo(String value) {
        this.rodneCislo = value;
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
     * Gets the value of the statneObcianstvo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatneObcianstvo() {
        return statneObcianstvo;
    }

    /**
     * Sets the value of the statneObcianstvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatneObcianstvo(String value) {
        this.statneObcianstvo = value;
    }

}
