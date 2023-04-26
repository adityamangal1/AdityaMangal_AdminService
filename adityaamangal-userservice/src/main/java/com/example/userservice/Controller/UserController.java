package com.example.userservice.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.userservice.Model.Customer;
import com.example.userservice.Model.LoanDto;
import com.example.userservice.Model.TransactionDto;
import com.example.userservice.Service.UserService;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("User")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String home(){
		return "hello User";
	}
	
	@PostMapping("/addcustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	
	
	@GetMapping("/findAccountByNumberAndDate/{account_number}/{date_of_transaction}")
	public Optional<TransactionDto> findAccountByNumberAndDate(@PathVariable("account_number") String account_number,
			@PathVariable("date_of_transaction") Date date_of_transaction){
		return service.findAccountByNumberAndDate(account_number, date_of_transaction);
	}
	
	@GetMapping("/findByAccountNumber/{account_number}")
	public List<TransactionDto> findByAccountNumber(@PathVariable("account_number") String account_number){
		return service.findByAccountNumber(account_number);
	}
	
	@GetMapping("/allcustomers")
	public List<Customer> showAllCustomers(){
		return service.getAllCustomers();
	}
	
	
	@GetMapping("/customerByCno/{customer_number}")
	public List<Customer> showAllCustomerByCno(@PathVariable("customer_number")String customer_number){
		return service.findCustomerByCno(customer_number);
		}
		
		@DeleteMapping("/deleteCustomers/{customer_number}")
		public String deleteCustomer(@PathVariable("customer_number")String customer_number){
		return "custormer deleted";
		}
	
}
