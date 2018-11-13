package com.qa.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.qa.domain.Service;



public class ServiceTest {
	
	Service serviceObj;
	String firstName = "";
	String surname = "";
	int expectedAccountCountWithFirstName = 0;
	
	@Before
	public void setUp() {
		serviceObj = new Service ();	
	}
	
	@After
	public void tearDown() {
		Service.AccountCounter = 0;
	}	
	
	@Test
	public void testToSeeIfAccountInfoIsReturnedAsAJSON() {
		firstName = "Abbas";
		surname = "Wadiwala";
		serviceObj.addAccount(firstName, surname);
		String accountInfoAsJSON = serviceObj.getAccountInfoAsJSON(0);
		serviceObj.getAccountInfo(0);
		assertEquals("{\"firstName\":\"Abbas\",\"accountNum\":0,\"surname\":\"Wadiwala\"}", accountInfoAsJSON);
	}
	
	@Test
	public void testToSeeIfMapIsReturnedAsAJSON() {
		firstName = "Abbas";
		surname = "Wadiwala";
		serviceObj.addAccount(firstName, surname);
		firstName = "Michal";
		surname = "Lokey";
		serviceObj.addAccount(firstName, surname);
		String mapInfoAsJSON = serviceObj.getMapInfoAsJSON();		
		assertEquals("{\"0\":{\"firstName\":\"Abbas\",\"accountNum\":0,\"surname\":\"Wadiwala\"},\"1\":{\"firstName\":\"Michal\",\"accountNum\":1,\"surname\":\"Lokey\"}}", mapInfoAsJSON);
	}
	
	@Test
	public void testAccountGetInfoIsReturningCorrectInfo() {
		firstName = "Abbas";
		surname = "Wadiwala";
		serviceObj.addAccount(firstName, surname);
		String accountInfoString = serviceObj.getAccountInfo(0);
		assertEquals("The first name is: Abbas and the surname is: Wadiwala account number: 0", accountInfoString);
	}
	
	
	@Test
	public void testToSeeIfTheCorrectAccountCountOf_3IsReturnedForTheFirstName_Abbas() {	
		assertEquals(0, Service.AccountCounter);
		serviceObj.addAccount("Abbas", "Wadiwala");
		assertEquals(1, Service.AccountCounter);		
		serviceObj.addAccount("Abbas", "Abbas");
		assertEquals(2, Service.AccountCounter);
		serviceObj.addAccount("Abbas", "Maley");
		assertEquals(3, Service.AccountCounter);
		serviceObj.addAccount("Rohan", "Maini");
		assertEquals(4, Service.AccountCounter);
		serviceObj.addAccount("Michal", "Polish");
		assertEquals(5, Service.AccountCounter);
		serviceObj.addAccount("Michal", "Pokey");
		assertEquals(6, Service.AccountCounter);
	
		
		firstName = "Abbas";
		expectedAccountCountWithFirstName = 3;
		int accountCount = serviceObj.getAccountCountForThisFirstName(firstName);
		assertEquals(expectedAccountCountWithFirstName, accountCount);
	
	}
	
	@Test
	public void testToSeeIfTheCorrectAccountCountOf_4IsReturnedForTheFirstName_Michal() {	
		
		assertEquals(0, Service.AccountCounter);
		serviceObj.addAccount("Abbas", "Wadiwala");
		assertEquals(1, Service.AccountCounter);		
		serviceObj.addAccount("Abbas", "Abbas");
		assertEquals(2, Service.AccountCounter);
		serviceObj.addAccount("Abbas", "Maley");
		assertEquals(3, Service.AccountCounter);
		serviceObj.addAccount("Rohan", "Maini");
		assertEquals(4, Service.AccountCounter);
		serviceObj.addAccount("Michal", "Polish");
		assertEquals(5, Service.AccountCounter);
		serviceObj.addAccount("Michal", "Pokey");
		assertEquals(6, Service.AccountCounter);
		serviceObj.addAccount("Michal", "Loney");
		assertEquals(7, Service.AccountCounter);
		serviceObj.addAccount("Michal", "Joey");
		assertEquals(8, Service.AccountCounter);
		
		firstName = "Michal";
		expectedAccountCountWithFirstName = 4;
		int accountCount = serviceObj.getAccountCountForThisFirstName(firstName);
		assertEquals(expectedAccountCountWithFirstName, accountCount);
	
	}
	
	
}
