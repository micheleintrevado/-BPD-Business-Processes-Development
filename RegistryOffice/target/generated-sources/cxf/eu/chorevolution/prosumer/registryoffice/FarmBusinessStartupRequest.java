
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmBusinessStartupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessStartupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmBusinessStartupRequestForm" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmBusinessStartupRequestFormDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
     * Gets the value of the farmBusinessStartupRequestForm property.
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
     * Sets the value of the farmBusinessStartupRequestForm property.
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
