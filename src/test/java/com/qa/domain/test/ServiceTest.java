package com.qa.domain.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.qa.domain.Service;



public class ServiceTest {
	
	@Test
	public void testToSeeIfTheCorrectAccountCountIsReturnedForTheFirstNameProvided() {
		Service serviceOjb = new Service ();
		String firstName = "Abbas";
		int expectedAccountCount = 2;
		int accountCount = serviceOjb.getAccountCountForThisFirstName(firstName);
		assertEquals(expectedAccountCount, accountCount);
	
	}
}
