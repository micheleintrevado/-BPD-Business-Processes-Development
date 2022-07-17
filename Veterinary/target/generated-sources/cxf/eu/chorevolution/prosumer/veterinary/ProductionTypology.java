
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per productionTypology.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="productionTypology"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="weaning center"/&amp;gt;
 *     &amp;lt;enumeration value="fattening for self-consumption"/&amp;gt;
 *     &amp;lt;enumeration value="fattening cattle adults"/&amp;gt;
 *     &amp;lt;enumeration value="fattening calf white meat"/&amp;gt;
 *     &amp;lt;enumeration value="milk production"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "productionTypology")
@XmlEnum
public enum ProductionTypology {

    @XmlEnumValue("weaning center")
    WEANING_CENTER("weaning center"),
    @XmlEnumValue("fattening for self-consumption")
    FATTENING_FOR_SELF_CONSUMPTION("fattening for self-consumption"),
    @XmlEnumValue("fattening cattle adults")
    FATTENING_CATTLE_ADULTS("fattening cattle adults"),
    @XmlEnumValue("fattening calf white meat")
    FATTENING_CALF_WHITE_MEAT("fattening calf white meat"),
    @XmlEnumValue("milk production")
    MILK_PRODUCTION("milk production");
    private final String value;

    ProductionTypology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductionTypology fromValue(String v) {
        for (ProductionTypology c: ProductionTypology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
