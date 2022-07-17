
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per breedingMethodTypology.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="breedingMethodTypology"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="intensive"/&amp;gt;
 *     &amp;lt;enumeration value="free-range intensive"/&amp;gt;
 *     &amp;lt;enumeration value="transhumant"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "breedingMethodTypology")
@XmlEnum
public enum BreedingMethodTypology {

    @XmlEnumValue("intensive")
    INTENSIVE("intensive"),
    @XmlEnumValue("free-range intensive")
    FREE_RANGE_INTENSIVE("free-range intensive"),
    @XmlEnumValue("transhumant")
    TRANSHUMANT("transhumant");
    private final String value;

    BreedingMethodTypology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreedingMethodTypology fromValue(String v) {
        for (BreedingMethodTypology c: BreedingMethodTypology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
