
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Entrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Entrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosTransportistas" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}DatosDelTransportista" minOccurs="0"/>
 *         &lt;element name="direccionDespacho" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/>
 *         &lt;element name="direccionEntrega" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Direccion" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/>
 *         &lt;element name="fechaEfectivaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEstimada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSolicitada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entrega", propOrder = {
    "datosTransportistas",
    "direccionDespacho",
    "direccionEntrega",
    "extras",
    "fechaEfectivaSalida",
    "fechaEstimada",
    "fechaReal",
    "fechaSolicitada",
    "identificacionTransporte",
    "matriculaTransporte"
})
public class Entrega {

    @XmlElementRef(name = "datosTransportistas", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosDelTransportista> datosTransportistas;
    @XmlElementRef(name = "direccionDespacho", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Direccion> direccionDespacho;
    @XmlElementRef(name = "direccionEntrega", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Direccion> direccionEntrega;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtensible> extras;
    @XmlElementRef(name = "fechaEfectivaSalida", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEfectivaSalida;
    @XmlElementRef(name = "fechaEstimada", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEstimada;
    @XmlElementRef(name = "fechaReal", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaReal;
    @XmlElementRef(name = "fechaSolicitada", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaSolicitada;
    @XmlElementRef(name = "identificacionTransporte", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionTransporte;
    @XmlElementRef(name = "matriculaTransporte", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matriculaTransporte;

    /**
     * Obtiene el valor de la propiedad datosTransportistas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosDelTransportista }{@code >}
     *     
     */
    public JAXBElement<DatosDelTransportista> getDatosTransportistas() {
        return datosTransportistas;
    }

    /**
     * Define el valor de la propiedad datosTransportistas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosDelTransportista }{@code >}
     *     
     */
    public void setDatosTransportistas(JAXBElement<DatosDelTransportista> value) {
        this.datosTransportistas = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDespacho.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public JAXBElement<Direccion> getDireccionDespacho() {
        return direccionDespacho;
    }

    /**
     * Define el valor de la propiedad direccionDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public void setDireccionDespacho(JAXBElement<Direccion> value) {
        this.direccionDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionEntrega.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public JAXBElement<Direccion> getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Define el valor de la propiedad direccionEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     *     
     */
    public void setDireccionEntrega(JAXBElement<Direccion> value) {
        this.direccionEntrega = value;
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
     * Obtiene el valor de la propiedad fechaEfectivaSalida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaEfectivaSalida() {
        return fechaEfectivaSalida;
    }

    /**
     * Define el valor de la propiedad fechaEfectivaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaEfectivaSalida(JAXBElement<String> value) {
        this.fechaEfectivaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEstimada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaEstimada() {
        return fechaEstimada;
    }

    /**
     * Define el valor de la propiedad fechaEstimada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaEstimada(JAXBElement<String> value) {
        this.fechaEstimada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaReal() {
        return fechaReal;
    }

    /**
     * Define el valor de la propiedad fechaReal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaReal(JAXBElement<String> value) {
        this.fechaReal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaSolicitada() {
        return fechaSolicitada;
    }

    /**
     * Define el valor de la propiedad fechaSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaSolicitada(JAXBElement<String> value) {
        this.fechaSolicitada = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTransporte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionTransporte() {
        return identificacionTransporte;
    }

    /**
     * Define el valor de la propiedad identificacionTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionTransporte(JAXBElement<String> value) {
        this.identificacionTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculaTransporte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatriculaTransporte() {
        return matriculaTransporte;
    }

    /**
     * Define el valor de la propiedad matriculaTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatriculaTransporte(JAXBElement<String> value) {
        this.matriculaTransporte = value;
    }

}
