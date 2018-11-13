package com.qa.domain;

public class Account {
	
	private String firstName;
	private String surname;
	private int accountNum;
	
	public Account(String firstName, String surname, int accountNum) {		
		setFirstName(firstName);
		setSurname(surname);
		setAccountNum(accountNum);		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	};
	
	
}
