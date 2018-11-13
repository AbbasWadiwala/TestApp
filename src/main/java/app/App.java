package app;

import domain.Service;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World To Standard Out");		
		Service serviceObj = new Service();
		serviceObj.addAccount("Abbas", "Wadiwala");
		serviceObj.addAccount("Rohan", "Maini");
		serviceObj.addAccount("Michal", "Polish");
		
		serviceObj.getAccountInfo(0);
		serviceObj.getAccountInfo(1);
		serviceObj.getAccountInfo(2);
		

	}

}
