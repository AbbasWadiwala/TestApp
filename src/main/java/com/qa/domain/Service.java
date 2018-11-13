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

	public void getAccountInfo(int accountNo) {
		boolean accountFound = false;
		for (Integer i : accountList.keySet()) {
			if (i == accountNo) {
				System.out.printf(
						"The first name is: %s and the surname is: %s, account number:"
								+ accountList.get(i).getAccountNum() + "\n",
						accountList.get(i).getFirstName(), accountList.get(i).getFirstName());
				accountFound = true;
				break;
			}
		}
		if (!accountFound) {
			System.out.println("Account Not Found");
		}
	}

	public void getAccountInfoAsJSON(int accountNo) {
		boolean accountFound = false;
		for (Integer i : accountList.keySet()) {
			if (i == accountNo) {
				ToJSON.printOjectToJSON(accountList.get(i));
				accountFound = true;
				break;
			}
		}
		if (!accountFound) {
			System.out.println("Account Not Found");
		}
	}

	public void getMapInfoAsJSON() {
		ToJSON.printMapToJSON(accountList);
	}

	public int getAccountCountForThisFirstName(String firstName) {
		int accountCount = 0;

		for (Integer i : accountList.keySet()) {
			if (firstName.equals(accountList.get(i).getFirstName())) {
				accountCount++;
			}
		}
		return accountCount;
	}

}
