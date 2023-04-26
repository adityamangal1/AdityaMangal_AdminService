package com.example.adminservice.Dao;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.adminservice.Model.Transaction;


@Repository

public interface TransactionDao extends JpaRepository<Transaction, String>{
	/*@Query
	public Transaction doTransaction(Transaction transaction);*/
	@Query("select u from Transaction u where u.account_number=?1 and u.date_of_transaction=?2")
	public Optional<Transaction> findAccountByNumberAndDate(String account_number, Date date_of_transaction);
	@Query("select t from Transaction t where t.account_number=?1")
	public List<Transaction> findByAccountNumber(String account_number);


}