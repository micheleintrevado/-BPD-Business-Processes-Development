
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per farmOpeningNotification complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="farmOpeningNotification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="farmOpeningRequestForm" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}farmBusinessStartupRequestFormDetails"/&amp;gt;
 *         &amp;lt;element name="siteInspectionDetails" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}veterinarySiteInspectionDetails"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmOpeningNotification", propOrder = {
    "farmOpeningRequestForm",
    "siteInspectionDetails"
})
public class FarmOpeningNotification {

    @XmlElement(required = true)
    protected FarmBusinessStartupRequestFormDetails farmOpeningRequestForm;
    @XmlElement(required = true)
    protected VeterinarySiteInspectionDetails siteInspectionDetails;

    /**
     * Recupera il valore della proprietà farmOpeningRequestForm.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public FarmBusinessStartupRequestFormDetails getFarmOpeningRequestForm() {
        return farmOpeningRequestForm;
    }

    /**
     * Imposta il valore della proprietà farmOpeningRequestForm.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public void setFarmOpeningRequestForm(FarmBusinessStartupRequestFormDetails value) {
        this.farmOpeningRequestForm = value;
    }

    /**
     * Recupera il valore della proprietà siteInspectionDetails.
     * 
     * @return
     *     possible object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public VeterinarySiteInspectionDetails getSiteInspectionDetails() {
        return siteInspectionDetails;
    }

    /**
     * Imposta il valore della proprietà siteInspectionDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public void setSiteInspectionDetails(VeterinarySiteInspectionDetails value) {
        this.siteInspectionDetails = value;
    }

}
