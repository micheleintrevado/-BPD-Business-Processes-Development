
package eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per veterinarySiteInspectionDetails complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="veterinarySiteInspectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="veterinaryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="veterinarySurname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siteAddress" type="{http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister}addressDetails"/&gt;
 *         &lt;element name="farmSurface" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productionType" type="{http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister}productionTypology"/&gt;
 *         &lt;element name="breedingMethodologyType" type="{http://eu.chorevolution.farmbusinessstartup/services/veterinaryregionalregister}breedingMethodTypology"/&gt;
 *         &lt;element name="siteInspectionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="referenceLegislation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "veterinarySiteInspectionDetails", propOrder = {
    "veterinaryName",
    "veterinarySurname",
    "siteAddress",
    "farmSurface",
    "productionType",
    "breedingMethodologyType",
    "siteInspectionDate",
    "referenceLegislation"
})
public class VeterinarySiteInspectionDetails {

    @XmlElement(required = true)
    protected String veterinaryName;
    @XmlElement(required = true)
    protected String veterinarySurname;
    @XmlElement(required = true)
    protected AddressDetails siteAddress;
    protected int farmSurface;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductionTypology productionType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BreedingMethodTypology breedingMethodologyType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date siteInspectionDate;
    @XmlElement(required = true)
    protected String referenceLegislation;

    /**
     * Recupera il valore della proprietà veterinaryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeterinaryName() {
        return veterinaryName;
    }

    /**
     * Imposta il valore della proprietà veterinaryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeterinaryName(String value) {
        this.veterinaryName = value;
    }

    /**
     * Recupera il valore della proprietà veterinarySurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeterinarySurname() {
        return veterinarySurname;
    }

    /**
     * Imposta il valore della proprietà veterinarySurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeterinarySurname(String value) {
        this.veterinarySurname = value;
    }

    /**
     * Recupera il valore della proprietà siteAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetails }
     *     
     */
    public AddressDetails getSiteAddress() {
        return siteAddress;
    }

    /**
     * Imposta il valore della proprietà siteAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetails }
     *     
     */
    public void setSiteAddress(AddressDetails value) {
        this.siteAddress = value;
    }

    /**
     * Recupera il valore della proprietà farmSurface.
     * 
     */
    public int getFarmSurface() {
        return farmSurface;
    }

    /**
     * Imposta il valore della proprietà farmSurface.
     * 
     */
    public void setFarmSurface(int value) {
        this.farmSurface = value;
    }

    /**
     * Recupera il valore della proprietà productionType.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTypology }
     *     
     */
    public ProductionTypology getProductionType() {
        return productionType;
    }

    /**
     * Imposta il valore della proprietà productionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTypology }
     *     
     */
    public void setProductionType(ProductionTypology value) {
        this.productionType = value;
    }

    /**
     * Recupera il valore della proprietà breedingMethodologyType.
     * 
     * @return
     *     possible object is
     *     {@link BreedingMethodTypology }
     *     
     */
    public BreedingMethodTypology getBreedingMethodologyType() {
        return breedingMethodologyType;
    }

    /**
     * Imposta il valore della proprietà breedingMethodologyType.
     * 
     * @param value
     *     allowed object is
     *     {@link BreedingMethodTypology }
     *     
     */
    public void setBreedingMethodologyType(BreedingMethodTypology value) {
        this.breedingMethodologyType = value;
    }

    /**
     * Recupera il valore della proprietà siteInspectionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getSiteInspectionDate() {
        return siteInspectionDate;
    }

    /**
     * Imposta il valore della proprietà siteInspectionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteInspectionDate(Date value) {
        this.siteInspectionDate = value;
    }

    /**
     * Recupera il valore della proprietà referenceLegislation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceLegislation() {
        return referenceLegislation;
    }

    /**
     * Imposta il valore della proprietà referenceLegislation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceLegislation(String value) {
        this.referenceLegislation = value;
    }

}
