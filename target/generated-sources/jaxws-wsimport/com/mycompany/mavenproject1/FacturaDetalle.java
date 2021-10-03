
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadPorEmpaque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadRealUnidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadUnidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargosDescuentos" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfCargosDescuentos" minOccurs="0"/>
 *         &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoIdentificadorPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoPrecio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentosReferenciados" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDocumentoReferenciado" minOccurs="0"/>
 *         &lt;element name="estandarCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estandarCodigoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estandarCodigoIdentificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estandarCodigoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estandarCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estandarOrganizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estandarSubCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/>
 *         &lt;element name="idEsquema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestosDetalles" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfFacturaImpuestos" minOccurs="0"/>
 *         &lt;element name="impuestosTotales" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfImpuestosTotales" minOccurs="0"/>
 *         &lt;element name="informacionAdicional" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfLineaInformacionAdicional" minOccurs="0"/>
 *         &lt;element name="mandatorioNumeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatorioNumeroIdentificacionDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatorioTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="muestraGratis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreFabricante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioTotalSinImpuestos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioVentaUnitario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secuencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCodigoFabricante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaDetalle", propOrder = {
    "cantidadPorEmpaque",
    "cantidadReal",
    "cantidadRealUnidadMedida",
    "cantidadUnidades",
    "cargosDescuentos",
    "codigoFabricante",
    "codigoIdentificadorPais",
    "codigoProducto",
    "codigoTipoPrecio",
    "descripcion",
    "descripcion2",
    "descripcion3",
    "descripcionTecnica",
    "documentosReferenciados",
    "estandarCodigo",
    "estandarCodigoID",
    "estandarCodigoIdentificador",
    "estandarCodigoNombre",
    "estandarCodigoProducto",
    "estandarOrganizacion",
    "estandarSubCodigoProducto",
    "extras",
    "idEsquema",
    "impuestosDetalles",
    "impuestosTotales",
    "informacionAdicional",
    "mandatorioNumeroIdentificacion",
    "mandatorioNumeroIdentificacionDV",
    "mandatorioTipoIdentificacion",
    "marca",
    "modelo",
    "muestraGratis",
    "nombreFabricante",
    "nota",
    "precioReferencia",
    "precioTotal",
    "precioTotalSinImpuestos",
    "precioVentaUnitario",
    "secuencia",
    "seriales",
    "subCodigoFabricante",
    "subCodigoProducto",
    "tipoAIU",
    "unidadMedida"
})
public class FacturaDetalle {

    @XmlElementRef(name = "cantidadPorEmpaque", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantidadPorEmpaque;
    @XmlElementRef(name = "cantidadReal", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantidadReal;
    @XmlElementRef(name = "cantidadRealUnidadMedida", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantidadRealUnidadMedida;
    @XmlElementRef(name = "cantidadUnidades", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantidadUnidades;
    @XmlElementRef(name = "cargosDescuentos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCargosDescuentos> cargosDescuentos;
    @XmlElementRef(name = "codigoFabricante", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoFabricante;
    @XmlElementRef(name = "codigoIdentificadorPais", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoIdentificadorPais;
    @XmlElementRef(name = "codigoProducto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProducto;
    @XmlElementRef(name = "codigoTipoPrecio", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoPrecio;
    @XmlElementRef(name = "descripcion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "descripcion2", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion2;
    @XmlElementRef(name = "descripcion3", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion3;
    @XmlElementRef(name = "descripcionTecnica", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionTecnica;
    @XmlElementRef(name = "documentosReferenciados", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentoReferenciado> documentosReferenciados;
    @XmlElementRef(name = "estandarCodigo", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estandarCodigo;
    @XmlElementRef(name = "estandarCodigoID", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estandarCodigoID;
    @XmlElementRef(name = "estandarCodigoIdentificador", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estandarCodigoIdentificador;
    @XmlElementRef(name = "estandarCodigoNombre", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estandarCodigoNombre;
    @XmlElementRef(name = "estandarCodigoProducto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estandarCodigoProducto;
    @XmlElementRef(name = "estandarOrganizacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estandarOrganizacion;
    @XmlElementRef(name = "estandarSubCodigoProducto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estandarSubCodigoProducto;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtensible> extras;
    @XmlElementRef(name = "idEsquema", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idEsquema;
    @XmlElementRef(name = "impuestosDetalles", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFacturaImpuestos> impuestosDetalles;
    @XmlElementRef(name = "impuestosTotales", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfImpuestosTotales> impuestosTotales;
    @XmlElementRef(name = "informacionAdicional", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineaInformacionAdicional> informacionAdicional;
    @XmlElementRef(name = "mandatorioNumeroIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mandatorioNumeroIdentificacion;
    @XmlElementRef(name = "mandatorioNumeroIdentificacionDV", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mandatorioNumeroIdentificacionDV;
    @XmlElementRef(name = "mandatorioTipoIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mandatorioTipoIdentificacion;
    @XmlElementRef(name = "marca", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marca;
    @XmlElementRef(name = "modelo", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelo;
    @XmlElementRef(name = "muestraGratis", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> muestraGratis;
    @XmlElementRef(name = "nombreFabricante", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreFabricante;
    @XmlElementRef(name = "nota", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nota;
    @XmlElementRef(name = "precioReferencia", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> precioReferencia;
    @XmlElementRef(name = "precioTotal", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> precioTotal;
    @XmlElementRef(name = "precioTotalSinImpuestos", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> precioTotalSinImpuestos;
    @XmlElementRef(name = "precioVentaUnitario", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> precioVentaUnitario;
    @XmlElementRef(name = "secuencia", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secuencia;
    @XmlElementRef(name = "seriales", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seriales;
    @XmlElementRef(name = "subCodigoFabricante", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subCodigoFabricante;
    @XmlElementRef(name = "subCodigoProducto", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subCodigoProducto;
    @XmlElementRef(name = "tipoAIU", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoAIU;
    @XmlElementRef(name = "unidadMedida", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidadMedida;

    /**
     * Obtiene el valor de la propiedad cantidadPorEmpaque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantidadPorEmpaque() {
        return cantidadPorEmpaque;
    }

    /**
     * Define el valor de la propiedad cantidadPorEmpaque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantidadPorEmpaque(JAXBElement<String> value) {
        this.cantidadPorEmpaque = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadReal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantidadReal() {
        return cantidadReal;
    }

    /**
     * Define el valor de la propiedad cantidadReal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantidadReal(JAXBElement<String> value) {
        this.cantidadReal = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadRealUnidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantidadRealUnidadMedida() {
        return cantidadRealUnidadMedida;
    }

    /**
     * Define el valor de la propiedad cantidadRealUnidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantidadRealUnidadMedida(JAXBElement<String> value) {
        this.cantidadRealUnidadMedida = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadUnidades.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantidadUnidades() {
        return cantidadUnidades;
    }

    /**
     * Define el valor de la propiedad cantidadUnidades.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantidadUnidades(JAXBElement<String> value) {
        this.cantidadUnidades = value;
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
     * Obtiene el valor de la propiedad codigoFabricante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoFabricante() {
        return codigoFabricante;
    }

    /**
     * Define el valor de la propiedad codigoFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoFabricante(JAXBElement<String> value) {
        this.codigoFabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoIdentificadorPais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoIdentificadorPais() {
        return codigoIdentificadorPais;
    }

    /**
     * Define el valor de la propiedad codigoIdentificadorPais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoIdentificadorPais(JAXBElement<String> value) {
        this.codigoIdentificadorPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProducto(JAXBElement<String> value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoPrecio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoPrecio() {
        return codigoTipoPrecio;
    }

    /**
     * Define el valor de la propiedad codigoTipoPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoPrecio(JAXBElement<String> value) {
        this.codigoTipoPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion2() {
        return descripcion2;
    }

    /**
     * Define el valor de la propiedad descripcion2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion2(JAXBElement<String> value) {
        this.descripcion2 = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion3() {
        return descripcion3;
    }

    /**
     * Define el valor de la propiedad descripcion3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion3(JAXBElement<String> value) {
        this.descripcion3 = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTecnica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionTecnica() {
        return descripcionTecnica;
    }

    /**
     * Define el valor de la propiedad descripcionTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionTecnica(JAXBElement<String> value) {
        this.descripcionTecnica = value;
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
     * Obtiene el valor de la propiedad estandarCodigo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstandarCodigo() {
        return estandarCodigo;
    }

    /**
     * Define el valor de la propiedad estandarCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstandarCodigo(JAXBElement<String> value) {
        this.estandarCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstandarCodigoID() {
        return estandarCodigoID;
    }

    /**
     * Define el valor de la propiedad estandarCodigoID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstandarCodigoID(JAXBElement<String> value) {
        this.estandarCodigoID = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoIdentificador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstandarCodigoIdentificador() {
        return estandarCodigoIdentificador;
    }

    /**
     * Define el valor de la propiedad estandarCodigoIdentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstandarCodigoIdentificador(JAXBElement<String> value) {
        this.estandarCodigoIdentificador = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoNombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstandarCodigoNombre() {
        return estandarCodigoNombre;
    }

    /**
     * Define el valor de la propiedad estandarCodigoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstandarCodigoNombre(JAXBElement<String> value) {
        this.estandarCodigoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarCodigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstandarCodigoProducto() {
        return estandarCodigoProducto;
    }

    /**
     * Define el valor de la propiedad estandarCodigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstandarCodigoProducto(JAXBElement<String> value) {
        this.estandarCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarOrganizacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstandarOrganizacion() {
        return estandarOrganizacion;
    }

    /**
     * Define el valor de la propiedad estandarOrganizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstandarOrganizacion(JAXBElement<String> value) {
        this.estandarOrganizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estandarSubCodigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstandarSubCodigoProducto() {
        return estandarSubCodigoProducto;
    }

    /**
     * Define el valor de la propiedad estandarSubCodigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstandarSubCodigoProducto(JAXBElement<String> value) {
        this.estandarSubCodigoProducto = value;
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
     * Obtiene el valor de la propiedad idEsquema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdEsquema() {
        return idEsquema;
    }

    /**
     * Define el valor de la propiedad idEsquema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdEsquema(JAXBElement<String> value) {
        this.idEsquema = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosDetalles.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFacturaImpuestos> getImpuestosDetalles() {
        return impuestosDetalles;
    }

    /**
     * Define el valor de la propiedad impuestosDetalles.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}
     *     
     */
    public void setImpuestosDetalles(JAXBElement<ArrayOfFacturaImpuestos> value) {
        this.impuestosDetalles = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineaInformacionAdicional }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineaInformacionAdicional> getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
     * Define el valor de la propiedad informacionAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineaInformacionAdicional }{@code >}
     *     
     */
    public void setInformacionAdicional(JAXBElement<ArrayOfLineaInformacionAdicional> value) {
        this.informacionAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatorioNumeroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMandatorioNumeroIdentificacion() {
        return mandatorioNumeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad mandatorioNumeroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMandatorioNumeroIdentificacion(JAXBElement<String> value) {
        this.mandatorioNumeroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatorioNumeroIdentificacionDV.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMandatorioNumeroIdentificacionDV() {
        return mandatorioNumeroIdentificacionDV;
    }

    /**
     * Define el valor de la propiedad mandatorioNumeroIdentificacionDV.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMandatorioNumeroIdentificacionDV(JAXBElement<String> value) {
        this.mandatorioNumeroIdentificacionDV = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatorioTipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMandatorioTipoIdentificacion() {
        return mandatorioTipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad mandatorioTipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMandatorioTipoIdentificacion(JAXBElement<String> value) {
        this.mandatorioTipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarca(JAXBElement<String> value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelo(JAXBElement<String> value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad muestraGratis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMuestraGratis() {
        return muestraGratis;
    }

    /**
     * Define el valor de la propiedad muestraGratis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMuestraGratis(JAXBElement<String> value) {
        this.muestraGratis = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFabricante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreFabricante() {
        return nombreFabricante;
    }

    /**
     * Define el valor de la propiedad nombreFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreFabricante(JAXBElement<String> value) {
        this.nombreFabricante = value;
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
     * Obtiene el valor de la propiedad precioReferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrecioReferencia() {
        return precioReferencia;
    }

    /**
     * Define el valor de la propiedad precioReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrecioReferencia(JAXBElement<String> value) {
        this.precioReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Define el valor de la propiedad precioTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrecioTotal(JAXBElement<String> value) {
        this.precioTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotalSinImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrecioTotalSinImpuestos() {
        return precioTotalSinImpuestos;
    }

    /**
     * Define el valor de la propiedad precioTotalSinImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrecioTotalSinImpuestos(JAXBElement<String> value) {
        this.precioTotalSinImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad precioVentaUnitario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrecioVentaUnitario() {
        return precioVentaUnitario;
    }

    /**
     * Define el valor de la propiedad precioVentaUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrecioVentaUnitario(JAXBElement<String> value) {
        this.precioVentaUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad secuencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecuencia() {
        return secuencia;
    }

    /**
     * Define el valor de la propiedad secuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecuencia(JAXBElement<String> value) {
        this.secuencia = value;
    }

    /**
     * Obtiene el valor de la propiedad seriales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeriales() {
        return seriales;
    }

    /**
     * Define el valor de la propiedad seriales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeriales(JAXBElement<String> value) {
        this.seriales = value;
    }

    /**
     * Obtiene el valor de la propiedad subCodigoFabricante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubCodigoFabricante() {
        return subCodigoFabricante;
    }

    /**
     * Define el valor de la propiedad subCodigoFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubCodigoFabricante(JAXBElement<String> value) {
        this.subCodigoFabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad subCodigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubCodigoProducto() {
        return subCodigoProducto;
    }

    /**
     * Define el valor de la propiedad subCodigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubCodigoProducto(JAXBElement<String> value) {
        this.subCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAIU.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoAIU() {
        return tipoAIU;
    }

    /**
     * Define el valor de la propiedad tipoAIU.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoAIU(JAXBElement<String> value) {
        this.tipoAIU = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Define el valor de la propiedad unidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidadMedida(JAXBElement<String> value) {
        this.unidadMedida = value;
    }

}
