
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per receiveFarmRegistrationResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="receiveFarmRegistrationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}choreographyInstanceRequest"/&gt;
 *         &lt;element name="senderParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="choreographyTaskName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputMessageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/registryoffice}farmRegistrationResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveFarmRegistrationResponseType", propOrder = {
    "choreographyId",
    "senderParticipantName",
    "receiverParticipantName",
    "choreographyTaskName",
    "outputMessageName",
    "outputMessageData"
})
public class ReceiveFarmRegistrationResponseType {

    @XmlElement(required = true)
    protected ChoreographyInstanceRequest choreographyId;
    @XmlElement(required = true)
    protected String senderParticipantName;
    @XmlElement(required = true)
    protected String receiverParticipantName;
    @XmlElement(required = true)
    protected String choreographyTaskName;
    @XmlElement(required = true)
    protected String outputMessageName;
    @XmlElement(required = true)
    protected FarmRegistrationResponse outputMessageData;

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
     * Recupera il valore della proprietà outputMessageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMessageName() {
        return outputMessageName;
    }

    /**
     * Imposta il valore della proprietà outputMessageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMessageName(String value) {
        this.outputMessageName = value;
    }

    /**
     * Recupera il valore della proprietà outputMessageData.
     * 
     * @return
     *     possible object is
     *     {@link FarmRegistrationResponse }
     *     
     */
    public FarmRegistrationResponse getOutputMessageData() {
        return outputMessageData;
    }

    /**
     * Imposta il valore della proprietà outputMessageData.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmRegistrationResponse }
     *     
     */
    public void setOutputMessageData(FarmRegistrationResponse value) {
        this.outputMessageData = value;
    }

}
