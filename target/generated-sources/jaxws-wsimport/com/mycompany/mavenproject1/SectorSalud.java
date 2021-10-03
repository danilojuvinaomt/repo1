
package com.mycompany.mavenproject1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SectorSalud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SectorSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Beneficiario" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}BeneficiarioSalud" minOccurs="0"/>
 *         &lt;element name="IdPersonalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pacientes" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfDatosPacienteSalud" minOccurs="0"/>
 *         &lt;element name="TipoEscenario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extras" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}ArrayOfExtras" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorSalud", propOrder = {
    "beneficiario",
    "idPersonalizacion",
    "pacientes",
    "tipoEscenario",
    "extras"
})
public class SectorSalud {

    @XmlElementRef(name = "Beneficiario", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<BeneficiarioSalud> beneficiario;
    @XmlElementRef(name = "IdPersonalizacion", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idPersonalizacion;
    @XmlElementRef(name = "Pacientes", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosPacienteSalud> pacientes;
    @XmlElementRef(name = "TipoEscenario", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoEscenario;
    @XmlElementRef(name = "extras", namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtras> extras;

    /**
     * Obtiene el valor de la propiedad beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BeneficiarioSalud }{@code >}
     *     
     */
    public JAXBElement<BeneficiarioSalud> getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define el valor de la propiedad beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BeneficiarioSalud }{@code >}
     *     
     */
    public void setBeneficiario(JAXBElement<BeneficiarioSalud> value) {
        this.beneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersonalizacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdPersonalizacion() {
        return idPersonalizacion;
    }

    /**
     * Define el valor de la propiedad idPersonalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdPersonalizacion(JAXBElement<String> value) {
        this.idPersonalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad pacientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosPacienteSalud }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosPacienteSalud> getPacientes() {
        return pacientes;
    }

    /**
     * Define el valor de la propiedad pacientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosPacienteSalud }{@code >}
     *     
     */
    public void setPacientes(JAXBElement<ArrayOfDatosPacienteSalud> value) {
        this.pacientes = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEscenario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoEscenario() {
        return tipoEscenario;
    }

    /**
     * Define el valor de la propiedad tipoEscenario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoEscenario(JAXBElement<String> value) {
        this.tipoEscenario = value;
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

}
