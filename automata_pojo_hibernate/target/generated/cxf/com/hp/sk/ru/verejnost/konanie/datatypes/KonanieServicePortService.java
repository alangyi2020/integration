package com.hp.sk.ru.verejnost.konanie.datatypes;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2020-12-10T10:37:37.996+01:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "KonanieServicePortService",
                  wsdlLocation = "/automata_pojo_hibernate/wsdl/konanieService.wsdl",
                  targetNamespace = "datatypes.konanie.verejnost.ru.sk.hp.com")
public class KonanieServicePortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("datatypes.konanie.verejnost.ru.sk.hp.com", "KonanieServicePortService");
    public final static QName KonanieServicePortSoap11 = new QName("datatypes.konanie.verejnost.ru.sk.hp.com", "KonanieServicePortSoap11");
    static {
        URL url = KonanieServicePortService.class.getResource("/automata_pojo_hibernate/wsdl/konanieService.wsdl");
        if (url == null) {
            url = KonanieServicePortService.class.getClassLoader().getResource("/automata_pojo_hibernate/wsdl/konanieService.wsdl");
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(KonanieServicePortService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "/automata_pojo_hibernate/wsdl/konanieService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public KonanieServicePortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public KonanieServicePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KonanieServicePortService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public KonanieServicePortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public KonanieServicePortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public KonanieServicePortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns KonanieServicePort
     */
    @WebEndpoint(name = "KonanieServicePortSoap11")
    public KonanieServicePort getKonanieServicePortSoap11() {
        return super.getPort(KonanieServicePortSoap11, KonanieServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KonanieServicePort
     */
    @WebEndpoint(name = "KonanieServicePortSoap11")
    public KonanieServicePort getKonanieServicePortSoap11(WebServiceFeature... features) {
        return super.getPort(KonanieServicePortSoap11, KonanieServicePort.class, features);
    }

}