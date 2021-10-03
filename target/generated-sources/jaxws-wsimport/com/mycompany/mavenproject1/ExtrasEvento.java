
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExtrasEvento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExtrasEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoInterno1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoInterno2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrasEvento", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", propOrder = {
    "codigoInterno1",
    "codigoInterno2",
    "nombre",
    "valor"
})
public class ExtrasEvento {

    @XmlElementRef(name = "codigoInterno1", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoInterno1;
    @XmlElementRef(name = "codigoInterno2", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoInterno2;
    @XmlElementRef(name = "nombre", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "valor", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valor;

    /**
     * Obtiene el valor de la propiedad codigoInterno1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoInterno1() {
        return codigoInterno1;
    }

    /**
     * Define el valor de la propiedad codigoInterno1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoInterno1(JAXBElement<String> value) {
        this.codigoInterno1 = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInterno2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoInterno2() {
        return codigoInterno2;
    }

    /**
     * Define el valor de la propiedad codigoInterno2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoInterno2(JAXBElement<String> value) {
        this.codigoInterno2 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValor(JAXBElement<String> value) {
        this.valor = value;
    }

}
