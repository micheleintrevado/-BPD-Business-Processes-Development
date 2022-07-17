
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per farmSiteInspectionResponse complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="farmSiteInspectionResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="siteInspectionVerbal" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}veterinarySiteInspectionDetails"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
