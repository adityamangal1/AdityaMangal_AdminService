package com.example.userservice.Service;

import com.example.userservice.Dao.CustomerDao;
import com.example.userservice.Model.Customer;
import com.example.userservice.Model.LoanDto;
import com.example.userservice.Model.TransactionDto;
import com.example.userservice.Proxy.AdminProxy;

import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	CustomerDao dao;
	
	@Autowired
	AdminProxy temp;

	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	/*@Override
	public LoanDto InsertLoan(LoanDto loan) {
		// TODO Auto-generated method stub
		return temp.InsertLoan(loan);
	}

	@Override
	public TransactionDto doTransaction(TransactionDto transaction) {
		// TODO Auto-generated method stub
		return temp.doTransaction(transaction);
	}*/

	@Override
	public Optional<TransactionDto> findAccountByNumberAndDate(String account_number, Date date_of_transaction) {
		// TODO Auto-generated method stub
		return temp.findAccountByNumberAndDate(account_number, date_of_transaction);
	}

	@Override
	public List<TransactionDto> findByAccountNumber(String account_number) {
		// TODO Auto-generated method stub
		return temp.findByAccountNumber(account_number);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method ub
		return dao.findAll();
	}

	@Override
	public void deleteCustomer(String customer_number) {
		// TODO Auto-generated method stub
		dao.deleteById(customer_number);
		
	}

	@Override
	public List<Customer> findCustomerByCno(String customer_number) {
		// TODO Auto-generated method stub
		return dao.findCustomerByCno(customer_number);
	}

}
