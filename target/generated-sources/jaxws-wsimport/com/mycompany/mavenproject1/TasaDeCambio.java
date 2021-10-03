
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TasaDeCambio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TasaDeCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseMonedaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseMonedaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtensible" minOccurs="0"/>
 *         &lt;element name="fechaDeTasaDeCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorDeTasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operadorCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaDeCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TasaDeCambio", propOrder = {
    "baseMonedaDestino",
    "baseMonedaOrigen",
    "extras",
    "fechaDeTasaDeCambio",
    "indicadorDeTasa",
    "monedaDestino",
    "monedaOrigen",
    "operadorCalculo",
    "tasaDeCambio"
})
public class TasaDeCambio {

    @XmlElementRef(name = "baseMonedaDestino", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseMonedaDestino;
    @XmlElementRef(name = "baseMonedaOrigen", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseMonedaOrigen;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtensible> extras;
    @XmlElementRef(name = "fechaDeTasaDeCambio", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaDeTasaDeCambio;
    @XmlElementRef(name = "indicadorDeTasa", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicadorDeTasa;
    @XmlElementRef(name = "monedaDestino", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monedaDestino;
    @XmlElementRef(name = "monedaOrigen", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monedaOrigen;
    @XmlElementRef(name = "operadorCalculo", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operadorCalculo;
    @XmlElementRef(name = "tasaDeCambio", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tasaDeCambio;

    /**
     * Obtiene el valor de la propiedad baseMonedaDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseMonedaDestino() {
        return baseMonedaDestino;
    }

    /**
     * Define el valor de la propiedad baseMonedaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseMonedaDestino(JAXBElement<String> value) {
        this.baseMonedaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad baseMonedaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseMonedaOrigen() {
        return baseMonedaOrigen;
    }

    /**
     * Define el valor de la propiedad baseMonedaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseMonedaOrigen(JAXBElement<String> value) {
        this.baseMonedaOrigen = value;
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
     * Obtiene el valor de la propiedad fechaDeTasaDeCambio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaDeTasaDeCambio() {
        return fechaDeTasaDeCambio;
    }

    /**
     * Define el valor de la propiedad fechaDeTasaDeCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaDeTasaDeCambio(JAXBElement<String> value) {
        this.fechaDeTasaDeCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorDeTasa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicadorDeTasa() {
        return indicadorDeTasa;
    }

    /**
     * Define el valor de la propiedad indicadorDeTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicadorDeTasa(JAXBElement<String> value) {
        this.indicadorDeTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonedaDestino() {
        return monedaDestino;
    }

    /**
     * Define el valor de la propiedad monedaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonedaDestino(JAXBElement<String> value) {
        this.monedaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonedaOrigen() {
        return monedaOrigen;
    }

    /**
     * Define el valor de la propiedad monedaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonedaOrigen(JAXBElement<String> value) {
        this.monedaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad operadorCalculo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperadorCalculo() {
        return operadorCalculo;
    }

    /**
     * Define el valor de la propiedad operadorCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperadorCalculo(JAXBElement<String> value) {
        this.operadorCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaDeCambio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTasaDeCambio() {
        return tasaDeCambio;
    }

    /**
     * Define el valor de la propiedad tasaDeCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTasaDeCambio(JAXBElement<String> value) {
        this.tasaDeCambio = value;
    }

}
