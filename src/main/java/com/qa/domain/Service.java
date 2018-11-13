package com.qa.domain;

import java.util.HashMap;
import java.util.Map;

import com.qa.utils.ToJSON;

public class Service {

	private HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();
	public static int AccountCounter = 0;

	public void addAccount(String firstName, String surname) {
		this.accountList.put(AccountCounter, new Account(firstName, surname, AccountCounter));
		System.out.printf("Account was created for %s, %s with the account number of:" + AccountCounter + " \n",
				firstName, surname);
		AccountCounter++;

	}

	public String getAccountInfo(int accountNo) {		
		for (Integer i : accountList.keySet()) {
			if (i == accountNo) {
				return 
						"The first name is: " + accountList.get(i).getFirstName() + " and the surname is: " + 
						accountList.get(i).getSurname() + " account number: "
								+ accountList.get(i).getAccountNum();						
			}
		}		
		return "Account Not Found";
		
	}

	public String getAccountInfoAsJSON(int accountNo) {
		
		for (Integer i : accountList.keySet()) {
			if (i == accountNo) {
				return ToJSON.printOjectToJSON(accountList.get(i));				
			}
		}		
		return "Account Not Found";
		
	}

	public String getMapInfoAsJSON() {
		return ToJSON.printMapToJSON(accountList);
	}

	public int getAccountCountForThisFirstName(String firstName) {
		return 
				(int) accountList.entrySet()
				.stream() 				
				.filter( e -> 
								e.getValue().getFirstName().equals(firstName))               
                .count();
	}

}
