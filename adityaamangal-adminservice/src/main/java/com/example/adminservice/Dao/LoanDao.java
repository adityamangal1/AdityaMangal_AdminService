package com.example.adminservice.Dao;

import org.springframework.stereotype.Repository;

import com.example.adminservice.Model.Loan;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;




@Repository

public interface LoanDao extends JpaRepository<Loan, String>{

	

}