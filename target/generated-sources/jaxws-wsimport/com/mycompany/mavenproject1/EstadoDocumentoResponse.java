
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
 *         &lt;element name="EstadoDocumentoResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}DocumentStatusResponse" minOccurs="0"/>
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
    "estadoDocumentoResult"
})
@XmlRootElement(name = "EstadoDocumentoResponse", namespace = "http://tempuri.org/")
public class EstadoDocumentoResponse {

    @XmlElementRef(name = "EstadoDocumentoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentStatusResponse> estadoDocumentoResult;

    /**
     * Obtiene el valor de la propiedad estadoDocumentoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentStatusResponse }{@code >}
     *     
     */
    public JAXBElement<DocumentStatusResponse> getEstadoDocumentoResult() {
        return estadoDocumentoResult;
    }

    /**
     * Define el valor de la propiedad estadoDocumentoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentStatusResponse }{@code >}
     *     
     */
    public void setEstadoDocumentoResult(JAXBElement<DocumentStatusResponse> value) {
        this.estadoDocumentoResult = value;
    }

}
