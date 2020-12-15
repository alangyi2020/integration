
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KonanieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KonanieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESTRUKTURALIZACIA"/&gt;
 *     &lt;enumeration value="KONKURZ"/&gt;
 *     &lt;enumeration value="ODDLZENIE_KONKURZ"/&gt;
 *     &lt;enumeration value="ODDLZENIE_SPLATKOVY_KALENDAR"/&gt;
 *     &lt;enumeration value="INE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KonanieTyp")
@XmlEnum
public enum KonanieTyp {

    RESTRUKTURALIZACIA,
    KONKURZ,
    ODDLZENIE_KONKURZ,
    ODDLZENIE_SPLATKOVY_KALENDAR,
    INE;

    public String value() {
        return name();
    }

    public static KonanieTyp fromValue(String v) {
        return valueOf(v);
    }

}
