package eu.chorevolution.farmbusinessstartup.provider.municipality;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2018-05-07T17:35:22.437+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "MunicipalityService", 
                  wsdlLocation = "classpath:Municipality.wsdl",
                  targetNamespace = "http://eu.chorevolution.farmbusinessstartup/services/municipality") 
public class MunicipalityService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://eu.chorevolution.farmbusinessstartup/services/municipality", "MunicipalityService");
    public final static QName MunicipalityPort = new QName("http://eu.chorevolution.farmbusinessstartup/services/municipality", "MunicipalityPort");
    static {
        URL url = MunicipalityService.class.getClassLoader().getResource("Municipality.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(MunicipalityService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:Municipality.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public MunicipalityService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MunicipalityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MunicipalityService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MunicipalityService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MunicipalityService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MunicipalityService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MunicipalityPT
     */
    @WebEndpoint(name = "MunicipalityPort")
    public MunicipalityPT getMunicipalityPort() {
        return super.getPort(MunicipalityPort, MunicipalityPT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MunicipalityPT
     */
    @WebEndpoint(name = "MunicipalityPort")
    public MunicipalityPT getMunicipalityPort(WebServiceFeature... features) {
        return super.getPort(MunicipalityPort, MunicipalityPT.class, features);
    }

}
