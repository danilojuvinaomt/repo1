
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HistorialDeEntrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HistorialDeEntrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeidoEmailIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeidoEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeidoFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canalDeEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="entregaEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entregaEstatusDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entregaFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaProgramada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajePersonalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nitProveedorReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recepcionEmailComentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recepcionEmailEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recepcionEmailFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recepcionEmailIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistorialDeEntrega", propOrder = {
    "leidoEmailIPAddress",
    "leidoEstatus",
    "leidoFecha",
    "canalDeEntrega",
    "email",
    "entregaEstatus",
    "entregaEstatusDescripcion",
    "entregaFecha",
    "fechaProgramada",
    "mensajePersonalizado",
    "nitProveedorReceptor",
    "recepcionEmailComentario",
    "recepcionEmailEstatus",
    "recepcionEmailFecha",
    "recepcionEmailIPAddress",
    "telefono"
})
public class HistorialDeEntrega {

    @XmlElementRef(name = "LeidoEmailIPAddress", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leidoEmailIPAddress;
    @XmlElementRef(name = "LeidoEstatus", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leidoEstatus;
    @XmlElementRef(name = "LeidoFecha", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leidoFecha;
    @XmlElementRef(name = "canalDeEntrega", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> canalDeEntrega;
    @XmlElementRef(name = "email", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> email;
    @XmlElementRef(name = "entregaEstatus", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entregaEstatus;
    @XmlElementRef(name = "entregaEstatusDescripcion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entregaEstatusDescripcion;
    @XmlElementRef(name = "entregaFecha", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entregaFecha;
    @XmlElementRef(name = "fechaProgramada", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaProgramada;
    @XmlElementRef(name = "mensajePersonalizado", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajePersonalizado;
    @XmlElementRef(name = "nitProveedorReceptor", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nitProveedorReceptor;
    @XmlElementRef(name = "recepcionEmailComentario", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recepcionEmailComentario;
    @XmlElementRef(name = "recepcionEmailEstatus", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recepcionEmailEstatus;
    @XmlElementRef(name = "recepcionEmailFecha", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recepcionEmailFecha;
    @XmlElementRef(name = "recepcionEmailIPAddress", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recepcionEmailIPAddress;
    @XmlElementRef(name = "telefono", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;

    /**
     * Obtiene el valor de la propiedad leidoEmailIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeidoEmailIPAddress() {
        return leidoEmailIPAddress;
    }

    /**
     * Define el valor de la propiedad leidoEmailIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeidoEmailIPAddress(JAXBElement<String> value) {
        this.leidoEmailIPAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad leidoEstatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeidoEstatus() {
        return leidoEstatus;
    }

    /**
     * Define el valor de la propiedad leidoEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeidoEstatus(JAXBElement<String> value) {
        this.leidoEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad leidoFecha.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeidoFecha() {
        return leidoFecha;
    }

    /**
     * Define el valor de la propiedad leidoFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeidoFecha(JAXBElement<String> value) {
        this.leidoFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad canalDeEntrega.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCanalDeEntrega() {
        return canalDeEntrega;
    }

    /**
     * Define el valor de la propiedad canalDeEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCanalDeEntrega(JAXBElement<String> value) {
        this.canalDeEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setEmail(JAXBElement<ArrayOfstring> value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaEstatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntregaEstatus() {
        return entregaEstatus;
    }

    /**
     * Define el valor de la propiedad entregaEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntregaEstatus(JAXBElement<String> value) {
        this.entregaEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaEstatusDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntregaEstatusDescripcion() {
        return entregaEstatusDescripcion;
    }

    /**
     * Define el valor de la propiedad entregaEstatusDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntregaEstatusDescripcion(JAXBElement<String> value) {
        this.entregaEstatusDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaFecha.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntregaFecha() {
        return entregaFecha;
    }

    /**
     * Define el valor de la propiedad entregaFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntregaFecha(JAXBElement<String> value) {
        this.entregaFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProgramada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaProgramada() {
        return fechaProgramada;
    }

    /**
     * Define el valor de la propiedad fechaProgramada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaProgramada(JAXBElement<String> value) {
        this.fechaProgramada = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajePersonalizado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajePersonalizado() {
        return mensajePersonalizado;
    }

    /**
     * Define el valor de la propiedad mensajePersonalizado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajePersonalizado(JAXBElement<String> value) {
        this.mensajePersonalizado = value;
    }

    /**
     * Obtiene el valor de la propiedad nitProveedorReceptor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNitProveedorReceptor() {
        return nitProveedorReceptor;
    }

    /**
     * Define el valor de la propiedad nitProveedorReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNitProveedorReceptor(JAXBElement<String> value) {
        this.nitProveedorReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad recepcionEmailComentario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecepcionEmailComentario() {
        return recepcionEmailComentario;
    }

    /**
     * Define el valor de la propiedad recepcionEmailComentario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecepcionEmailComentario(JAXBElement<String> value) {
        this.recepcionEmailComentario = value;
    }

    /**
     * Obtiene el valor de la propiedad recepcionEmailEstatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecepcionEmailEstatus() {
        return recepcionEmailEstatus;
    }

    /**
     * Define el valor de la propiedad recepcionEmailEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecepcionEmailEstatus(JAXBElement<String> value) {
        this.recepcionEmailEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad recepcionEmailFecha.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecepcionEmailFecha() {
        return recepcionEmailFecha;
    }

    /**
     * Define el valor de la propiedad recepcionEmailFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecepcionEmailFecha(JAXBElement<String> value) {
        this.recepcionEmailFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad recepcionEmailIPAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecepcionEmailIPAddress() {
        return recepcionEmailIPAddress;
    }

    /**
     * Define el valor de la propiedad recepcionEmailIPAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecepcionEmailIPAddress(JAXBElement<String> value) {
        this.recepcionEmailIPAddress = value;
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

}
