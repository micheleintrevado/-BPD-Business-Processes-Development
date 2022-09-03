
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmOpeningNotification complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmOpeningNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmOpeningRequestForm" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmBusinessStartupRequestFormDetails"/&gt;
 *         &lt;element name="siteInspectionDetails" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}veterinarySiteInspectionDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
