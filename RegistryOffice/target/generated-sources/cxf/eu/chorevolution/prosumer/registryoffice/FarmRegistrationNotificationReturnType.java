
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmRegistrationNotificationReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmRegistrationNotificationReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmRegistrationNotification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmRegistrationNotificationReturnType", propOrder = {
    "inputMessageData"
})
public class FarmRegistrationNotificationReturnType {

    @XmlElement(required = true)
    protected FarmRegistrationNotification inputMessageData;

    /**
     * Gets the value of the inputMessageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmRegistrationNotification }
     *     
     */
    public FarmRegistrationNotification getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Sets the value of the inputMessageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmRegistrationNotification }
     *     
     */
    public void setInputMessageData(FarmRegistrationNotification value) {
        this.inputMessageData = value;
    }

}
