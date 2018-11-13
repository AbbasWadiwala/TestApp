package com.qa.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.qa.domain.Service;



public class ServiceTest {
	
	Service serviceOjb;
	String firstName = "";
	int expectedAccountCountWithFirstName = 0;
	
	@Before
	public void setUp() {
		serviceOjb = new Service ();	
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test
	public void testToSeeIfTheCorrectAccountCountOf_3IsReturnedForTheFirstName_Abbas() {	
		serviceOjb.addAccount("Abbas", "Wadiwala");
		serviceOjb.addAccount("Abbas", "Abbas");
		serviceOjb.addAccount("Abbas", "Maley");
		serviceOjb.addAccount("Rohan", "Maini");
		serviceOjb.addAccount("Michal", "Polish");
		serviceOjb.addAccount("Michal", "Pokey");
		serviceOjb.addAccount("Michal", "Loney");
		serviceOjb.addAccount("Michal", "Joey");
		
		firstName = "Abbas";
		expectedAccountCountWithFirstName = 3;
		int accountCount = serviceOjb.getAccountCountForThisFirstName(firstName);
		assertEquals(expectedAccountCountWithFirstName, accountCount);
	
	}
	
	@Test
	public void testToSeeIfTheCorrectAccountCountOf_4IsReturnedForTheFirstName_Michal() {	
		
		serviceOjb.addAccount("Abbas", "Wadiwala");
		serviceOjb.addAccount("Abbas", "Abbas");
		serviceOjb.addAccount("Abbas", "Maley");
		serviceOjb.addAccount("Rohan", "Maini");
		serviceOjb.addAccount("Michal", "Polish");
		serviceOjb.addAccount("Michal", "Pokey");
		serviceOjb.addAccount("Michal", "Loney");
		serviceOjb.addAccount("Michal", "Joey");
		
		firstName = "Michal";
		expectedAccountCountWithFirstName = 4;
		int accountCount = serviceOjb.getAccountCountForThisFirstName(firstName);
		assertEquals(expectedAccountCountWithFirstName, accountCount);
	
	}
	
	
}
