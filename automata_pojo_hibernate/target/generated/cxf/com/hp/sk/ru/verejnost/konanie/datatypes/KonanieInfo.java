
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KonanieInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KonanieInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SpisovaZnackaSpravcu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpisovaZnackaSudu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Typ" type="{datatypes.konanie.verejnost.ru.sk.hp.com}KonanieTyp" minOccurs="0"/&gt;
 *         &lt;element name="DatumZacatiaKonania" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DatumZacatiaProcesu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DatumUkonceniaProcesu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DovodUkonceniaProcesu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatumPodania" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Dlznik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DlznikIco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DlznikDatumNarodenia" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PoslednaUdalost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatumPoslednejUdalosti" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Sud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SudNazov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Spravca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypSpravcu" type="{datatypes.konanie.verejnost.ru.sk.hp.com}TypSpravcuNaKonani" minOccurs="0"/&gt;
 *         &lt;element name="TypPrideleniaSpravcu" type="{datatypes.konanie.verejnost.ru.sk.hp.com}TypPrideleniaSpravcu" minOccurs="0"/&gt;
 *         &lt;element name="StavKonania" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KonanieInfo", propOrder = {
    "id",
    "spisovaZnackaSpravcu",
    "spisovaZnackaSudu",
    "typ",
    "datumZacatiaKonania",
    "datumZacatiaProcesu",
    "datumUkonceniaProcesu",
    "dovodUkonceniaProcesu",
    "datumPodania",
    "dlznik",
    "dlznikIco",
    "dlznikDatumNarodenia",
    "poslednaUdalost",
    "datumPoslednejUdalosti",
    "sud",
    "sudNazov",
    "spravca",
    "typSpravcu",
    "typPrideleniaSpravcu",
    "stavKonania"
})
public class KonanieInfo {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "SpisovaZnackaSpravcu", required = true)
    protected String spisovaZnackaSpravcu;
    @XmlElement(name = "SpisovaZnackaSudu", required = true)
    protected String spisovaZnackaSudu;
    @XmlElement(name = "Typ")
    @XmlSchemaType(name = "string")
    protected KonanieTyp typ;
    @XmlElement(name = "DatumZacatiaKonania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZacatiaKonania;
    @XmlElement(name = "DatumZacatiaProcesu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZacatiaProcesu;
    @XmlElement(name = "DatumUkonceniaProcesu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumUkonceniaProcesu;
    @XmlElement(name = "DovodUkonceniaProcesu")
    protected String dovodUkonceniaProcesu;
    @XmlElement(name = "DatumPodania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodania;
    @XmlElement(name = "Dlznik")
    protected String dlznik;
    @XmlElement(name = "DlznikIco")
    protected String dlznikIco;
    @XmlElement(name = "DlznikDatumNarodenia")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dlznikDatumNarodenia;
    @XmlElement(name = "PoslednaUdalost")
    protected String poslednaUdalost;
    @XmlElement(name = "DatumPoslednejUdalosti")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPoslednejUdalosti;
    @XmlElement(name = "Sud")
    protected String sud;
    @XmlElement(name = "SudNazov")
    protected String sudNazov;
    @XmlElement(name = "Spravca")
    protected String spravca;
    @XmlElement(name = "TypSpravcu")
    @XmlSchemaType(name = "string")
    protected TypSpravcuNaKonani typSpravcu;
    @XmlElement(name = "TypPrideleniaSpravcu")
    @XmlSchemaType(name = "string")
    protected TypPrideleniaSpravcu typPrideleniaSpravcu;
    @XmlElement(name = "StavKonania", required = true)
    protected String stavKonania;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the spisovaZnackaSpravcu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpisovaZnackaSpravcu() {
        return spisovaZnackaSpravcu;
    }

    /**
     * Sets the value of the spisovaZnackaSpravcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpisovaZnackaSpravcu(String value) {
        this.spisovaZnackaSpravcu = value;
    }

    /**
     * Gets the value of the spisovaZnackaSudu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpisovaZnackaSudu() {
        return spisovaZnackaSudu;
    }

    /**
     * Sets the value of the spisovaZnackaSudu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpisovaZnackaSudu(String value) {
        this.spisovaZnackaSudu = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link KonanieTyp }
     *     
     */
    public KonanieTyp getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonanieTyp }
     *     
     */
    public void setTyp(KonanieTyp value) {
        this.typ = value;
    }

    /**
     * Gets the value of the datumZacatiaKonania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZacatiaKonania() {
        return datumZacatiaKonania;
    }

    /**
     * Sets the value of the datumZacatiaKonania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZacatiaKonania(XMLGregorianCalendar value) {
        this.datumZacatiaKonania = value;
    }

    /**
     * Gets the value of the datumZacatiaProcesu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZacatiaProcesu() {
        return datumZacatiaProcesu;
    }

    /**
     * Sets the value of the datumZacatiaProcesu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZacatiaProcesu(XMLGregorianCalendar value) {
        this.datumZacatiaProcesu = value;
    }

    /**
     * Gets the value of the datumUkonceniaProcesu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumUkonceniaProcesu() {
        return datumUkonceniaProcesu;
    }

    /**
     * Sets the value of the datumUkonceniaProcesu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumUkonceniaProcesu(XMLGregorianCalendar value) {
        this.datumUkonceniaProcesu = value;
    }

    /**
     * Gets the value of the dovodUkonceniaProcesu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDovodUkonceniaProcesu() {
        return dovodUkonceniaProcesu;
    }

    /**
     * Sets the value of the dovodUkonceniaProcesu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDovodUkonceniaProcesu(String value) {
        this.dovodUkonceniaProcesu = value;
    }

    /**
     * Gets the value of the datumPodania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPodania() {
        return datumPodania;
    }

    /**
     * Sets the value of the datumPodania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPodania(XMLGregorianCalendar value) {
        this.datumPodania = value;
    }

    /**
     * Gets the value of the dlznik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlznik() {
        return dlznik;
    }

    /**
     * Sets the value of the dlznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlznik(String value) {
        this.dlznik = value;
    }

    /**
     * Gets the value of the dlznikIco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlznikIco() {
        return dlznikIco;
    }

    /**
     * Sets the value of the dlznikIco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlznikIco(String value) {
        this.dlznikIco = value;
    }

    /**
     * Gets the value of the dlznikDatumNarodenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDlznikDatumNarodenia() {
        return dlznikDatumNarodenia;
    }

    /**
     * Sets the value of the dlznikDatumNarodenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDlznikDatumNarodenia(XMLGregorianCalendar value) {
        this.dlznikDatumNarodenia = value;
    }

    /**
     * Gets the value of the poslednaUdalost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoslednaUdalost() {
        return poslednaUdalost;
    }

    /**
     * Sets the value of the poslednaUdalost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoslednaUdalost(String value) {
        this.poslednaUdalost = value;
    }

    /**
     * Gets the value of the datumPoslednejUdalosti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPoslednejUdalosti() {
        return datumPoslednejUdalosti;
    }

    /**
     * Sets the value of the datumPoslednejUdalosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPoslednejUdalosti(XMLGregorianCalendar value) {
        this.datumPoslednejUdalosti = value;
    }

    /**
     * Gets the value of the sud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSud() {
        return sud;
    }

    /**
     * Sets the value of the sud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSud(String value) {
        this.sud = value;
    }

    /**
     * Gets the value of the sudNazov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSudNazov() {
        return sudNazov;
    }

    /**
     * Sets the value of the sudNazov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSudNazov(String value) {
        this.sudNazov = value;
    }

    /**
     * Gets the value of the spravca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpravca() {
        return spravca;
    }

    /**
     * Sets the value of the spravca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpravca(String value) {
        this.spravca = value;
    }

    /**
     * Gets the value of the typSpravcu property.
     * 
     * @return
     *     possible object is
     *     {@link TypSpravcuNaKonani }
     *     
     */
    public TypSpravcuNaKonani getTypSpravcu() {
        return typSpravcu;
    }

    /**
     * Sets the value of the typSpravcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypSpravcuNaKonani }
     *     
     */
    public void setTypSpravcu(TypSpravcuNaKonani value) {
        this.typSpravcu = value;
    }

    /**
     * Gets the value of the typPrideleniaSpravcu property.
     * 
     * @return
     *     possible object is
     *     {@link TypPrideleniaSpravcu }
     *     
     */
    public TypPrideleniaSpravcu getTypPrideleniaSpravcu() {
        return typPrideleniaSpravcu;
    }

    /**
     * Sets the value of the typPrideleniaSpravcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypPrideleniaSpravcu }
     *     
     */
    public void setTypPrideleniaSpravcu(TypPrideleniaSpravcu value) {
        this.typPrideleniaSpravcu = value;
    }

    /**
     * Gets the value of the stavKonania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStavKonania() {
        return stavKonania;
    }

    /**
     * Sets the value of the stavKonania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStavKonania(String value) {
        this.stavKonania = value;
    }

}
