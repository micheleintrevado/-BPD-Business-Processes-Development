
package eu.chorevolution.prosumer.veterinary;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Classe Java per farmSiteInspectionRequest complex type.
 * 
 * &lt;p&gt;Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="farmSiteInspectionRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="farmName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="siteAddress" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}addressDetails"/&amp;gt;
 *         &amp;lt;element name="farmSurface" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="productionType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}productionTypology"/&amp;gt;
 *         &amp;lt;element name="breedingMethodologyType" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}breedingMethodTypology"/&amp;gt;
 *         &amp;lt;element name="siteInspectionDeadline" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmSiteInspectionRequest", propOrder = {
    "farmName",
    "companyName",
    "siteAddress",
    "farmSurface",
    "productionType",
    "breedingMethodologyType",
    "siteInspectionDeadline"
})
public class FarmSiteInspectionRequest {

    @XmlElement(required = true)
    protected String farmName;
    @XmlElement(required = true)
    protected String companyName;
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
    protected Date siteInspectionDeadline;

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
     * Recupera il valore della proprietà siteInspectionDeadline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getSiteInspectionDeadline() {
        return siteInspectionDeadline;
    }

    /**
     * Imposta il valore della proprietà siteInspectionDeadline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteInspectionDeadline(Date value) {
        this.siteInspectionDeadline = value;
    }

}
