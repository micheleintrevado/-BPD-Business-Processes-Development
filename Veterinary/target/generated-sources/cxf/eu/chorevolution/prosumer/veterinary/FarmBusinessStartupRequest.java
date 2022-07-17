
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per farmBusinessStartupRequest complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="farmBusinessStartupRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="farmBusinessStartupRequestForm" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}farmBusinessStartupRequestFormDetails"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessStartupRequest", propOrder = {
    "farmBusinessStartupRequestForm"
})
public class FarmBusinessStartupRequest {

    @XmlElement(required = true)
    protected FarmBusinessStartupRequestFormDetails farmBusinessStartupRequestForm;

    /**
     * Recupera il valore della proprietà farmBusinessStartupRequestForm.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public FarmBusinessStartupRequestFormDetails getFarmBusinessStartupRequestForm() {
        return farmBusinessStartupRequestForm;
    }

    /**
     * Imposta il valore della proprietà farmBusinessStartupRequestForm.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public void setFarmBusinessStartupRequestForm(FarmBusinessStartupRequestFormDetails value) {
        this.farmBusinessStartupRequestForm = value;
    }

}
