
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosDelTransportista complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosDelTransportista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detallesTributarios" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfTributos" minOccurs="0"/>
 *         &lt;element name="direccionResponsableEntrega" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/>
 *         &lt;element name="indicadordeAtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadordeCuidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreResponsableEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroIdentificacionDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroMatriculaMercantil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsabilidadesRut" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfObligaciones" minOccurs="0"/>
 *         &lt;element name="telefax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportadorDireccion" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/>
 *         &lt;element name="transportadorNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportadorNumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportadorNumeroDocumentoDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportadorTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosDelTransportista", propOrder = {
    "detallesTributarios",
    "direccionResponsableEntrega",
    "email",
    "extras",
    "indicadordeAtencion",
    "indicadordeCuidado",
    "nombreContacto",
    "nombreResponsableEntrega",
    "nota",
    "numeroIdentificacion",
    "numeroIdentificacionDV",
    "numeroMatriculaMercantil",
    "prefijoFacturacion",
    "responsabilidadesRut",
    "telefax",
    "telefono",
    "tipoIdentificacion",
    "transportadorDireccion",
    "transportadorNombre",
    "transportadorNumeroDocumento",
    "transportadorNumeroDocumentoDV",
    "transportadorTipoIdentificacion"
})
public class DatosDelTransportista {

    @XmlElementRef(name = "detallesTributarios", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTributos> detallesTributarios;
    @XmlElementRef(name = "direccionResponsableEntrega", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Direccion> direccionResponsableEntrega;
    @XmlElementRef(name = "email", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtensible> extras;
    @XmlElementRef(name = "indicadordeAtencion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadordeAtencion;
    @XmlElementRef(name = "indicadordeCuidado", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadordeCuidado;
    @XmlElementRef(name = "nombreContacto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreContacto;
    @XmlElementRef(name = "nombreResponsableEntrega", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreResponsableEntrega;
    @XmlElementRef(name = "nota", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nota;
    @XmlElementRef(name = "numeroIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroIdentificacion;
    @XmlElementRef(name = "numeroIdentificacionDV", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroIdentificacionDV;
    @XmlElementRef(name = "numeroMatriculaMercantil", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroMatriculaMercantil;
    @XmlElementRef(name = "prefijoFacturacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefijoFacturacion;
    @XmlElementRef(name = "responsabilidadesRut", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfObligaciones> responsabilidadesRut;
    @XmlElementRef(name = "telefax", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefax;
    @XmlElementRef(name = "telefono", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;
    @XmlElementRef(name = "tipoIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoIdentificacion;
    @XmlElementRef(name = "transportadorDireccion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Direccion> transportadorDireccion;
    @XmlElementRef(name = "transportadorNombre", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportadorNombre;
    @XmlElementRef(name = "transportadorNumeroDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportadorNumeroDocumento;
    @XmlElementRef(name = "transportadorNumeroDocumentoDV", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportadorNumeroDocumentoDV;
    @XmlElementRef(name = "transportadorTipoIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportadorTipoIdentificacion;

    /**
     * Obtiene el valor de la propiedad detallesTributarios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTributos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTributos> getDetallesTributarios() {
        return detallesTributarios;
    }

    /**
     * Define el valor de la propiedad detallesTributarios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTributos }{@code >}
     *     
     */
    public void setDetallesTributarios(JAXBElement<ArrayOfTributos> value) {
        this.detallesTributarios = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionResponsableEntrega.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public JAXBElement<Direccion> getDireccionResponsableEntrega() {
        return direccionResponsableEntrega;
    }

    /**
     * Define el valor de la propiedad direccionResponsableEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public void setDireccionResponsableEntrega(JAXBElement<Direccion> value) {
        this.direccionResponsableEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExtensible> getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}
     *     
     */
    public void setExtras(JAXBElement<ArrayOfExtensible> value) {
        this.extras = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadordeAtencion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadordeAtencion() {
        return indicadordeAtencion;
    }

    /**
     * Define el valor de la propiedad indicadordeAtencion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadordeAtencion(JAXBElement<String> value) {
        this.indicadordeAtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadordeCuidado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadordeCuidado() {
        return indicadordeCuidado;
    }

    /**
     * Define el valor de la propiedad indicadordeCuidado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadordeCuidado(JAXBElement<String> value) {
        this.indicadordeCuidado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreContacto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreContacto() {
        return nombreContacto;
    }

    /**
     * Define el valor de la propiedad nombreContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreContacto(JAXBElement<String> value) {
        this.nombreContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreResponsableEntrega.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreResponsableEntrega() {
        return nombreResponsableEntrega;
    }

    /**
     * Define el valor de la propiedad nombreResponsableEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreResponsableEntrega(JAXBElement<String> value) {
        this.nombreResponsableEntrega = value;
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
     * Obtiene el valor de la propiedad numeroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroIdentificacion(JAXBElement<String> value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacionDV.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroIdentificacionDV() {
        return numeroIdentificacionDV;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacionDV.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroIdentificacionDV(JAXBElement<String> value) {
        this.numeroIdentificacionDV = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroMatriculaMercantil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroMatriculaMercantil() {
        return numeroMatriculaMercantil;
    }

    /**
     * Define el valor de la propiedad numeroMatriculaMercantil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroMatriculaMercantil(JAXBElement<String> value) {
        this.numeroMatriculaMercantil = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefijoFacturacion() {
        return prefijoFacturacion;
    }

    /**
     * Define el valor de la propiedad prefijoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefijoFacturacion(JAXBElement<String> value) {
        this.prefijoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad responsabilidadesRut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObligaciones }{@code >}
     *     
     */
    public JAXBElement<ArrayOfObligaciones> getResponsabilidadesRut() {
        return responsabilidadesRut;
    }

    /**
     * Define el valor de la propiedad responsabilidadesRut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObligaciones }{@code >}
     *     
     */
    public void setResponsabilidadesRut(JAXBElement<ArrayOfObligaciones> value) {
        this.responsabilidadesRut = value;
    }

    /**
     * Obtiene el valor de la propiedad telefax.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefax() {
        return telefax;
    }

    /**
     * Define el valor de la propiedad telefax.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefax(JAXBElement<String> value) {
        this.telefax = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefono(JAXBElement<String> value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoIdentificacion(JAXBElement<String> value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public JAXBElement<Direccion> getTransportadorDireccion() {
        return transportadorDireccion;
    }

    /**
     * Define el valor de la propiedad transportadorDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public void setTransportadorDireccion(JAXBElement<Direccion> value) {
        this.transportadorDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorNombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportadorNombre() {
        return transportadorNombre;
    }

    /**
     * Define el valor de la propiedad transportadorNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportadorNombre(JAXBElement<String> value) {
        this.transportadorNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorNumeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportadorNumeroDocumento() {
        return transportadorNumeroDocumento;
    }

    /**
     * Define el valor de la propiedad transportadorNumeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportadorNumeroDocumento(JAXBElement<String> value) {
        this.transportadorNumeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorNumeroDocumentoDV.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportadorNumeroDocumentoDV() {
        return transportadorNumeroDocumentoDV;
    }

    /**
     * Define el valor de la propiedad transportadorNumeroDocumentoDV.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportadorNumeroDocumentoDV(JAXBElement<String> value) {
        this.transportadorNumeroDocumentoDV = value;
    }

    /**
     * Obtiene el valor de la propiedad transportadorTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportadorTipoIdentificacion() {
        return transportadorTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad transportadorTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportadorTipoIdentificacion(JAXBElement<String> value) {
        this.transportadorTipoIdentificacion = value;
    }

}
