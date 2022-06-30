
package eu.chorevolution.farmbusinessstartup.provider.municipality;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productionTypology.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="productionTypology"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="weaning center"/&gt;
 *     &lt;enumeration value="fattening for self-consumption"/&gt;
 *     &lt;enumeration value="fattening cattle adults"/&gt;
 *     &lt;enumeration value="fattening calf white meat"/&gt;
 *     &lt;enumeration value="milk production"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
