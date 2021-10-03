
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfObligaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfObligaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Obligaciones" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}Obligaciones" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObligaciones", propOrder = {
    "obligaciones"
})
public class ArrayOfObligaciones {

    @XmlElement(name = "Obligaciones", nillable = true)
    protected List<Obligaciones> obligaciones;

    /**
     * Gets the value of the obligaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obligaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObligaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Obligaciones }
     * 
     * 
     */
    public List<Obligaciones> getObligaciones() {
        if (obligaciones == null) {
            obligaciones = new ArrayList<Obligaciones>();
        }
        return this.obligaciones;
    }

}
