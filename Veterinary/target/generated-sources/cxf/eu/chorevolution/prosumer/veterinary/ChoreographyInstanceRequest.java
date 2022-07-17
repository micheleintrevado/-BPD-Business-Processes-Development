
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per choreographyInstanceRequest complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="choreographyInstanceRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="choreographyId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "choreographyInstanceRequest", propOrder = {
    "choreographyId"
})
public class ChoreographyInstanceRequest {

    @XmlElement(required = true)
    protected String choreographyId;

    /**
     * Recupera il valore della proprietà choreographyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoreographyId() {
        return choreographyId;
    }

    /**
     * Imposta il valore della proprietà choreographyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoreographyId(String value) {
        this.choreographyId = value;
    }

}
