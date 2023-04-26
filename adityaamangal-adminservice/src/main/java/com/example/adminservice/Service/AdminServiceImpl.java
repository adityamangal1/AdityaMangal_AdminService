package com.example.adminservice.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.Dao.AccountDao;
import com.example.adminservice.Dao.BranchDao;
import com.example.adminservice.Dao.LoanDao;
import com.example.adminservice.Dao.TransactionDao;
import com.example.adminservice.Model.Account;
import com.example.adminservice.Model.Branch;
import com.example.adminservice.Model.CustomerDto;
import com.example.adminservice.Model.Loan;
import com.example.adminservice.Model.Transaction;
import com.example.adminservice.proxy.UserProxy;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AccountDao Adao;
	
	@Autowired
	BranchDao Bdao;
	
	@Autowired 
	LoanDao Ldao;
	
	@Autowired
	TransactionDao Tdao;
	
	@Autowired
	UserProxy template;

	@Override
	public Branch InsertBranch(Branch branch) {
		// TODO Auto-generated method stub
		return Bdao.save(branch);
	}

	@Override
	public void deleteBranch(String branch_id) {
		// TODO Auto-generated method stub
		Bdao.deleteById(branch_id);

	}

	@Override
	public List<Branch> getAllbranch() {
		// TODO Auto-generated method stub
		return Bdao.findAll();
	}

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return Adao.findAll();
	}

	@Override
	public List<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return Ldao.findAll();
	}

	@Override
	public Account insertAccount(Account account) {
		// TODO Auto-generated method stub
		return Adao.save(account);
	}

	@Override
	public void deleteAccount(String account_number) {
		Adao.deleteById(account_number);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(String customer_number) {
		
		// TODO Auto-generated method stub
		template.deleteCustomer(customer_number);

	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		// TODO Auto-generated method stub
		return template.showAllCustomers();
	}

	@Override
	public List<CustomerDto> findCustomerByCno(String customer_number) {
		// TODO Auto-generated method stub
		return template.showAllCustomerByCno(customer_number);
	}


	/*@Override
	public Transaction doTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return Tdao.doTransaction(transaction);
	}*/

	@Override
	public Optional<Transaction> findAccountByNumberAndDate(String account_number, Date date_of_transaction) {
		// TODO Auto-generated method stub
		return Tdao.findAccountByNumberAndDate(account_number, date_of_transaction);
	}

	@Override
	public List<Transaction> findByAccountNumber(String account_number) {
		// TODO Auto-generated method stub
		return Tdao.findByAccountNumber(account_number);
	}

	/*@Override
	public Loan InsertLoan(Loan loan) {
		// TODO Auto-generated method stub
		return Ldao.InsertLoan(loan);
	}*/

	

/*	@Override
	public List<Loan> loanbyCnoAndBid(String customer_name, String branch_id) {
		// TODO Auto-generated method stub
		return Ldao.loanbyCnoAndBid(customer_name, branch_id);
	}*/

}