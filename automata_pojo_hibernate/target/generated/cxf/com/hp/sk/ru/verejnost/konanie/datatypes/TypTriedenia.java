
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypTriedenia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypTriedenia"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Relevancia"/&gt;
 *     &lt;enumeration value="DatumZacatiaKonania"/&gt;
 *     &lt;enumeration value="DatumPoslednejUdalosti"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypTriedenia")
@XmlEnum
public enum TypTriedenia {

    @XmlEnumValue("Relevancia")
    RELEVANCIA("Relevancia"),
    @XmlEnumValue("DatumZacatiaKonania")
    DATUM_ZACATIA_KONANIA("DatumZacatiaKonania"),
    @XmlEnumValue("DatumPoslednejUdalosti")
    DATUM_POSLEDNEJ_UDALOSTI("DatumPoslednejUdalosti");
    private final String value;

    TypTriedenia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypTriedenia fromValue(String v) {
        for (TypTriedenia c: TypTriedenia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
