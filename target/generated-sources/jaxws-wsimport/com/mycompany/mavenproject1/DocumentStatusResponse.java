
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentStatusResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aceptacionFisica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="acuseComentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acuseEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acuseResponsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acuseRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambiente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cadenaCodigoQR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cadenaCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstatusDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entregaMetodoDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esValidoDIAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="estatusDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eventos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response}ArrayOfEvento" minOccurs="0"/>
 *         &lt;element name="fechaAceptacionDIAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historialDeEntregas" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfHistorialDeEntrega" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poseeAdjuntos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="poseeRepresentacionGrafica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reglasValidacionDIAN" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCufe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatusResponse", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", propOrder = {
    "aceptacionFisica",
    "acuseComentario",
    "acuseEstatus",
    "acuseResponsable",
    "acuseRespuesta",
    "ambiente",
    "cadenaCodigoQR",
    "cadenaCufe",
    "codigo",
    "consecutivo",
    "cufe",
    "descripcionDocumento",
    "descripcionEstatusDocumento",
    "entregaMetodoDIAN",
    "esValidoDIAN",
    "estatusDocumento",
    "eventos",
    "fechaAceptacionDIAN",
    "fechaDocumento",
    "historialDeEntregas",
    "mensaje",
    "mensajeDocumento",
    "poseeAdjuntos",
    "poseeRepresentacionGrafica",
    "reglasValidacionDIAN",
    "resultado",
    "tipoCufe",
    "tipoDocumento",
    "trackID"
})
public class DocumentStatusResponse {

    protected Boolean aceptacionFisica;
    @XmlElementRef(name = "acuseComentario", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acuseComentario;
    @XmlElementRef(name = "acuseEstatus", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acuseEstatus;
    @XmlElementRef(name = "acuseResponsable", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acuseResponsable;
    @XmlElementRef(name = "acuseRespuesta", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acuseRespuesta;
    @XmlElementRef(name = "ambiente", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ambiente;
    @XmlElementRef(name = "cadenaCodigoQR", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cadenaCodigoQR;
    @XmlElementRef(name = "cadenaCufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cadenaCufe;
    protected Integer codigo;
    @XmlElementRef(name = "consecutivo", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consecutivo;
    @XmlElementRef(name = "cufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cufe;
    @XmlElementRef(name = "descripcionDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionDocumento;
    @XmlElementRef(name = "descripcionEstatusDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionEstatusDocumento;
    @XmlElementRef(name = "entregaMetodoDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entregaMetodoDIAN;
    protected Boolean esValidoDIAN;
    protected Integer estatusDocumento;
    @XmlElementRef(name = "eventos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEvento> eventos;
    @XmlElementRef(name = "fechaAceptacionDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaAceptacionDIAN;
    @XmlElementRef(name = "fechaDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaDocumento;
    @XmlElementRef(name = "historialDeEntregas", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHistorialDeEntrega> historialDeEntregas;
    @XmlElementRef(name = "mensaje", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensaje;
    @XmlElementRef(name = "mensajeDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajeDocumento;
    protected Boolean poseeAdjuntos;
    protected Boolean poseeRepresentacionGrafica;
    @XmlElementRef(name = "reglasValidacionDIAN", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> reglasValidacionDIAN;
    @XmlElementRef(name = "resultado", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultado;
    @XmlElementRef(name = "tipoCufe", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCufe;
    @XmlElementRef(name = "tipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumento;
    @XmlElementRef(name = "trackID", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackID;

    /**
     * Obtiene el valor de la propiedad aceptacionFisica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAceptacionFisica() {
        return aceptacionFisica;
    }

    /**
     * Define el valor de la propiedad aceptacionFisica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAceptacionFisica(Boolean value) {
        this.aceptacionFisica = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseComentario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcuseComentario() {
        return acuseComentario;
    }

    /**
     * Define el valor de la propiedad acuseComentario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcuseComentario(JAXBElement<String> value) {
        this.acuseComentario = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseEstatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcuseEstatus() {
        return acuseEstatus;
    }

    /**
     * Define el valor de la propiedad acuseEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcuseEstatus(JAXBElement<String> value) {
        this.acuseEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseResponsable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcuseResponsable() {
        return acuseResponsable;
    }

    /**
     * Define el valor de la propiedad acuseResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcuseResponsable(JAXBElement<String> value) {
        this.acuseResponsable = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcuseRespuesta() {
        return acuseRespuesta;
    }

    /**
     * Define el valor de la propiedad acuseRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcuseRespuesta(JAXBElement<String> value) {
        this.acuseRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad ambiente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmbiente() {
        return ambiente;
    }

    /**
     * Define el valor de la propiedad ambiente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmbiente(JAXBElement<String> value) {
        this.ambiente = value;
    }

    /**
     * Obtiene el valor de la propiedad cadenaCodigoQR.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadenaCodigoQR() {
        return cadenaCodigoQR;
    }

    /**
     * Define el valor de la propiedad cadenaCodigoQR.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadenaCodigoQR(JAXBElement<String> value) {
        this.cadenaCodigoQR = value;
    }

    /**
     * Obtiene el valor de la propiedad cadenaCufe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCadenaCufe() {
        return cadenaCufe;
    }

    /**
     * Define el valor de la propiedad cadenaCufe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCadenaCufe(JAXBElement<String> value) {
        this.cadenaCufe = value;
    }

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
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsecutivo(JAXBElement<String> value) {
        this.consecutivo = value;
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
     * Obtiene el valor de la propiedad descripcionDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionDocumento() {
        return descripcionDocumento;
    }

    /**
     * Define el valor de la propiedad descripcionDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionDocumento(JAXBElement<String> value) {
        this.descripcionDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstatusDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionEstatusDocumento() {
        return descripcionEstatusDocumento;
    }

    /**
     * Define el valor de la propiedad descripcionEstatusDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionEstatusDocumento(JAXBElement<String> value) {
        this.descripcionEstatusDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaMetodoDIAN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntregaMetodoDIAN() {
        return entregaMetodoDIAN;
    }

    /**
     * Define el valor de la propiedad entregaMetodoDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntregaMetodoDIAN(JAXBElement<String> value) {
        this.entregaMetodoDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad esValidoDIAN.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsValidoDIAN() {
        return esValidoDIAN;
    }

    /**
     * Define el valor de la propiedad esValidoDIAN.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsValidoDIAN(Boolean value) {
        this.esValidoDIAN = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstatusDocumento() {
        return estatusDocumento;
    }

    /**
     * Define el valor de la propiedad estatusDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstatusDocumento(Integer value) {
        this.estatusDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad eventos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEvento> getEventos() {
        return eventos;
    }

    /**
     * Define el valor de la propiedad eventos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEvento }{@code >}
     *     
     */
    public void setEventos(JAXBElement<ArrayOfEvento> value) {
        this.eventos = value;
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
     * Obtiene el valor de la propiedad fechaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Define el valor de la propiedad fechaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaDocumento(JAXBElement<String> value) {
        this.fechaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad historialDeEntregas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHistorialDeEntrega }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHistorialDeEntrega> getHistorialDeEntregas() {
        return historialDeEntregas;
    }

    /**
     * Define el valor de la propiedad historialDeEntregas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHistorialDeEntrega }{@code >}
     *     
     */
    public void setHistorialDeEntregas(JAXBElement<ArrayOfHistorialDeEntrega> value) {
        this.historialDeEntregas = value;
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
     * Obtiene el valor de la propiedad mensajeDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajeDocumento() {
        return mensajeDocumento;
    }

    /**
     * Define el valor de la propiedad mensajeDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajeDocumento(JAXBElement<String> value) {
        this.mensajeDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad poseeAdjuntos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoseeAdjuntos() {
        return poseeAdjuntos;
    }

    /**
     * Define el valor de la propiedad poseeAdjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoseeAdjuntos(Boolean value) {
        this.poseeAdjuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad poseeRepresentacionGrafica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoseeRepresentacionGrafica() {
        return poseeRepresentacionGrafica;
    }

    /**
     * Define el valor de la propiedad poseeRepresentacionGrafica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoseeRepresentacionGrafica(Boolean value) {
        this.poseeRepresentacionGrafica = value;
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
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumento(JAXBElement<String> value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad trackID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackID() {
        return trackID;
    }

    /**
     * Define el valor de la propiedad trackID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackID(JAXBElement<String> value) {
        this.trackID = value;
    }

}
