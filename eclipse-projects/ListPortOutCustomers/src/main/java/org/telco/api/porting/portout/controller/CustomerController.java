package org.telco.api.porting.portout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.telco.api.porting.portout.domain.Customer;
import org.telco.api.porting.portout.service.CustomerService;
 
@Controller
@RestController
public class CustomerController {
	@Autowired
    private CustomerService service;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Customer> listcustomers = service.listAll();
        model.addAttribute("listcustomers", listcustomers);
        System.out.print("Get / ");
        return "index";
    }
 
  
 
   
 
}
