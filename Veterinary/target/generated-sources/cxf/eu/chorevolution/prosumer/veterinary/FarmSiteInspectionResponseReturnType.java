
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmSiteInspectionResponseReturnType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmSiteInspectionResponseReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}farmSiteInspectionResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
