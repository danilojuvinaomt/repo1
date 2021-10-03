
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consecutivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esValidoDian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaAceptacionDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajesValidacion" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reglasNotificacionDIAN" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="reglasValidacionDIAN" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
@XmlType(name = "DocumentResponse", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", propOrder = {
    "codigo",
    "consecutivoDocumento",
    "cufe",
    "esValidoDian",
    "fechaAceptacionDIAN",
    "fechaRespuesta",
    "hash",
    "mensaje",
    "mensajesValidacion",
    "nombre",
    "qr",
    "reglasNotificacionDIAN",
    "reglasValidacionDIAN",
    "resultado",
    "tipoCufe",
    "xml"
})
public class DocumentResponse {

    protected Integer codigo;
    @XmlElementRef(name = "consecutivoDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consecutivoDocumento;
    @XmlElementRef(name = "cufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cufe;
    protected Boolean esValidoDian;
    @XmlElementRef(name = "fechaAceptacionDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaAceptacionDIAN;
    @XmlElementRef(name = "fechaRespuesta", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaRespuesta;
    @XmlElementRef(name = "hash", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hash;
    @XmlElementRef(name = "mensaje", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensaje;
    @XmlElementRef(name = "mensajesValidacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> mensajesValidacion;
    @XmlElementRef(name = "nombre", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "qr", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qr;
    @XmlElementRef(name = "reglasNotificacionDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> reglasNotificacionDIAN;
    @XmlElementRef(name = "reglasValidacionDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> reglasValidacionDIAN;
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
     * Obtiene el valor de la propiedad consecutivoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsecutivoDocumento() {
        return consecutivoDocumento;
    }

    /**
     * Define el valor de la propiedad consecutivoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsecutivoDocumento(JAXBElement<String> value) {
        this.consecutivoDocumento = value;
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
     * Obtiene el valor de la propiedad esValidoDian.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsValidoDian() {
        return esValidoDian;
    }

    /**
     * Define el valor de la propiedad esValidoDian.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsValidoDian(Boolean value) {
        this.esValidoDian = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAceptacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaAceptacionDIAN() {
        return fechaAceptacionDIAN;
    }

    /**
     * Define el valor de la propiedad fechaAceptacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaAceptacionDIAN(JAXBElement<String> value) {
        this.fechaAceptacionDIAN = value;
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
     * Obtiene el valor de la propiedad mensajesValidacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMensajesValidacion() {
        return mensajesValidacion;
    }

    /**
     * Define el valor de la propiedad mensajesValidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMensajesValidacion(JAXBElement<ArrayOfstring> value) {
        this.mensajesValidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad qr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQr() {
        return qr;
    }

    /**
     * Define el valor de la propiedad qr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQr(JAXBElement<String> value) {
        this.qr = value;
    }

    /**
     * Obtiene el valor de la propiedad reglasNotificacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getReglasNotificacionDIAN() {
        return reglasNotificacionDIAN;
    }

    /**
     * Define el valor de la propiedad reglasNotificacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setReglasNotificacionDIAN(JAXBElement<ArrayOfstring> value) {
        this.reglasNotificacionDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad reglasValidacionDIAN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getReglasValidacionDIAN() {
        return reglasValidacionDIAN;
    }

    /**
     * Define el valor de la propiedad reglasValidacionDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setReglasValidacionDIAN(JAXBElement<ArrayOfstring> value) {
        this.reglasValidacionDIAN = value;
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
