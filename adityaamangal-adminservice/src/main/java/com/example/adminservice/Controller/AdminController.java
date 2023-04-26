package com.example.adminservice.Controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.Model.Account;
import com.example.adminservice.Model.Branch;
import com.example.adminservice.Model.CustomerDto;
import com.example.adminservice.Model.Loan;
import com.example.adminservice.Model.Transaction;
import com.example.adminservice.Service.AdminService;




@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	
	
	@GetMapping("/")
	public String home(){
		return "hello Admin";
	}
	
	@GetMapping("/allbranch")
	public List<Branch> showAllbranch(){
		return service.getAllbranch();
	}
	
	@DeleteMapping("/delete/{branch_id}")
	public String deleteBranch(@PathVariable("branch_id")String branch_id) {
		service.deleteBranch(branch_id);
		return "Branch is deleted";
	}
	

	@PostMapping("/addbranch")
	public Branch addBranch(@RequestBody Branch branch) {
		return service.InsertBranch(branch);
	}

	
	@PostMapping("/addaccount")
	public Account addaccount(@RequestBody Account account) {
		return service.insertAccount(account);
	}
	
	@GetMapping("/allaccount")
	public List<Account> showAllAccount(){
		return service.getAllAccount();
	}
	
	@DeleteMapping("/delete/{account_number}")
	public String deleteAccount(@PathVariable("account_number")String account_number) {
		service.deleteAccount(account_number);
		return "Account is deleted";
	}
	
	@GetMapping("/allloans")
	public List<Loan> showAllLoans(){
		return service.getAllLoans();
		
	}
	
	
	@GetMapping("/allcustomers")
	public List<CustomerDto>showAllCustomers(){
		return service.getAllCustomers();
	}
	
	
	@GetMapping("/customerByCno/{customer_number}")
	public List<CustomerDto> showAllCustomerByCno(@PathVariable("customer_number")String customer_number){
		return service.findCustomerByCno(customer_number);
		}
		
		@DeleteMapping("/deleteCustomers/{customer_number}")
		public String deleteCustomer(@PathVariable("customer_number")String customer_number){
		return "custormer deleted";
		}
		
/*@PostMapping("/applyloan")
public Loan InsertLoan(@RequestBody Loan loan) {
	return service.InsertLoan(loan);
}

@PostMapping("/doTransaction")
public Transaction doTransaction(@RequestBody Transaction transaction) {
	return service.doTransaction(transaction);
}*/

@GetMapping("/findAccountByNumberAndDate/{account_number}/{date_of_transaction}")
public Optional<Transaction> findAccountByNumberAndDate(@PathVariable("account_number") String account_number,
		@PathVariable("date_of_transaction") Date date_of_transaction){
	return service.findAccountByNumberAndDate(account_number, date_of_transaction);
}

@GetMapping("/findByAccountNumber/{account_number}")
public List<Transaction> findByAccountNumber(@PathVariable("account_number") String account_number){
	return service.findByAccountNumber(account_number);
}
}
		
	
	

