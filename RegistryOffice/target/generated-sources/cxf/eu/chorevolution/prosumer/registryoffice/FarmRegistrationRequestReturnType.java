
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmRegistrationRequestReturnType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmRegistrationRequestReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmRegistrationRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmRegistrationRequestReturnType", propOrder = {
    "inputMessageData"
})
public class FarmRegistrationRequestReturnType {

    @XmlElement(required = true)
    protected FarmRegistrationRequest inputMessageData;

    /**
     * Recupera il valore della proprietà inputMessageData.
     * 
     * @return
     *     possible object is
     *     {@link FarmRegistrationRequest }
     *     
     */
    public FarmRegistrationRequest getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Imposta il valore della proprietà inputMessageData.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmRegistrationRequest }
     *     
     */
    public void setInputMessageData(FarmRegistrationRequest value) {
        this.inputMessageData = value;
    }

}
