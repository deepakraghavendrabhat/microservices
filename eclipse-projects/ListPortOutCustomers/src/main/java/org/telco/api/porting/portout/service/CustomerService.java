package org.telco.api.porting.portout.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telco.api.porting.portout.domain.Customer;
import org.telco.api.porting.portout.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
    private CustomerRepository repo;
	
	public List<Customer> listAll() {
        return repo.findAll();
    }
     
   
    public Customer get(String id) {
        return repo.findById(id).get();
    }
     
  
}
