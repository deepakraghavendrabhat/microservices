package org.telco.api.porting.portout.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String customerID;
    private String tenure;
    private String Contract;
    private float TotalCharges;
public Customer() {
 
}
public Customer(String customerID, String tenure, String Contract, float TotalCharges) {
this.customerID = customerID;
this.tenure = tenure;
this.Contract = Contract;
this.TotalCharges = TotalCharges;
}
public String getcustomerID() {
return customerID;
}
public void setcustomerID(String customerID) {
this.customerID = customerID;
}
public String gettenure() {
return tenure;
}
public void settenure(String tenure) {
this.tenure = tenure;
}
public String getContract() {
return Contract;
}
public void setContract(String Contract) {
this.Contract = Contract;
}
public float getTotalCharges() {
return TotalCharges;
}
public void setTotalCharges(float TotalCharges) {
this.TotalCharges = TotalCharges;
}
}
