package com.telco.billing;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ListBillingController {
	
	@RequestMapping("/api-gateway/billing")
	public List<Object> getOutStandingAmounts(){
		String url = "https://634ff6fddf22c2af7b5f1e69.mockapi.io/api/billing/bill/outStandingAmount/outStandingAmount";
		RestTemplate restTemplate = new RestTemplate();
		Object[] outStandingAmounts = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(outStandingAmounts);
	}

}
