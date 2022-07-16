//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.07.16 alle 06:55:50 PM CEST 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.univaq.disim.bpd.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.univaq.disim.bpd.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FarmBusinessStartupRequest }
     * 
     */
    public FarmBusinessStartupRequest createFarmBusinessStartupRequest() {
        return new FarmBusinessStartupRequest();
    }

    /**
     * Create an instance of {@link FarmBusinessStartupRequestFormDetails }
     * 
     */
    public FarmBusinessStartupRequestFormDetails createFarmBusinessStartupRequestFormDetails() {
        return new FarmBusinessStartupRequestFormDetails();
    }

    /**
     * Create an instance of {@link FarmSiteInspectionRequest }
     * 
     */
    public FarmSiteInspectionRequest createFarmSiteInspectionRequest() {
        return new FarmSiteInspectionRequest();
    }

    /**
     * Create an instance of {@link VeterinarySiteInspectionDetails }
     * 
     */
    public VeterinarySiteInspectionDetails createVeterinarySiteInspectionDetails() {
        return new VeterinarySiteInspectionDetails();
    }

    /**
     * Create an instance of {@link FarmRegistrationNotification }
     * 
     */
    public FarmRegistrationNotification createFarmRegistrationNotification() {
        return new FarmRegistrationNotification();
    }

    /**
     * Create an instance of {@link AddressDetails }
     * 
     */
    public AddressDetails createAddressDetails() {
        return new AddressDetails();
    }

    /**
     * Create an instance of {@link PersonData }
     * 
     */
    public PersonData createPersonData() {
        return new PersonData();
    }

    /**
     * Create an instance of {@link FarmDetails }
     * 
     */
    public FarmDetails createFarmDetails() {
        return new FarmDetails();
    }

}
