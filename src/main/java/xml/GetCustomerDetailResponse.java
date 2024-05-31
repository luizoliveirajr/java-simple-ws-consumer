
package xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerDetail" type="{http://luizmarcelo.com/customersadministration/customers}CustomerDetail"/>
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
    "customerDetail"
})
@XmlRootElement(name = "GetCustomerDetailResponse")
public class GetCustomerDetailResponse {

    @XmlElement(name = "CustomerDetail", required = true)
    protected CustomerDetail customerDetail;

    /**
     * Gets the value of the customerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetail }
     *     
     */
    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    /**
     * Sets the value of the customerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetail }
     *     
     */
    public void setCustomerDetail(CustomerDetail value) {
        this.customerDetail = value;
    }

}
