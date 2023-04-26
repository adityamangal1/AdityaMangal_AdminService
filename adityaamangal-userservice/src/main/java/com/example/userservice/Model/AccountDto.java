package com.example.userservice.Model;

import java.sql.Date;

public class AccountDto {

	String account_number;
	String customer_number;
	String branch_id;
	int opening_balance;
	Date account_opening_date;
	String account_type;
	String account_status;
	
	public AccountDto() {
		
	}

	public AccountDto(String account_number, String customer_number, String branch_id, int opening_balance,
			Date account_opening_date, String account_type, String account_status) {
		super();
		this.account_number = account_number;
		this.customer_number = customer_number;
		this.branch_id = branch_id;
		this.opening_balance = opening_balance;
		this.account_opening_date = account_opening_date;
		this.account_type = account_type;
		this.account_status = account_status;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public int getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}

	public Date getAccount_opening_date() {
		return account_opening_date;
	}

	public void setAccount_opening_date(Date account_opening_date) {
		this.account_opening_date = account_opening_date;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	
	

}

