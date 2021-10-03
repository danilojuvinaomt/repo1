
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaGeneral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaGeneral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anticipos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfAnticipos" minOccurs="0"/>
 *         &lt;element name="autorizado" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Autorizado" minOccurs="0"/>
 *         &lt;element name="cantidadDecimales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargosDescuentos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCargosDescuentos" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Cliente" minOccurs="0"/>
 *         &lt;element name="condicionPago" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCondicionDePago" minOccurs="0"/>
 *         &lt;element name="consecutivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleDeFactura" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfFacturaDetalle" minOccurs="0"/>
 *         &lt;element name="documentosReferenciados" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDocumentoReferenciado" minOccurs="0"/>
 *         &lt;element name="entregaMercancia" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Entrega" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtras" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFinPeriodoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicioPeriodoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPagoImpuestos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestosGenerales" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfFacturaImpuestos" minOccurs="0"/>
 *         &lt;element name="impuestosTotales" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfImpuestosTotales" minOccurs="0"/>
 *         &lt;element name="informacionAdicional" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="mediosDePago" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfMediosDePago" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordenDeCompra" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfOrdenDeCompra" minOccurs="0"/>
 *         &lt;element name="propina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangoNumeracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redondeoAplicado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectorSalud" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}SectorSalud" minOccurs="0"/>
 *         &lt;element name="tasaDeCambio" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}TasaDeCambio" minOccurs="0"/>
 *         &lt;element name="tasaDeCambioAlternativa" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}TasaDeCambioAlternativa" minOccurs="0"/>
 *         &lt;element name="terminosEntrega" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}TerminosDeEntrega" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAnticipos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalBaseImponible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalBrutoConImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCargosAplicados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDescuentos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMonto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalProductos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalSinImpuestos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaGeneral", propOrder = {
    "anticipos",
    "autorizado",
    "cantidadDecimales",
    "cargosDescuentos",
    "cliente",
    "condicionPago",
    "consecutivoDocumento",
    "detalleDeFactura",
    "documentosReferenciados",
    "entregaMercancia",
    "extras",
    "fechaEmision",
    "fechaFinPeriodoFacturacion",
    "fechaInicioPeriodoFacturacion",
    "fechaPagoImpuestos",
    "fechaVencimiento",
    "impuestosGenerales",
    "impuestosTotales",
    "informacionAdicional",
    "mediosDePago",
    "moneda",
    "ordenDeCompra",
    "propina",
    "rangoNumeracion",
    "redondeoAplicado",
    "sectorSalud",
    "tasaDeCambio",
    "tasaDeCambioAlternativa",
    "terminosEntrega",
    "tipoDocumento",
    "tipoOperacion",
    "tipoSector",
    "totalAnticipos",
    "totalBaseImponible",
    "totalBrutoConImpuesto",
    "totalCargosAplicados",
    "totalDescuentos",
    "totalMonto",
    "totalProductos",
    "totalSinImpuestos"
})
public class FacturaGeneral {

    @XmlElementRef(name = "anticipos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAnticipos> anticipos;
    @XmlElementRef(name = "autorizado", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Autorizado> autorizado;
    @XmlElementRef(name = "cantidadDecimales", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantidadDecimales;
    @XmlElementRef(name = "cargosDescuentos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCargosDescuentos> cargosDescuentos;
    @XmlElementRef(name = "cliente", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Cliente> cliente;
    @XmlElementRef(name = "condicionPago", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCondicionDePago> condicionPago;
    @XmlElementRef(name = "consecutivoDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consecutivoDocumento;
    @XmlElementRef(name = "detalleDeFactura", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFacturaDetalle> detalleDeFactura;
    @XmlElementRef(name = "documentosReferenciados", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentoReferenciado> documentosReferenciados;
    @XmlElementRef(name = "entregaMercancia", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<Entrega> entregaMercancia;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtras> extras;
    @XmlElementRef(name = "fechaEmision", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaEmision;
    @XmlElementRef(name = "fechaFinPeriodoFacturacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaFinPeriodoFacturacion;
    @XmlElementRef(name = "fechaInicioPeriodoFacturacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaInicioPeriodoFacturacion;
    @XmlElementRef(name = "fechaPagoImpuestos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaPagoImpuestos;
    @XmlElementRef(name = "fechaVencimiento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaVencimiento;
    @XmlElementRef(name = "impuestosGenerales", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFacturaImpuestos> impuestosGenerales;
    @XmlElementRef(name = "impuestosTotales", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfImpuestosTotales> impuestosTotales;
    @XmlElementRef(name = "informacionAdicional", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> informacionAdicional;
    @XmlElementRef(name = "mediosDePago", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMediosDePago> mediosDePago;
    @XmlElementRef(name = "moneda", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moneda;
    @XmlElementRef(name = "ordenDeCompra", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrdenDeCompra> ordenDeCompra;
    @XmlElementRef(name = "propina", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> propina;
    @XmlElementRef(name = "rangoNumeracion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rangoNumeracion;
    @XmlElementRef(name = "redondeoAplicado", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redondeoAplicado;
    @XmlElementRef(name = "sectorSalud", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<SectorSalud> sectorSalud;
    @XmlElementRef(name = "tasaDeCambio", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<TasaDeCambio> tasaDeCambio;
    @XmlElementRef(name = "tasaDeCambioAlternativa", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<TasaDeCambioAlternativa> tasaDeCambioAlternativa;
    @XmlElementRef(name = "terminosEntrega", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminosDeEntrega> terminosEntrega;
    @XmlElementRef(name = "tipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumento;
    @XmlElementRef(name = "tipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOperacion;
    @XmlElementRef(name = "tipoSector", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoSector;
    @XmlElementRef(name = "totalAnticipos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalAnticipos;
    @XmlElementRef(name = "totalBaseImponible", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalBaseImponible;
    @XmlElementRef(name = "totalBrutoConImpuesto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalBrutoConImpuesto;
    @XmlElementRef(name = "totalCargosAplicados", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalCargosAplicados;
    @XmlElementRef(name = "totalDescuentos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalDescuentos;
    @XmlElementRef(name = "totalMonto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalMonto;
    @XmlElementRef(name = "totalProductos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalProductos;
    @XmlElementRef(name = "totalSinImpuestos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalSinImpuestos;

    /**
     * Obtiene el valor de la propiedad anticipos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnticipos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAnticipos> getAnticipos() {
        return anticipos;
    }

    /**
     * Define el valor de la propiedad anticipos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnticipos }{@code >}
     *     
     */
    public void setAnticipos(JAXBElement<ArrayOfAnticipos> value) {
        this.anticipos = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Autorizado }{@code >}
     *     
     */
    public JAXBElement<Autorizado> getAutorizado() {
        return autorizado;
    }

    /**
     * Define el valor de la propiedad autorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Autorizado }{@code >}
     *     
     */
    public void setAutorizado(JAXBElement<Autorizado> value) {
        this.autorizado = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadDecimales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantidadDecimales() {
        return cantidadDecimales;
    }

    /**
     * Define el valor de la propiedad cantidadDecimales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantidadDecimales(JAXBElement<String> value) {
        this.cantidadDecimales = value;
    }

    /**
     * Obtiene el valor de la propiedad cargosDescuentos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCargosDescuentos> getCargosDescuentos() {
        return cargosDescuentos;
    }

    /**
     * Define el valor de la propiedad cargosDescuentos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}
     *     
     */
    public void setCargosDescuentos(JAXBElement<ArrayOfCargosDescuentos> value) {
        this.cargosDescuentos = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     *     
     */
    public JAXBElement<Cliente> getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     *     
     */
    public void setCliente(JAXBElement<Cliente> value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionPago.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicionDePago }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCondicionDePago> getCondicionPago() {
        return condicionPago;
    }

    /**
     * Define el valor de la propiedad condicionPago.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicionDePago }{@code >}
     *     
     */
    public void setCondicionPago(JAXBElement<ArrayOfCondicionDePago> value) {
        this.condicionPago = value;
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
     * Obtiene el valor de la propiedad detalleDeFactura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFacturaDetalle }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFacturaDetalle> getDetalleDeFactura() {
        return detalleDeFactura;
    }

    /**
     * Define el valor de la propiedad detalleDeFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFacturaDetalle }{@code >}
     *     
     */
    public void setDetalleDeFactura(JAXBElement<ArrayOfFacturaDetalle> value) {
        this.detalleDeFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad documentosReferenciados.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoReferenciado }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentoReferenciado> getDocumentosReferenciados() {
        return documentosReferenciados;
    }

    /**
     * Define el valor de la propiedad documentosReferenciados.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoReferenciado }{@code >}
     *     
     */
    public void setDocumentosReferenciados(JAXBElement<ArrayOfDocumentoReferenciado> value) {
        this.documentosReferenciados = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaMercancia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entrega }{@code >}
     *     
     */
    public JAXBElement<Entrega> getEntregaMercancia() {
        return entregaMercancia;
    }

    /**
     * Define el valor de la propiedad entregaMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entrega }{@code >}
     *     
     */
    public void setEntregaMercancia(JAXBElement<Entrega> value) {
        this.entregaMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtras }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExtras> getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtras }{@code >}
     *     
     */
    public void setExtras(JAXBElement<ArrayOfExtras> value) {
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
     * Obtiene el valor de la propiedad fechaFinPeriodoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaFinPeriodoFacturacion() {
        return fechaFinPeriodoFacturacion;
    }

    /**
     * Define el valor de la propiedad fechaFinPeriodoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaFinPeriodoFacturacion(JAXBElement<String> value) {
        this.fechaFinPeriodoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioPeriodoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaInicioPeriodoFacturacion() {
        return fechaInicioPeriodoFacturacion;
    }

    /**
     * Define el valor de la propiedad fechaInicioPeriodoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaInicioPeriodoFacturacion(JAXBElement<String> value) {
        this.fechaInicioPeriodoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPagoImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaPagoImpuestos() {
        return fechaPagoImpuestos;
    }

    /**
     * Define el valor de la propiedad fechaPagoImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaPagoImpuestos(JAXBElement<String> value) {
        this.fechaPagoImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaVencimiento(JAXBElement<String> value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosGenerales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFacturaImpuestos> getImpuestosGenerales() {
        return impuestosGenerales;
    }

    /**
     * Define el valor de la propiedad impuestosGenerales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}
     *     
     */
    public void setImpuestosGenerales(JAXBElement<ArrayOfFacturaImpuestos> value) {
        this.impuestosGenerales = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosTotales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImpuestosTotales }{@code >}
     *     
     */
    public JAXBElement<ArrayOfImpuestosTotales> getImpuestosTotales() {
        return impuestosTotales;
    }

    /**
     * Define el valor de la propiedad impuestosTotales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImpuestosTotales }{@code >}
     *     
     */
    public void setImpuestosTotales(JAXBElement<ArrayOfImpuestosTotales> value) {
        this.impuestosTotales = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAdicional.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
     * Define el valor de la propiedad informacionAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setInformacionAdicional(JAXBElement<ArrayOfstring> value) {
        this.informacionAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad mediosDePago.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMediosDePago }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMediosDePago> getMediosDePago() {
        return mediosDePago;
    }

    /**
     * Define el valor de la propiedad mediosDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMediosDePago }{@code >}
     *     
     */
    public void setMediosDePago(JAXBElement<ArrayOfMediosDePago> value) {
        this.mediosDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMoneda(JAXBElement<String> value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenDeCompra.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrdenDeCompra }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrdenDeCompra> getOrdenDeCompra() {
        return ordenDeCompra;
    }

    /**
     * Define el valor de la propiedad ordenDeCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrdenDeCompra }{@code >}
     *     
     */
    public void setOrdenDeCompra(JAXBElement<ArrayOfOrdenDeCompra> value) {
        this.ordenDeCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad propina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPropina() {
        return propina;
    }

    /**
     * Define el valor de la propiedad propina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPropina(JAXBElement<String> value) {
        this.propina = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoNumeracion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRangoNumeracion() {
        return rangoNumeracion;
    }

    /**
     * Define el valor de la propiedad rangoNumeracion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRangoNumeracion(JAXBElement<String> value) {
        this.rangoNumeracion = value;
    }

    /**
     * Obtiene el valor de la propiedad redondeoAplicado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedondeoAplicado() {
        return redondeoAplicado;
    }

    /**
     * Define el valor de la propiedad redondeoAplicado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedondeoAplicado(JAXBElement<String> value) {
        this.redondeoAplicado = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorSalud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SectorSalud }{@code >}
     *     
     */
    public JAXBElement<SectorSalud> getSectorSalud() {
        return sectorSalud;
    }

    /**
     * Define el valor de la propiedad sectorSalud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SectorSalud }{@code >}
     *     
     */
    public void setSectorSalud(JAXBElement<SectorSalud> value) {
        this.sectorSalud = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaDeCambio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TasaDeCambio }{@code >}
     *     
     */
    public JAXBElement<TasaDeCambio> getTasaDeCambio() {
        return tasaDeCambio;
    }

    /**
     * Define el valor de la propiedad tasaDeCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TasaDeCambio }{@code >}
     *     
     */
    public void setTasaDeCambio(JAXBElement<TasaDeCambio> value) {
        this.tasaDeCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaDeCambioAlternativa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TasaDeCambioAlternativa }{@code >}
     *     
     */
    public JAXBElement<TasaDeCambioAlternativa> getTasaDeCambioAlternativa() {
        return tasaDeCambioAlternativa;
    }

    /**
     * Define el valor de la propiedad tasaDeCambioAlternativa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TasaDeCambioAlternativa }{@code >}
     *     
     */
    public void setTasaDeCambioAlternativa(JAXBElement<TasaDeCambioAlternativa> value) {
        this.tasaDeCambioAlternativa = value;
    }

    /**
     * Obtiene el valor de la propiedad terminosEntrega.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerminosDeEntrega }{@code >}
     *     
     */
    public JAXBElement<TerminosDeEntrega> getTerminosEntrega() {
        return terminosEntrega;
    }

    /**
     * Define el valor de la propiedad terminosEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerminosDeEntrega }{@code >}
     *     
     */
    public void setTerminosEntrega(JAXBElement<TerminosDeEntrega> value) {
        this.terminosEntrega = value;
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
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoOperacion(JAXBElement<String> value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoSector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoSector() {
        return tipoSector;
    }

    /**
     * Define el valor de la propiedad tipoSector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoSector(JAXBElement<String> value) {
        this.tipoSector = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAnticipos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalAnticipos() {
        return totalAnticipos;
    }

    /**
     * Define el valor de la propiedad totalAnticipos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalAnticipos(JAXBElement<String> value) {
        this.totalAnticipos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBaseImponible.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalBaseImponible() {
        return totalBaseImponible;
    }

    /**
     * Define el valor de la propiedad totalBaseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalBaseImponible(JAXBElement<String> value) {
        this.totalBaseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBrutoConImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalBrutoConImpuesto() {
        return totalBrutoConImpuesto;
    }

    /**
     * Define el valor de la propiedad totalBrutoConImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalBrutoConImpuesto(JAXBElement<String> value) {
        this.totalBrutoConImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCargosAplicados.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalCargosAplicados() {
        return totalCargosAplicados;
    }

    /**
     * Define el valor de la propiedad totalCargosAplicados.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalCargosAplicados(JAXBElement<String> value) {
        this.totalCargosAplicados = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDescuentos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalDescuentos() {
        return totalDescuentos;
    }

    /**
     * Define el valor de la propiedad totalDescuentos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalDescuentos(JAXBElement<String> value) {
        this.totalDescuentos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMonto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalMonto() {
        return totalMonto;
    }

    /**
     * Define el valor de la propiedad totalMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalMonto(JAXBElement<String> value) {
        this.totalMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad totalProductos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalProductos() {
        return totalProductos;
    }

    /**
     * Define el valor de la propiedad totalProductos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalProductos(JAXBElement<String> value) {
        this.totalProductos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSinImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalSinImpuestos() {
        return totalSinImpuestos;
    }

    /**
     * Define el valor de la propiedad totalSinImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalSinImpuestos(JAXBElement<String> value) {
        this.totalSinImpuestos = value;
    }

}
