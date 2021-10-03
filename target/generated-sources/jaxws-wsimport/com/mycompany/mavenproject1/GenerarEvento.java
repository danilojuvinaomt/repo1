
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosEvento" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}DatosEvento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tokenEmpresa",
    "tokenPassword",
    "datosEvento"
})
@XmlRootElement(name = "GenerarEvento", namespace = "http://tempuri.org/")
public class GenerarEvento {

    @XmlElementRef(name = "tokenEmpresa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenEmpresa;
    @XmlElementRef(name = "tokenPassword", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tokenPassword;
    @XmlElementRef(name = "datosEvento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosEvento> datosEvento;

    /**
     * Obtiene el valor de la propiedad tokenEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenEmpresa() {
        return tokenEmpresa;
    }

    /**
     * Define el valor de la propiedad tokenEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenEmpresa(JAXBElement<String> value) {
        this.tokenEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad tokenPassword.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTokenPassword() {
        return tokenPassword;
    }

    /**
     * Define el valor de la propiedad tokenPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTokenPassword(JAXBElement<String> value) {
        this.tokenPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad datosEvento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosEvento }{@code >}
     *     
     */
    public JAXBElement<DatosEvento> getDatosEvento() {
        return datosEvento;
    }

    /**
     * Define el valor de la propiedad datosEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosEvento }{@code >}
     *     
     */
    public void setDatosEvento(JAXBElement<DatosEvento> value) {
        this.datosEvento = value;
    }

}
