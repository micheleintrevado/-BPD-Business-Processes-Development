
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per farmSiteInspectionResponseReturnType complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="farmSiteInspectionResponseReturnType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}farmSiteInspectionResponse"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmSiteInspectionResponseReturnType", propOrder = {
    "inputMessageData"
})
public class FarmSiteInspectionResponseReturnType {

    @XmlElement(required = true)
    protected FarmSiteInspectionResponse inputMessageData;

    /**
     * Recupera il valore della proprietà inputMessageData.
     * 
     * @return
     *     possible object is
     *     {@link FarmSiteInspectionResponse }
     *     
     */
    public FarmSiteInspectionResponse getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Imposta il valore della proprietà inputMessageData.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmSiteInspectionResponse }
     *     
     */
    public void setInputMessageData(FarmSiteInspectionResponse value) {
        this.inputMessageData = value;
    }

}
