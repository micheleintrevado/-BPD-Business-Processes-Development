
package eu.chorevolution.farmbusinessstartup.provider.municipality;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="companyType" type="{http://eu.chorevolution.farmbusinessstartup/services/municipality}companyTypology"/&gt;
 *         &lt;element name="companyHeadquarter" type="{http://eu.chorevolution.farmbusinessstartup/services/municipality}addressDetails"/&gt;
 *         &lt;element name="farmSurface" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionType" type="{http://eu.chorevolution.farmbusinessstartup/services/municipality}productionTypology"/&gt;
 *         &lt;element name="breedingMethodologyType" type="{http://eu.chorevolution.farmbusinessstartup/services/municipality}breedingMethodTypology"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmDetails", propOrder = {
    "farmName",
    "companyName",
    "companyType",
    "companyHeadquarter",
    "farmSurface",
    "phoneNumber",
    "email",
    "vatNumber",
    "productionType",
    "breedingMethodologyType"
})
public class FarmDetails {

    @XmlElement(required = true)
    protected String farmName;
    @XmlElement(required = true)
    protected String companyName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CompanyTypology companyType;
    @XmlElement(required = true)
    protected AddressDetails companyHeadquarter;
    protected int farmSurface;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String vatNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductionTypology productionType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BreedingMethodTypology breedingMethodologyType;

    /**
     * Gets the value of the farmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmName() {
        return farmName;
    }

    /**
     * Sets the value of the farmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmName(String value) {
        this.farmName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyTypology }
     *     
     */
    public CompanyTypology getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyTypology }
     *     
     */
    public void setCompanyType(CompanyTypology value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the companyHeadquarter property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetails }
     *     
     */
    public AddressDetails getCompanyHeadquarter() {
        return companyHeadquarter;
    }

    /**
     * Sets the value of the companyHeadquarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetails }
     *     
     */
    public void setCompanyHeadquarter(AddressDetails value) {
        this.companyHeadquarter = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
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

}
