package domain;

import java.util.HashMap;

public class Service {
		
	HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();
	public static int AccountCounter = 0;
	public void addAccount(String firstName, String surname) {
		this.accountList.put(AccountCounter, new Account(firstName,surname));
		AccountCounter++;
		
	}
	
	public void getAccountInfo(int accountNo) {
		for(Integer i: accountList.keySet()) {		
			if(i == accountNo) {
				System.out.printf("The first name is: %s and the surname is: %s \n",accountList.get(i).getFirstName(), accountList.get(i).getFirstName());
			}
			
		}
	}
}
