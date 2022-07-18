
package eu.chorevolution.prosumer.registryoffice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.chorevolution.prosumer.registryoffice package. 
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

    private final static QName _FarmOpeningNotificationElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "farmOpeningNotificationElementRequest");
    private final static QName _FarmOpeningNotificationElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "farmOpeningNotificationElementResponse");
    private final static QName _SendFarmRegistrationRequestElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "sendFarmRegistrationRequestElementRequest");
    private final static QName _SendFarmRegistrationRequestElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "sendFarmRegistrationRequestElementResponse");
    private final static QName _ReceiveFarmRegistrationResponseElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "receiveFarmRegistrationResponseElementRequest");
    private final static QName _ReceiveFarmRegistrationResponseElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "receiveFarmRegistrationResponseElementResponse");
    private final static QName _SendFarmRegistrationNotificationElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "sendFarmRegistrationNotificationElementRequest");
    private final static QName _SendFarmRegistrationNotificationElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "sendFarmRegistrationNotificationElementResponse");
    private final static QName _SendFarmBusinessCodeStartupNotificationElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "sendFarmBusinessCodeStartupNotificationElementRequest");
    private final static QName _SendFarmBusinessCodeStartupNotificationElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/registryoffice", "sendFarmBusinessCodeStartupNotificationElementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.chorevolution.prosumer.registryoffice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FarmOpeningNotificationType }
     * 
     */
    public FarmOpeningNotificationType createFarmOpeningNotificationType() {
        return new FarmOpeningNotificationType();
    }

    /**
     * Create an instance of {@link FarmOpeningNotificationReturnType }
     * 
     */
    public FarmOpeningNotificationReturnType createFarmOpeningNotificationReturnType() {
        return new FarmOpeningNotificationReturnType();
    }

    /**
     * Create an instance of {@link SendRequestType }
     * 
     */
    public SendRequestType createSendRequestType() {
        return new SendRequestType();
    }

    /**
     * Create an instance of {@link FarmRegistrationRequestReturnType }
     * 
     */
    public FarmRegistrationRequestReturnType createFarmRegistrationRequestReturnType() {
        return new FarmRegistrationRequestReturnType();
    }

    /**
     * Create an instance of {@link ReceiveFarmRegistrationResponseType }
     * 
     */
    public ReceiveFarmRegistrationResponseType createReceiveFarmRegistrationResponseType() {
        return new ReceiveFarmRegistrationResponseType();
    }

    /**
     * Create an instance of {@link ReceiveFarmRegistrationResponseReturnType }
     * 
     */
    public ReceiveFarmRegistrationResponseReturnType createReceiveFarmRegistrationResponseReturnType() {
        return new ReceiveFarmRegistrationResponseReturnType();
    }

    /**
     * Create an instance of {@link FarmRegistrationNotificationReturnType }
     * 
     */
    public FarmRegistrationNotificationReturnType createFarmRegistrationNotificationReturnType() {
        return new FarmRegistrationNotificationReturnType();
    }

    /**
     * Create an instance of {@link FarmBusinessCodeStartupNotificationReturnType }
     * 
     */
    public FarmBusinessCodeStartupNotificationReturnType createFarmBusinessCodeStartupNotificationReturnType() {
        return new FarmBusinessCodeStartupNotificationReturnType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmOpeningNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "farmOpeningNotificationElementRequest")
    public JAXBElement<FarmOpeningNotificationType> createFarmOpeningNotificationElementRequest(FarmOpeningNotificationType value) {
        return new JAXBElement<FarmOpeningNotificationType>(_FarmOpeningNotificationElementRequest_QNAME, FarmOpeningNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmOpeningNotificationReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "farmOpeningNotificationElementResponse")
    public JAXBElement<FarmOpeningNotificationReturnType> createFarmOpeningNotificationElementResponse(FarmOpeningNotificationReturnType value) {
        return new JAXBElement<FarmOpeningNotificationReturnType>(_FarmOpeningNotificationElementResponse_QNAME, FarmOpeningNotificationReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "sendFarmRegistrationRequestElementRequest")
    public JAXBElement<SendRequestType> createSendFarmRegistrationRequestElementRequest(SendRequestType value) {
        return new JAXBElement<SendRequestType>(_SendFarmRegistrationRequestElementRequest_QNAME, SendRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmRegistrationRequestReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "sendFarmRegistrationRequestElementResponse")
    public JAXBElement<FarmRegistrationRequestReturnType> createSendFarmRegistrationRequestElementResponse(FarmRegistrationRequestReturnType value) {
        return new JAXBElement<FarmRegistrationRequestReturnType>(_SendFarmRegistrationRequestElementResponse_QNAME, FarmRegistrationRequestReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveFarmRegistrationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "receiveFarmRegistrationResponseElementRequest")
    public JAXBElement<ReceiveFarmRegistrationResponseType> createReceiveFarmRegistrationResponseElementRequest(ReceiveFarmRegistrationResponseType value) {
        return new JAXBElement<ReceiveFarmRegistrationResponseType>(_ReceiveFarmRegistrationResponseElementRequest_QNAME, ReceiveFarmRegistrationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveFarmRegistrationResponseReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "receiveFarmRegistrationResponseElementResponse")
    public JAXBElement<ReceiveFarmRegistrationResponseReturnType> createReceiveFarmRegistrationResponseElementResponse(ReceiveFarmRegistrationResponseReturnType value) {
        return new JAXBElement<ReceiveFarmRegistrationResponseReturnType>(_ReceiveFarmRegistrationResponseElementResponse_QNAME, ReceiveFarmRegistrationResponseReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "sendFarmRegistrationNotificationElementRequest")
    public JAXBElement<SendRequestType> createSendFarmRegistrationNotificationElementRequest(SendRequestType value) {
        return new JAXBElement<SendRequestType>(_SendFarmRegistrationNotificationElementRequest_QNAME, SendRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmRegistrationNotificationReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "sendFarmRegistrationNotificationElementResponse")
    public JAXBElement<FarmRegistrationNotificationReturnType> createSendFarmRegistrationNotificationElementResponse(FarmRegistrationNotificationReturnType value) {
        return new JAXBElement<FarmRegistrationNotificationReturnType>(_SendFarmRegistrationNotificationElementResponse_QNAME, FarmRegistrationNotificationReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "sendFarmBusinessCodeStartupNotificationElementRequest")
    public JAXBElement<SendRequestType> createSendFarmBusinessCodeStartupNotificationElementRequest(SendRequestType value) {
        return new JAXBElement<SendRequestType>(_SendFarmBusinessCodeStartupNotificationElementRequest_QNAME, SendRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmBusinessCodeStartupNotificationReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "sendFarmBusinessCodeStartupNotificationElementResponse")
    public JAXBElement<FarmBusinessCodeStartupNotificationReturnType> createSendFarmBusinessCodeStartupNotificationElementResponse(FarmBusinessCodeStartupNotificationReturnType value) {
        return new JAXBElement<FarmBusinessCodeStartupNotificationReturnType>(_SendFarmBusinessCodeStartupNotificationElementResponse_QNAME, FarmBusinessCodeStartupNotificationReturnType.class, null, value);
    }

}
