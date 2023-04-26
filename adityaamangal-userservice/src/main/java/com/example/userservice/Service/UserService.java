package com.example.userservice.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


import com.example.userservice.Model.Customer;
import com.example.userservice.Model.LoanDto;
import com.example.userservice.Model.TransactionDto;

public interface UserService {
	public Customer insertCustomer(Customer customer);
	public Optional<TransactionDto> findAccountByNumberAndDate(String account_number, Date date_of_transaction);
	public List<TransactionDto> findByAccountNumber(String account_number);
	
	public List<Customer> getAllCustomers();
	public void deleteCustomer(String customer_number);
	public List<Customer> findCustomerByCno(String customer_number);
	

}
