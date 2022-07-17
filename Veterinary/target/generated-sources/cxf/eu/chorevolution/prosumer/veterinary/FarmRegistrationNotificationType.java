
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per farmRegistrationNotificationType complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="farmRegistrationNotificationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}choreographyInstanceRequest"/&amp;gt;
 *         &amp;lt;element name="senderParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="receiverParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="choreographyTaskName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="inputMessageName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}farmRegistrationNotification"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmRegistrationNotificationType", propOrder = {
    "choreographyId",
    "senderParticipantName",
    "receiverParticipantName",
    "choreographyTaskName",
    "inputMessageName",
    "inputMessageData"
})
public class FarmRegistrationNotificationType {

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
    protected FarmRegistrationNotification inputMessageData;

    /**
     * Recupera il valore della proprietà choreographyId.
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
     * Imposta il valore della proprietà choreographyId.
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
     * Recupera il valore della proprietà senderParticipantName.
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
     * Imposta il valore della proprietà senderParticipantName.
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
     * Recupera il valore della proprietà receiverParticipantName.
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
     * Imposta il valore della proprietà receiverParticipantName.
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
     * Recupera il valore della proprietà choreographyTaskName.
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
     * Imposta il valore della proprietà choreographyTaskName.
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
     * Recupera il valore della proprietà inputMessageName.
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
     * Imposta il valore della proprietà inputMessageName.
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
     * Recupera il valore della proprietà inputMessageData.
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
     * Imposta il valore della proprietà inputMessageData.
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
