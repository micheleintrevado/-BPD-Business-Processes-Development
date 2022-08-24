
package eu.chorevolution.prosumer.veterinary;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for veterinarySiteInspectionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="veterinarySiteInspectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="veterinaryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="veterinarySurname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siteAddress" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}addressDetails"/&gt;
 *         &lt;element name="farmSurface" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productionType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}productionTypology"/&gt;
 *         &lt;element name="breedingMethodologyType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}breedingMethodTypology"/&gt;
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
     * Gets the value of the veterinaryName property.
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
     * Sets the value of the veterinaryName property.
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
     * Gets the value of the veterinarySurname property.
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
     * Sets the value of the veterinarySurname property.
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
     * Gets the value of the siteAddress property.
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
     * Sets the value of the siteAddress property.
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
     * Gets the value of the farmSurface property.
     * 
     */
    public int getFarmSurface() {
        return farmSurface;
    }

    /**
     * Sets the value of the farmSurface property.
     * 
     */
    public void setFarmSurface(int value) {
        this.farmSurface = value;
    }

    /**
     * Gets the value of the productionType property.
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
     * Sets the value of the productionType property.
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
     * Gets the value of the breedingMethodologyType property.
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
     * Sets the value of the breedingMethodologyType property.
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
     * Gets the value of the siteInspectionDate property.
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
     * Sets the value of the siteInspectionDate property.
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
     * Gets the value of the referenceLegislation property.
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
     * Sets the value of the referenceLegislation property.
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
