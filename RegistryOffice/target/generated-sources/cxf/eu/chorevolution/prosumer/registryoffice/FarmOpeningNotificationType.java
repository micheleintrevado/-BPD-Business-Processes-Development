
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmOpeningNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmOpeningNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}choreographyInstanceRequest"/&gt;
 *         &lt;element name="senderParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="choreographyTaskName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputMessageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmOpeningNotification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmOpeningNotificationType", propOrder = {
    "choreographyId",
    "senderParticipantName",
    "receiverParticipantName",
    "choreographyTaskName",
    "inputMessageName",
    "inputMessageData"
})
public class FarmOpeningNotificationType {

    @XmlElement(required = true)
    protected ChoreographyInstanceRequest choreographyId;
    @XmlElement(required = true)
    protected String senderParticipantName;
    @XmlElement(required = true)
    protected String receiverParticipantName;
    @XmlElement(required = true)
    protected String choreographyTaskName;
    @XmlElement(required = true)
    protected String inputMessageName;
    @XmlElement(required = true)
    protected FarmOpeningNotification inputMessageData;

    /**
     * Gets the value of the choreographyId property.
     * 
     * @return
     *     possible object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public ChoreographyInstanceRequest getChoreographyId() {
        return choreographyId;
    }

    /**
     * Sets the value of the choreographyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public void setChoreographyId(ChoreographyInstanceRequest value) {
        this.choreographyId = value;
    }

    /**
     * Gets the value of the senderParticipantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderParticipantName() {
        return senderParticipantName;
    }

    /**
     * Sets the value of the senderParticipantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderParticipantName(String value) {
        this.senderParticipantName = value;
    }

    /**
     * Gets the value of the receiverParticipantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverParticipantName() {
        return receiverParticipantName;
    }

    /**
     * Sets the value of the receiverParticipantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverParticipantName(String value) {
        this.receiverParticipantName = value;
    }

    /**
     * Gets the value of the choreographyTaskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoreographyTaskName() {
        return choreographyTaskName;
    }

    /**
     * Sets the value of the choreographyTaskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoreographyTaskName(String value) {
        this.choreographyTaskName = value;
    }

    /**
     * Gets the value of the inputMessageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMessageName() {
        return inputMessageName;
    }

    /**
     * Sets the value of the inputMessageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMessageName(String value) {
        this.inputMessageName = value;
    }

    /**
     * Gets the value of the inputMessageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmOpeningNotification }
     *     
     */
    public FarmOpeningNotification getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Sets the value of the inputMessageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmOpeningNotification }
     *     
     */
    public void setInputMessageData(FarmOpeningNotification value) {
        this.inputMessageData = value;
    }

}
