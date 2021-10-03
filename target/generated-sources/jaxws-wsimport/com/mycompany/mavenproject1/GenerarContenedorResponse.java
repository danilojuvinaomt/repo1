
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
 *         &lt;element name="GenerarContenedorResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}ContenedorResponse" minOccurs="0"/>
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
    "generarContenedorResult"
})
@XmlRootElement(name = "GenerarContenedorResponse", namespace = "http://tempuri.org/")
public class GenerarContenedorResponse {

    @XmlElementRef(name = "GenerarContenedorResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ContenedorResponse> generarContenedorResult;

    /**
     * Obtiene el valor de la propiedad generarContenedorResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContenedorResponse }{@code >}
     *     
     */
    public JAXBElement<ContenedorResponse> getGenerarContenedorResult() {
        return generarContenedorResult;
    }

    /**
     * Define el valor de la propiedad generarContenedorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContenedorResponse }{@code >}
     *     
     */
    public void setGenerarContenedorResult(JAXBElement<ContenedorResponse> value) {
        this.generarContenedorResult = value;
    }

}
