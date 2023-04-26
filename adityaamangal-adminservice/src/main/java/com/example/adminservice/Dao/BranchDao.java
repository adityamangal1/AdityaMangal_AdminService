package com.example.adminservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminservice.Model.Branch;


import org.springframework.stereotype.Repository;



@Repository

public interface BranchDao extends JpaRepository<Branch, String> {

}