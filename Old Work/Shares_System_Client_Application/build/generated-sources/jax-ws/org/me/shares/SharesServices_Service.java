
package org.me.shares;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Shares_Services", targetNamespace = "http://shares.me.org/", wsdlLocation = "http://localhost:13336/Shares_Services/Shares_Services?wsdl")
public class SharesServices_Service
    extends Service
{

    private final static URL SHARESSERVICES_WSDL_LOCATION;
    private final static WebServiceException SHARESSERVICES_EXCEPTION;
    private final static QName SHARESSERVICES_QNAME = new QName("http://shares.me.org/", "Shares_Services");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:13336/Shares_Services/Shares_Services?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHARESSERVICES_WSDL_LOCATION = url;
        SHARESSERVICES_EXCEPTION = e;
    }

    public SharesServices_Service() {
        super(__getWsdlLocation(), SHARESSERVICES_QNAME);
    }

    public SharesServices_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHARESSERVICES_QNAME, features);
    }

    public SharesServices_Service(URL wsdlLocation) {
        super(wsdlLocation, SHARESSERVICES_QNAME);
    }

    public SharesServices_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHARESSERVICES_QNAME, features);
    }

    public SharesServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SharesServices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SharesServices
     */
    @WebEndpoint(name = "Shares_ServicesPort")
    public SharesServices getSharesServicesPort() {
        return super.getPort(new QName("http://shares.me.org/", "Shares_ServicesPort"), SharesServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SharesServices
     */
    @WebEndpoint(name = "Shares_ServicesPort")
    public SharesServices getSharesServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://shares.me.org/", "Shares_ServicesPort"), SharesServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHARESSERVICES_EXCEPTION!= null) {
            throw SHARESSERVICES_EXCEPTION;
        }
        return SHARESSERVICES_WSDL_LOCATION;
    }

}