
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmSiteInspectionResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmSiteInspectionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="siteInspectionVerbal" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}veterinarySiteInspectionDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmSiteInspectionResponse", propOrder = {
    "siteInspectionVerbal"
})
public class FarmSiteInspectionResponse {

    @XmlElement(required = true)
    protected VeterinarySiteInspectionDetails siteInspectionVerbal;

    /**
     * Recupera il valore della proprietà siteInspectionVerbal.
     * 
     * @return
     *     possible object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public VeterinarySiteInspectionDetails getSiteInspectionVerbal() {
        return siteInspectionVerbal;
    }

    /**
     * Imposta il valore della proprietà siteInspectionVerbal.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinarySiteInspectionDetails }
     *     
     */
    public void setSiteInspectionVerbal(VeterinarySiteInspectionDetails value) {
        this.siteInspectionVerbal = value;
    }

}
