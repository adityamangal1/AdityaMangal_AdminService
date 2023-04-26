package com.example.adminservice.proxy;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.adminservice.Model.CustomerDto;

import org.springframework.web.bind.annotation.DeleteMapping;


@FeignClient("User-Service/User")
public interface UserProxy {
	
	
		
	    
		@GetMapping("/allcustomers")
		public List<CustomerDto> showAllCustomers();
			
		
		@GetMapping("/customerByCno/{customer_number}")
		public List<CustomerDto> showAllCustomerByCno(@PathVariable("customer_number")String customer_number);
			
			@DeleteMapping("/deleteCustomers/{customer_number}")
			public String deleteCustomer(@PathVariable("customer_number")String customer_number);

}