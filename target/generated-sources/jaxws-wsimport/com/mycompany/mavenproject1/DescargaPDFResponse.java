
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
 *         &lt;element name="DescargaPDFResult" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response}DownloadPDFResponse" minOccurs="0"/>
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
    "descargaPDFResult"
})
@XmlRootElement(name = "DescargaPDFResponse", namespace = "http://tempuri.org/")
public class DescargaPDFResponse {

    @XmlElementRef(name = "DescargaPDFResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DownloadPDFResponse> descargaPDFResult;

    /**
     * Obtiene el valor de la propiedad descargaPDFResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DownloadPDFResponse }{@code >}
     *     
     */
    public JAXBElement<DownloadPDFResponse> getDescargaPDFResult() {
        return descargaPDFResult;
    }

    /**
     * Define el valor de la propiedad descargaPDFResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DownloadPDFResponse }{@code >}
     *     
     */
    public void setDescargaPDFResult(JAXBElement<DownloadPDFResponse> value) {
        this.descargaPDFResult = value;
    }

}
