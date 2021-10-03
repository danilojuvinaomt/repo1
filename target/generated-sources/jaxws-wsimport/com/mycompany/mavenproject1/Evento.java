
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Evento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Evento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambienteDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emisorNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emisorNumeroDocumentoDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emisorRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emisorTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response}ArrayOfExtrasEvento" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRecepcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPerfilDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreArchivoXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDelEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptorNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptorNumeroDocumentoDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptorRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptorTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionUBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Evento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", propOrder = {
    "ambienteDIAN",
    "codigo",
    "comentario",
    "cufe",
    "descripcionEvento",
    "emisorNumeroDocumento",
    "emisorNumeroDocumentoDV",
    "emisorRazonSocial",
    "emisorTipoIdentificacion",
    "extras",
    "fechaEmision",
    "fechaRecepcion",
    "hash",
    "idPerfilDIAN",
    "mensaje",
    "nombreArchivoXML",
    "nota",
    "numeroDelEvento",
    "receptorNumeroDocumento",
    "receptorNumeroDocumentoDV",
    "receptorRazonSocial",
    "receptorTipoIdentificacion",
    "resultado",
    "tipoCufe",
    "tipoEvento",
    "versionUBL",
    "xml"
})
public class Evento {

    @XmlElementRef(name = "ambienteDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ambienteDIAN;
    @XmlElementRef(name = "codigo", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigo;
    @XmlElementRef(name = "comentario", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comentario;
    @XmlElementRef(name = "cufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cufe;
    @XmlElementRef(name = "descripcionEvento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionEvento;
    @XmlElementRef(name = "emisorNumeroDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emisorNumeroDocumento;
    @XmlElementRef(name = "emisorNumeroDocumentoDV", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emisorNumeroDocumentoDV;
    @XmlElementRef(name = "emisorRazonSocial", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emisorRazonSocial;
    @XmlElementRef(name = "emisorTipoIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emisorTipoIdentificacion;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtrasEvento> extras;
    @XmlElementRef(name = "fechaEmision", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEmision;
    @XmlElementRef(name = "fechaRecepcion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaRecepcion;
    @XmlElementRef(name = "hash", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hash;
    @XmlElementRef(name = "idPerfilDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idPerfilDIAN;
    @XmlElementRef(name = "mensaje", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensaje;
    @XmlElementRef(name = "nombreArchivoXML", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreArchivoXML;
    @XmlElementRef(name = "nota", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nota;
    @XmlElementRef(name = "numeroDelEvento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDelEvento;
    @XmlElementRef(name = "receptorNumeroDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receptorNumeroDocumento;
    @XmlElementRef(name = "receptorNumeroDocumentoDV", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receptorNumeroDocumentoDV;
    @XmlElementRef(name = "receptorRazonSocial", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receptorRazonSocial;
    @XmlElementRef(name = "receptorTipoIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receptorTipoIdentificacion;
    @XmlElementRef(name = "resultado", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultado;
    @XmlElementRef(name = "tipoCufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCufe;
    @XmlElementRef(name = "tipoEvento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoEvento;
    @XmlElementRef(name = "versionUBL", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> versionUBL;
    @XmlElementRef(name = "xml", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xml;

    /**
     * Obtiene el valor de la propiedad ambienteDIAN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmbienteDIAN() {
        return ambienteDIAN;
    }

    /**
     * Define el valor de la propiedad ambienteDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmbienteDIAN(JAXBElement<String> value) {
        this.ambienteDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigo(JAXBElement<String> value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComentario(JAXBElement<String> value) {
        this.comentario = value;
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
     * Obtiene el valor de la propiedad descripcionEvento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionEvento() {
        return descripcionEvento;
    }

    /**
     * Define el valor de la propiedad descripcionEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionEvento(JAXBElement<String> value) {
        this.descripcionEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmisorNumeroDocumento() {
        return emisorNumeroDocumento;
    }

    /**
     * Define el valor de la propiedad emisorNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmisorNumeroDocumento(JAXBElement<String> value) {
        this.emisorNumeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorNumeroDocumentoDV.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmisorNumeroDocumentoDV() {
        return emisorNumeroDocumentoDV;
    }

    /**
     * Define el valor de la propiedad emisorNumeroDocumentoDV.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmisorNumeroDocumentoDV(JAXBElement<String> value) {
        this.emisorNumeroDocumentoDV = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmisorRazonSocial() {
        return emisorRazonSocial;
    }

    /**
     * Define el valor de la propiedad emisorRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmisorRazonSocial(JAXBElement<String> value) {
        this.emisorRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmisorTipoIdentificacion() {
        return emisorTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad emisorTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmisorTipoIdentificacion(JAXBElement<String> value) {
        this.emisorTipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtrasEvento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExtrasEvento> getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtrasEvento }{@code >}
     *     
     */
    public void setExtras(JAXBElement<ArrayOfExtrasEvento> value) {
        this.extras = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaEmision(JAXBElement<String> value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaRecepcion(JAXBElement<String> value) {
        this.fechaRecepcion = value;
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
     * Obtiene el valor de la propiedad idPerfilDIAN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdPerfilDIAN() {
        return idPerfilDIAN;
    }

    /**
     * Define el valor de la propiedad idPerfilDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdPerfilDIAN(JAXBElement<String> value) {
        this.idPerfilDIAN = value;
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
     * Obtiene el valor de la propiedad nombreArchivoXML.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreArchivoXML() {
        return nombreArchivoXML;
    }

    /**
     * Define el valor de la propiedad nombreArchivoXML.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreArchivoXML(JAXBElement<String> value) {
        this.nombreArchivoXML = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNota(JAXBElement<String> value) {
        this.nota = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDelEvento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDelEvento() {
        return numeroDelEvento;
    }

    /**
     * Define el valor de la propiedad numeroDelEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDelEvento(JAXBElement<String> value) {
        this.numeroDelEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceptorNumeroDocumento() {
        return receptorNumeroDocumento;
    }

    /**
     * Define el valor de la propiedad receptorNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceptorNumeroDocumento(JAXBElement<String> value) {
        this.receptorNumeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorNumeroDocumentoDV.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceptorNumeroDocumentoDV() {
        return receptorNumeroDocumentoDV;
    }

    /**
     * Define el valor de la propiedad receptorNumeroDocumentoDV.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceptorNumeroDocumentoDV(JAXBElement<String> value) {
        this.receptorNumeroDocumentoDV = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceptorRazonSocial() {
        return receptorRazonSocial;
    }

    /**
     * Define el valor de la propiedad receptorRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceptorRazonSocial(JAXBElement<String> value) {
        this.receptorRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceptorTipoIdentificacion() {
        return receptorTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad receptorTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceptorTipoIdentificacion(JAXBElement<String> value) {
        this.receptorTipoIdentificacion = value;
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
     * Obtiene el valor de la propiedad tipoEvento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Define el valor de la propiedad tipoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoEvento(JAXBElement<String> value) {
        this.tipoEvento = value;
    }

    /**
     * Obtiene el valor de la propiedad versionUBL.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersionUBL() {
        return versionUBL;
    }

    /**
     * Define el valor de la propiedad versionUBL.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersionUBL(JAXBElement<String> value) {
        this.versionUBL = value;
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
