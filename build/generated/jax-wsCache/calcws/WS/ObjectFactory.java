
package WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS package. 
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

    private final static QName _GetDiv_QNAME = new QName("http://SE2/", "getDiv");
    private final static QName _GetSoma_QNAME = new QName("http://SE2/", "getSoma");
    private final static QName _GetSub_QNAME = new QName("http://SE2/", "getSub");
    private final static QName _GetDivResponse_QNAME = new QName("http://SE2/", "getDivResponse");
    private final static QName _GetMul_QNAME = new QName("http://SE2/", "getMul");
    private final static QName _GetSomaResponse_QNAME = new QName("http://SE2/", "getSomaResponse");
    private final static QName _GetMulResponse_QNAME = new QName("http://SE2/", "getMulResponse");
    private final static QName _GetSubResponse_QNAME = new QName("http://SE2/", "getSubResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSub }
     * 
     */
    public GetSub createGetSub() {
        return new GetSub();
    }

    /**
     * Create an instance of {@link GetDiv }
     * 
     */
    public GetDiv createGetDiv() {
        return new GetDiv();
    }

    /**
     * Create an instance of {@link GetSoma }
     * 
     */
    public GetSoma createGetSoma() {
        return new GetSoma();
    }

    /**
     * Create an instance of {@link GetDivResponse }
     * 
     */
    public GetDivResponse createGetDivResponse() {
        return new GetDivResponse();
    }

    /**
     * Create an instance of {@link GetMul }
     * 
     */
    public GetMul createGetMul() {
        return new GetMul();
    }

    /**
     * Create an instance of {@link GetMulResponse }
     * 
     */
    public GetMulResponse createGetMulResponse() {
        return new GetMulResponse();
    }

    /**
     * Create an instance of {@link GetSomaResponse }
     * 
     */
    public GetSomaResponse createGetSomaResponse() {
        return new GetSomaResponse();
    }

    /**
     * Create an instance of {@link GetSubResponse }
     * 
     */
    public GetSubResponse createGetSubResponse() {
        return new GetSubResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getDiv")
    public JAXBElement<GetDiv> createGetDiv(GetDiv value) {
        return new JAXBElement<GetDiv>(_GetDiv_QNAME, GetDiv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getSoma")
    public JAXBElement<GetSoma> createGetSoma(GetSoma value) {
        return new JAXBElement<GetSoma>(_GetSoma_QNAME, GetSoma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getSub")
    public JAXBElement<GetSub> createGetSub(GetSub value) {
        return new JAXBElement<GetSub>(_GetSub_QNAME, GetSub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getDivResponse")
    public JAXBElement<GetDivResponse> createGetDivResponse(GetDivResponse value) {
        return new JAXBElement<GetDivResponse>(_GetDivResponse_QNAME, GetDivResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getMul")
    public JAXBElement<GetMul> createGetMul(GetMul value) {
        return new JAXBElement<GetMul>(_GetMul_QNAME, GetMul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getSomaResponse")
    public JAXBElement<GetSomaResponse> createGetSomaResponse(GetSomaResponse value) {
        return new JAXBElement<GetSomaResponse>(_GetSomaResponse_QNAME, GetSomaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getMulResponse")
    public JAXBElement<GetMulResponse> createGetMulResponse(GetMulResponse value) {
        return new JAXBElement<GetMulResponse>(_GetMulResponse_QNAME, GetMulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SE2/", name = "getSubResponse")
    public JAXBElement<GetSubResponse> createGetSubResponse(GetSubResponse value) {
        return new JAXBElement<GetSubResponse>(_GetSubResponse_QNAME, GetSubResponse.class, null, value);
    }

}
