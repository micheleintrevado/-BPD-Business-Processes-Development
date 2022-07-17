
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per companyTypology.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="companyTypology"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="individual company"/&amp;gt;
 *     &amp;lt;enumeration value="partnership"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "companyTypology")
@XmlEnum
public enum CompanyTypology {

    @XmlEnumValue("individual company")
    INDIVIDUAL_COMPANY("individual company"),
    @XmlEnumValue("partnership")
    PARTNERSHIP("partnership");
    private final String value;

    CompanyTypology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyTypology fromValue(String v) {
        for (CompanyTypology c: CompanyTypology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
