
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EventoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EventoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consecutivoDocumentoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventoResponse", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", propOrder = {
    "codigo",
    "consecutivoDocumentoEvento",
    "cufe",
    "fechaRespuesta",
    "hash",
    "mensaje",
    "resultado",
    "tipoCufe",
    "xml"
})
public class EventoResponse {

    protected Integer codigo;
    @XmlElementRef(name = "consecutivoDocumentoEvento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consecutivoDocumentoEvento;
    @XmlElementRef(name = "cufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cufe;
    @XmlElementRef(name = "fechaRespuesta", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaRespuesta;
    @XmlElementRef(name = "hash", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hash;
    @XmlElementRef(name = "mensaje", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensaje;
    @XmlElementRef(name = "resultado", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultado;
    @XmlElementRef(name = "tipoCufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCufe;
    @XmlElementRef(name = "xml", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xml;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivoDocumentoEvento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsecutivoDocumentoEvento() {
        return consecutivoDocumentoEvento;
    }

    /**
     * Define el valor de la propiedad consecutivoDocumentoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsecutivoDocumentoEvento(JAXBElement<String> value) {
        this.consecutivoDocumentoEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad cufe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCufe() {
        return cufe;
    }

    /**
     * Define el valor de la propiedad cufe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCufe(JAXBElement<String> value) {
        this.cufe = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaRespuesta() {
        return fechaRespuesta;
    }

    /**
     * Define el valor de la propiedad fechaRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaRespuesta(JAXBElement<String> value) {
        this.fechaRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad hash.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHash() {
        return hash;
    }

    /**
     * Define el valor de la propiedad hash.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHash(JAXBElement<String> value) {
        this.hash = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensaje(JAXBElement<String> value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultado(JAXBElement<String> value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCufe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCufe() {
        return tipoCufe;
    }

    /**
     * Define el valor de la propiedad tipoCufe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCufe(JAXBElement<String> value) {
        this.tipoCufe = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXml() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXml(JAXBElement<String> value) {
        this.xml = value;
    }

}
