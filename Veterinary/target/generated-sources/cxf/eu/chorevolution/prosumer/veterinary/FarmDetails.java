
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java per farmDetails complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="farmDetails"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="farmName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="companyType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}companyTypology"/&amp;gt;
 *         &amp;lt;element name="companyHeadquarter" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}addressDetails"/&amp;gt;
 *         &amp;lt;element name="farmSurface" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="vatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="productionType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}productionTypology"/&amp;gt;
 *         &amp;lt;element name="breedingMethodologyType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}breedingMethodTypology"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * Recupera il valore della proprietà farmName.
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
     * Imposta il valore della proprietà farmName.
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
     * Recupera il valore della proprietà companyName.
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
     * Imposta il valore della proprietà companyName.
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
     * Recupera il valore della proprietà companyType.
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
     * Imposta il valore della proprietà companyType.
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
     * Recupera il valore della proprietà companyHeadquarter.
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
     * Imposta il valore della proprietà companyHeadquarter.
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
     * Recupera il valore della proprietà phoneNumber.
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
     * Imposta il valore della proprietà phoneNumber.
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
     * Recupera il valore della proprietà email.
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
     * Imposta il valore della proprietà email.
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
     * Recupera il valore della proprietà vatNumber.
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
     * Imposta il valore della proprietà vatNumber.
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

}
