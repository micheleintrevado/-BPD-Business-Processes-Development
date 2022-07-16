//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.07.16 alle 06:55:50 PM CEST 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="farmBusinessStartupRequestForm" type="{http://eu.chorevolution.farmbusinessstartup/types}farmBusinessStartupRequestFormDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "farmBusinessStartupRequestForm"
})
@XmlRootElement(name = "farmBusinessStartupRequest")
public class FarmBusinessStartupRequest {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected FarmBusinessStartupRequestFormDetails farmBusinessStartupRequestForm;

    /**
     * Recupera il valore della proprietà requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Imposta il valore della proprietà requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Recupera il valore della proprietà farmBusinessStartupRequestForm.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public FarmBusinessStartupRequestFormDetails getFarmBusinessStartupRequestForm() {
        return farmBusinessStartupRequestForm;
    }

    /**
     * Imposta il valore della proprietà farmBusinessStartupRequestForm.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupRequestFormDetails }
     *     
     */
    public void setFarmBusinessStartupRequestForm(FarmBusinessStartupRequestFormDetails value) {
        this.farmBusinessStartupRequestForm = value;
    }

}
