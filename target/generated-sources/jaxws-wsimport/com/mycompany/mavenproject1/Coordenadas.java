
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Coordenadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Coordenadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gradosLatitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gradosLongitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minutosLatitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minutosLongitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orientacionLatitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orientacionLongitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coordenadas", propOrder = {
    "gradosLatitud",
    "gradosLongitud",
    "minutosLatitud",
    "minutosLongitud",
    "orientacionLatitud",
    "orientacionLongitud"
})
public class Coordenadas {

    @XmlElementRef(name = "gradosLatitud", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gradosLatitud;
    @XmlElementRef(name = "gradosLongitud", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gradosLongitud;
    @XmlElementRef(name = "minutosLatitud", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minutosLatitud;
    @XmlElementRef(name = "minutosLongitud", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minutosLongitud;
    @XmlElementRef(name = "orientacionLatitud", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orientacionLatitud;
    @XmlElementRef(name = "orientacionLongitud", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orientacionLongitud;

    /**
     * Obtiene el valor de la propiedad gradosLatitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGradosLatitud() {
        return gradosLatitud;
    }

    /**
     * Define el valor de la propiedad gradosLatitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGradosLatitud(JAXBElement<String> value) {
        this.gradosLatitud = value;
    }

    /**
     * Obtiene el valor de la propiedad gradosLongitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGradosLongitud() {
        return gradosLongitud;
    }

    /**
     * Define el valor de la propiedad gradosLongitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGradosLongitud(JAXBElement<String> value) {
        this.gradosLongitud = value;
    }

    /**
     * Obtiene el valor de la propiedad minutosLatitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinutosLatitud() {
        return minutosLatitud;
    }

    /**
     * Define el valor de la propiedad minutosLatitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinutosLatitud(JAXBElement<String> value) {
        this.minutosLatitud = value;
    }

    /**
     * Obtiene el valor de la propiedad minutosLongitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinutosLongitud() {
        return minutosLongitud;
    }

    /**
     * Define el valor de la propiedad minutosLongitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinutosLongitud(JAXBElement<String> value) {
        this.minutosLongitud = value;
    }

    /**
     * Obtiene el valor de la propiedad orientacionLatitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrientacionLatitud() {
        return orientacionLatitud;
    }

    /**
     * Define el valor de la propiedad orientacionLatitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrientacionLatitud(JAXBElement<String> value) {
        this.orientacionLatitud = value;
    }

    /**
     * Obtiene el valor de la propiedad orientacionLongitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrientacionLongitud() {
        return orientacionLongitud;
    }

    /**
     * Define el valor de la propiedad orientacionLongitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrientacionLongitud(JAXBElement<String> value) {
        this.orientacionLongitud = value;
    }

}
