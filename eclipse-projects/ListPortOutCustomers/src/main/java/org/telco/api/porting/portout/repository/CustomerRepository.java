package org.telco.api.porting.portout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telco.api.porting.portout.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
