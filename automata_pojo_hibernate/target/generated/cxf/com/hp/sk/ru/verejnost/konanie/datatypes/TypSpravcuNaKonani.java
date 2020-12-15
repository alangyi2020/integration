
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypSpravcuNaKonani.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypSpravcuNaKonani"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RIADNY"/&gt;
 *     &lt;enumeration value="PREDBEZNY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypSpravcuNaKonani")
@XmlEnum
public enum TypSpravcuNaKonani {

    RIADNY,
    PREDBEZNY;

    public String value() {
        return name();
    }

    public static TypSpravcuNaKonani fromValue(String v) {
        return valueOf(v);
    }

}
