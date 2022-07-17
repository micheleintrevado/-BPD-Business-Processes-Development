
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.chorevolution.prosumer.veterinary package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _FarmSiteInspectionRequestElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/veterinary", "farmSiteInspectionRequestElementRequest");
    private final static QName _FarmSiteInspectionRequestElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/veterinary", "farmSiteInspectionRequestElementResponse");
    private final static QName _SendFarmSiteInspectionResponseElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/veterinary", "sendFarmSiteInspectionResponseElementRequest");
    private final static QName _SendFarmSiteInspectionResponseElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/veterinary", "sendFarmSiteInspectionResponseElementResponse");
    private final static QName _FarmRegistrationNotificationElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/veterinary", "farmRegistrationNotificationElementRequest");
    private final static QName _FarmRegistrationNotificationElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/veterinary", "farmRegistrationNotificationElementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.chorevolution.prosumer.veterinary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FarmSiteInspectionRequestType }
     * 
     */
    public FarmSiteInspectionRequestType createFarmSiteInspectionRequestType() {
        return new FarmSiteInspectionRequestType();
    }

    /**
     * Create an instance of {@link FarmSiteInspectionRequestReturnType }
     * 
     */
    public FarmSiteInspectionRequestReturnType createFarmSiteInspectionRequestReturnType() {
        return new FarmSiteInspectionRequestReturnType();
    }

    /**
     * Create an instance of {@link SendRequestType }
     * 
     */
    public SendRequestType createSendRequestType() {
        return new SendRequestType();
    }

    /**
     * Create an instance of {@link FarmSiteInspectionResponseReturnType }
     * 
     */
    public FarmSiteInspectionResponseReturnType createFarmSiteInspectionResponseReturnType() {
        return new FarmSiteInspectionResponseReturnType();
    }

    /**
     * Create an instance of {@link FarmRegistrationNotificationType }
     * 
     */
    public FarmRegistrationNotificationType createFarmRegistrationNotificationType() {
        return new FarmRegistrationNotificationType();
    }

    /**
     * Create an instance of {@link FarmRegistrationNotificationReturnType }
     * 
     */
    public FarmRegistrationNotificationReturnType createFarmRegistrationNotificationReturnType() {
        return new FarmRegistrationNotificationReturnType();
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
     * Create an instance of {@link PersonData }
     * 
     */
    public PersonData createPersonData() {
        return new PersonData();
    }

    /**
     * Create an instance of {@link AddressDetails }
     * 
     */
    public AddressDetails createAddressDetails() {
        return new AddressDetails();
    }

    /**
     * Create an instance of {@link FarmDetails }
     * 
     */
    public FarmDetails createFarmDetails() {
        return new FarmDetails();
    }

    /**
     * Create an instance of {@link FarmSiteInspectionRequest }
     * 
     */
    public FarmSiteInspectionRequest createFarmSiteInspectionRequest() {
        return new FarmSiteInspectionRequest();
    }

    /**
     * Create an instance of {@link FarmSiteInspectionResponse }
     * 
     */
    public FarmSiteInspectionResponse createFarmSiteInspectionResponse() {
        return new FarmSiteInspectionResponse();
    }

    /**
     * Create an instance of {@link VeterinarySiteInspectionDetails }
     * 
     */
    public VeterinarySiteInspectionDetails createVeterinarySiteInspectionDetails() {
        return new VeterinarySiteInspectionDetails();
    }

    /**
     * Create an instance of {@link FarmOpeningNotification }
     * 
     */
    public FarmOpeningNotification createFarmOpeningNotification() {
        return new FarmOpeningNotification();
    }

    /**
     * Create an instance of {@link FarmRegistrationRequest }
     * 
     */
    public FarmRegistrationRequest createFarmRegistrationRequest() {
        return new FarmRegistrationRequest();
    }

    /**
     * Create an instance of {@link FarmRegistrationResponse }
     * 
     */
    public FarmRegistrationResponse createFarmRegistrationResponse() {
        return new FarmRegistrationResponse();
    }

    /**
     * Create an instance of {@link FarmBusinessStartupResponse }
     * 
     */
    public FarmBusinessStartupResponse createFarmBusinessStartupResponse() {
        return new FarmBusinessStartupResponse();
    }

    /**
     * Create an instance of {@link FarmRegistrationNotification }
     * 
     */
    public FarmRegistrationNotification createFarmRegistrationNotification() {
        return new FarmRegistrationNotification();
    }

    /**
     * Create an instance of {@link FarmBusinessCodeStartupNotification }
     * 
     */
    public FarmBusinessCodeStartupNotification createFarmBusinessCodeStartupNotification() {
        return new FarmBusinessCodeStartupNotification();
    }

    /**
     * Create an instance of {@link ChoreographyInstanceRequest }
     * 
     */
    public ChoreographyInstanceRequest createChoreographyInstanceRequest() {
        return new ChoreographyInstanceRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmSiteInspectionRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FarmSiteInspectionRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/veterinary", name = "farmSiteInspectionRequestElementRequest")
    public JAXBElement<FarmSiteInspectionRequestType> createFarmSiteInspectionRequestElementRequest(FarmSiteInspectionRequestType value) {
        return new JAXBElement<FarmSiteInspectionRequestType>(_FarmSiteInspectionRequestElementRequest_QNAME, FarmSiteInspectionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmSiteInspectionRequestReturnType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FarmSiteInspectionRequestReturnType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/veterinary", name = "farmSiteInspectionRequestElementResponse")
    public JAXBElement<FarmSiteInspectionRequestReturnType> createFarmSiteInspectionRequestElementResponse(FarmSiteInspectionRequestReturnType value) {
        return new JAXBElement<FarmSiteInspectionRequestReturnType>(_FarmSiteInspectionRequestElementResponse_QNAME, FarmSiteInspectionRequestReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/veterinary", name = "sendFarmSiteInspectionResponseElementRequest")
    public JAXBElement<SendRequestType> createSendFarmSiteInspectionResponseElementRequest(SendRequestType value) {
        return new JAXBElement<SendRequestType>(_SendFarmSiteInspectionResponseElementRequest_QNAME, SendRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmSiteInspectionResponseReturnType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FarmSiteInspectionResponseReturnType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/veterinary", name = "sendFarmSiteInspectionResponseElementResponse")
    public JAXBElement<FarmSiteInspectionResponseReturnType> createSendFarmSiteInspectionResponseElementResponse(FarmSiteInspectionResponseReturnType value) {
        return new JAXBElement<FarmSiteInspectionResponseReturnType>(_SendFarmSiteInspectionResponseElementResponse_QNAME, FarmSiteInspectionResponseReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmRegistrationNotificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FarmRegistrationNotificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/veterinary", name = "farmRegistrationNotificationElementRequest")
    public JAXBElement<FarmRegistrationNotificationType> createFarmRegistrationNotificationElementRequest(FarmRegistrationNotificationType value) {
        return new JAXBElement<FarmRegistrationNotificationType>(_FarmRegistrationNotificationElementRequest_QNAME, FarmRegistrationNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmRegistrationNotificationReturnType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FarmRegistrationNotificationReturnType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/veterinary", name = "farmRegistrationNotificationElementResponse")
    public JAXBElement<FarmRegistrationNotificationReturnType> createFarmRegistrationNotificationElementResponse(FarmRegistrationNotificationReturnType value) {
        return new JAXBElement<FarmRegistrationNotificationReturnType>(_FarmRegistrationNotificationElementResponse_QNAME, FarmRegistrationNotificationReturnType.class, null, value);
    }

}
