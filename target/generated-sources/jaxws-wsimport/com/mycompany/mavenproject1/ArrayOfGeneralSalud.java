
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfGeneralSalud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGeneralSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralSalud" type="{http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object}GeneralSalud" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeneralSalud", propOrder = {
    "generalSalud"
})
public class ArrayOfGeneralSalud {

    @XmlElement(name = "GeneralSalud", nillable = true)
    protected List<GeneralSalud> generalSalud;

    /**
     * Gets the value of the generalSalud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalSalud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralSalud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralSalud }
     * 
     * 
     */
    public List<GeneralSalud> getGeneralSalud() {
        if (generalSalud == null) {
            generalSalud = new ArrayList<GeneralSalud>();
        }
        return this.generalSalud;
    }

}
