package com.example.adminservice.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.example.adminservice.Model.Account;
import com.example.adminservice.Model.Branch;
import com.example.adminservice.Model.CustomerDto;
import com.example.adminservice.Model.Loan;
import com.example.adminservice.Model.Transaction;



public interface AdminService {
	
	public Branch InsertBranch(Branch branch);
	public void deleteBranch(String branch_id);
	public List<Branch> getAllbranch();
	public List<Account> getAllAccount();
	public List<CustomerDto> getAllCustomers();
	public List<Loan> getAllLoans();
	public Account insertAccount(Account account);
	public void deleteAccount(String account_number);
	public void deleteCustomer(String customer_number);
	public List<CustomerDto> findCustomerByCno(String customer_number);
	//public List<Loan> loanbyCnoAndBid(String customer_name, String branch_id);
	
	//public Loan InsertLoan(Loan loan);
	//public Transaction doTransaction(Transaction transaction);
	public Optional<Transaction> findAccountByNumberAndDate(String account_number, Date date_of_transaction);
	public List<Transaction> findByAccountNumber(String account_number);


}