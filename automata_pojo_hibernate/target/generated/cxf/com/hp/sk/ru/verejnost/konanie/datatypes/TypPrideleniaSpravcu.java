
package com.hp.sk.ru.verejnost.konanie.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypPrideleniaSpravcu.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypPrideleniaSpravcu"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GENEROVANY"/&gt;
 *     &lt;enumeration value="VYMENOVANY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypPrideleniaSpravcu")
@XmlEnum
public enum TypPrideleniaSpravcu {

    GENEROVANY,
    VYMENOVANY;

    public String value() {
        return name();
    }

    public static TypPrideleniaSpravcu fromValue(String v) {
        return valueOf(v);
    }

}
