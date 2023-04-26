package com.example.adminservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.Model.Account;

@Repository

public interface AccountDao extends JpaRepository<Account, String> {

}