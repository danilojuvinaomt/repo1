
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosPacienteSalud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosPacienteSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CamposGenerales" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfGeneralSalud" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosPacienteSalud", propOrder = {
    "camposGenerales"
})
public class DatosPacienteSalud {

    @XmlElementRef(name = "CamposGenerales", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGeneralSalud> camposGenerales;

    /**
     * Obtiene el valor de la propiedad camposGenerales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeneralSalud }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGeneralSalud> getCamposGenerales() {
        return camposGenerales;
    }

    /**
     * Define el valor de la propiedad camposGenerales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeneralSalud }{@code >}
     *     
     */
    public void setCamposGenerales(JAXBElement<ArrayOfGeneralSalud> value) {
        this.camposGenerales = value;
    }

}
