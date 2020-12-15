
package com.hp.sk.ru.verejnost.konanie.datatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Konanie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Konanie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SpisovaZnackaSpravcu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpisovaZnackaSudu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Typ" type="{datatypes.konanie.verejnost.ru.sk.hp.com}KonanieTyp" minOccurs="0"/&gt;
 *         &lt;element name="Navrhovatel" type="{datatypes.konanie.verejnost.ru.sk.hp.com}Osoba" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Dlznik" type="{datatypes.konanie.verejnost.ru.sk.hp.com}Osoba"/&gt;
 *         &lt;element name="Sud" type="{datatypes.konanie.verejnost.ru.sk.hp.com}Sud"/&gt;
 *         &lt;element name="Sudca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Spravca" type="{datatypes.konanie.verejnost.ru.sk.hp.com}Spravca"/&gt;
 *         &lt;element name="DatumZacatiaKonania" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DatumZacatiaProcesu" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TypSpravcu" type="{datatypes.konanie.verejnost.ru.sk.hp.com}TypSpravcuNaKonani" minOccurs="0"/&gt;
 *         &lt;element name="TypPrideleniaSpravcu" type="{datatypes.konanie.verejnost.ru.sk.hp.com}TypPrideleniaSpravcu" minOccurs="0"/&gt;
 *         &lt;element name="TypKonaniaPodlaUzemnejPlatnosti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Konanie", propOrder = {
    "id",
    "spisovaZnackaSpravcu",
    "spisovaZnackaSudu",
    "typ",
    "navrhovatel",
    "dlznik",
    "sud",
    "sudca",
    "spravca",
    "datumZacatiaKonania",
    "datumZacatiaProcesu",
    "typSpravcu",
    "typPrideleniaSpravcu",
    "typKonaniaPodlaUzemnejPlatnosti"
})
@XmlSeeAlso({
    Konkurz.class,
    Restrukturalizacia.class,
    OddlzenieKonkurz.class,
    OddlzenieSplatkovyKalendar.class
})
public class Konanie {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "SpisovaZnackaSpravcu", required = true)
    protected String spisovaZnackaSpravcu;
    @XmlElement(name = "SpisovaZnackaSudu", required = true)
    protected String spisovaZnackaSudu;
    @XmlElement(name = "Typ")
    @XmlSchemaType(name = "string")
    protected KonanieTyp typ;
    @XmlElement(name = "Navrhovatel", required = true)
    protected List<Osoba> navrhovatel;
    @XmlElement(name = "Dlznik", required = true)
    protected Osoba dlznik;
    @XmlElement(name = "Sud", required = true)
    protected Sud sud;
    @XmlElement(name = "Sudca")
    protected String sudca;
    @XmlElement(name = "Spravca", required = true)
    protected Spravca spravca;
    @XmlElement(name = "DatumZacatiaKonania", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZacatiaKonania;
    @XmlElement(name = "DatumZacatiaProcesu", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZacatiaProcesu;
    @XmlElement(name = "TypSpravcu")
    @XmlSchemaType(name = "string")
    protected TypSpravcuNaKonani typSpravcu;
    @XmlElement(name = "TypPrideleniaSpravcu")
    @XmlSchemaType(name = "string")
    protected TypPrideleniaSpravcu typPrideleniaSpravcu;
    @XmlElement(name = "TypKonaniaPodlaUzemnejPlatnosti")
    protected String typKonaniaPodlaUzemnejPlatnosti;

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
     * Gets the value of the navrhovatel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navrhovatel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavrhovatel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Osoba }
     * 
     * 
     */
    public List<Osoba> getNavrhovatel() {
        if (navrhovatel == null) {
            navrhovatel = new ArrayList<Osoba>();
        }
        return this.navrhovatel;
    }

    /**
     * Gets the value of the dlznik property.
     * 
     * @return
     *     possible object is
     *     {@link Osoba }
     *     
     */
    public Osoba getDlznik() {
        return dlznik;
    }

    /**
     * Sets the value of the dlznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Osoba }
     *     
     */
    public void setDlznik(Osoba value) {
        this.dlznik = value;
    }

    /**
     * Gets the value of the sud property.
     * 
     * @return
     *     possible object is
     *     {@link Sud }
     *     
     */
    public Sud getSud() {
        return sud;
    }

    /**
     * Sets the value of the sud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sud }
     *     
     */
    public void setSud(Sud value) {
        this.sud = value;
    }

    /**
     * Gets the value of the sudca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSudca() {
        return sudca;
    }

    /**
     * Sets the value of the sudca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSudca(String value) {
        this.sudca = value;
    }

    /**
     * Gets the value of the spravca property.
     * 
     * @return
     *     possible object is
     *     {@link Spravca }
     *     
     */
    public Spravca getSpravca() {
        return spravca;
    }

    /**
     * Sets the value of the spravca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravca }
     *     
     */
    public void setSpravca(Spravca value) {
        this.spravca = value;
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
     * Gets the value of the typKonaniaPodlaUzemnejPlatnosti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypKonaniaPodlaUzemnejPlatnosti() {
        return typKonaniaPodlaUzemnejPlatnosti;
    }

    /**
     * Sets the value of the typKonaniaPodlaUzemnejPlatnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypKonaniaPodlaUzemnejPlatnosti(String value) {
        this.typKonaniaPodlaUzemnejPlatnosti = value;
    }

}
