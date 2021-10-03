
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actividadEconomicaCIIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatario" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDestinatario" minOccurs="0"/>
 *         &lt;element name="detallesTributarios" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfTributos" minOccurs="0"/>
 *         &lt;element name="direccionCliente" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/>
 *         &lt;element name="direccionFiscal" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/>
 *         &lt;element name="informacionLegalCliente" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}InformacionLegal" minOccurs="0"/>
 *         &lt;element name="nombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroIdentificacionDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsabilidadesRut" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfObligaciones" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cliente", propOrder = {
    "actividadEconomicaCIIU",
    "apellido",
    "destinatario",
    "detallesTributarios",
    "direccionCliente",
    "direccionFiscal",
    "email",
    "extras",
    "informacionLegalCliente",
    "nombreComercial",
    "nombreContacto",
    "nombreRazonSocial",
    "nota",
    "notificar",
    "numeroDocumento",
    "numeroIdentificacionDV",
    "responsabilidadesRut",
    "segundoNombre",
    "telefax",
    "telefono",
    "tipoIdentificacion",
    "tipoPersona"
})
public class Cliente {

    @XmlElementRef(name = "actividadEconomicaCIIU", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomicaCIIU;
    @XmlElementRef(name = "apellido", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido;
    @XmlElementRef(name = "destinatario", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDestinatario> destinatario;
    @XmlElementRef(name = "detallesTributarios", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTributos> detallesTributarios;
    @XmlElementRef(name = "direccionCliente", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Direccion> direccionCliente;
    @XmlElementRef(name = "direccionFiscal", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Direccion> direccionFiscal;
    @XmlElementRef(name = "email", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtensible> extras;
    @XmlElementRef(name = "informacionLegalCliente", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<InformacionLegal> informacionLegalCliente;
    @XmlElementRef(name = "nombreComercial", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreComercial;
    @XmlElementRef(name = "nombreContacto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreContacto;
    @XmlElementRef(name = "nombreRazonSocial", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreRazonSocial;
    @XmlElementRef(name = "nota", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nota;
    @XmlElementRef(name = "notificar", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notificar;
    @XmlElementRef(name = "numeroDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocumento;
    @XmlElementRef(name = "numeroIdentificacionDV", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroIdentificacionDV;
    @XmlElementRef(name = "responsabilidadesRut", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfObligaciones> responsabilidadesRut;
    @XmlElementRef(name = "segundoNombre", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoNombre;
    @XmlElementRef(name = "telefax", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefax;
    @XmlElementRef(name = "telefono", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;
    @XmlElementRef(name = "tipoIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoIdentificacion;
    @XmlElementRef(name = "tipoPersona", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPersona;

    /**
     * Obtiene el valor de la propiedad actividadEconomicaCIIU.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActividadEconomicaCIIU() {
        return actividadEconomicaCIIU;
    }

    /**
     * Define el valor de la propiedad actividadEconomicaCIIU.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActividadEconomicaCIIU(JAXBElement<String> value) {
        this.actividadEconomicaCIIU = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido(JAXBElement<String> value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDestinatario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDestinatario> getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDestinatario }{@code >}
     *     
     */
    public void setDestinatario(JAXBElement<ArrayOfDestinatario> value) {
        this.destinatario = value;
    }

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
     * Obtiene el valor de la propiedad direccionCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public JAXBElement<Direccion> getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * Define el valor de la propiedad direccionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public void setDireccionCliente(JAXBElement<Direccion> value) {
        this.direccionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionFiscal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public JAXBElement<Direccion> getDireccionFiscal() {
        return direccionFiscal;
    }

    /**
     * Define el valor de la propiedad direccionFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public void setDireccionFiscal(JAXBElement<Direccion> value) {
        this.direccionFiscal = value;
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
     * Obtiene el valor de la propiedad informacionLegalCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InformacionLegal }{@code >}
     *     
     */
    public JAXBElement<InformacionLegal> getInformacionLegalCliente() {
        return informacionLegalCliente;
    }

    /**
     * Define el valor de la propiedad informacionLegalCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InformacionLegal }{@code >}
     *     
     */
    public void setInformacionLegalCliente(JAXBElement<InformacionLegal> value) {
        this.informacionLegalCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreComercial(JAXBElement<String> value) {
        this.nombreComercial = value;
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
     * Obtiene el valor de la propiedad nombreRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    /**
     * Define el valor de la propiedad nombreRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreRazonSocial(JAXBElement<String> value) {
        this.nombreRazonSocial = value;
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
     * Obtiene el valor de la propiedad notificar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificar() {
        return notificar;
    }

    /**
     * Define el valor de la propiedad notificar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificar(JAXBElement<String> value) {
        this.notificar = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocumento(JAXBElement<String> value) {
        this.numeroDocumento = value;
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
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoNombre(JAXBElement<String> value) {
        this.segundoNombre = value;
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
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPersona(JAXBElement<String> value) {
        this.tipoPersona = value;
    }

}
