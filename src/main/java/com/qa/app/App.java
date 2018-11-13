package com.qa.app;


import com.qa.domain.Service;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World To Standard Out");		
		Service serviceObj = new Service();
		serviceObj.addAccount("Abbas", "Wadiwala");
		serviceObj.addAccount("Rohan", "Maini");
		serviceObj.addAccount("Michal", "Polish");
		
		System.out.println(serviceObj.getAccountInfo(0));
		System.out.println(serviceObj.getAccountInfo(1));
		System.out.println(serviceObj.getAccountInfo(2));		
		
		System.out.println(serviceObj.getAccountInfoAsJSON(0));
		
		System.out.println(serviceObj.getMapInfoAsJSON());
		

	}

}
