package com.example.userservice.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userservice.Model.Customer;
import com.example.userservice.Model.LoanDto;
import org.springframework.data.jpa.repository.Query;

public interface CustomerDao extends JpaRepository<Customer, String>{
	

	@Query("select u from Customer u where  u.customer_number=?1")
	public List<Customer> getAllCustomers();
	@Query("delete from Customer c where  c.customer_number=?1")
	public void deleteCustomer(String customer_number);
	@Query("select u from Customer u where  u.customer_number=?1")
	public List<Customer> findCustomerByCno(String customer_number);
	
}

