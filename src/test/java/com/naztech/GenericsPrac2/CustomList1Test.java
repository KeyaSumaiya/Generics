package com.naztech.GenericsPrac2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class CustomList1Test {

	@Test
	public void addTest() {
		CustomList1<Book1> customizedList = new CustomList1<Book1>();
		
		Book1[] testerArray = new Book1[10];
		testerArray[0] = new Book1(32, "bangla", "bwriter",LocalDate.of(1995, Month.APRIL,12));
		testerArray[1] = new Book1(35, "english", "ewriter",LocalDate.of(1995, Month.APRIL,13));
		testerArray[2] = new Book1(53, "math", "mwriter",LocalDate.of(1995, Month.APRIL,14));
		
		
		customizedList.addelement(new Book1(32, "bangla", "bwriter",LocalDate.of(1995, Month.APRIL,12)));
		customizedList.addelement(new Book1(35, "english", "ewriter",LocalDate.of(1995, Month.APRIL,13)));
		customizedList.addelement(new Book1(53, "math", "mwriter",LocalDate.of(1995, Month.APRIL,14)));
		
		

		//if(testerArray.length == customizedList.size()) {
			for(int i=0; i< testerArray.length;i++) {
				System.out.println("hello1");
				System.out.println("hi1");
			assertEquals(testerArray[i], customizedList.get(i));
			}
			System.out.println("hello");
			System.out.println("hi");
		//}
		System.out.println("hello");
		System.out.println("hi");
		
//		for(int i=0; i<testerArray.length ;i++) {
//		assertEquals( testerArray[i], ((Book1) customizedList.get(i)));
//}
			
		
		
		
	}


	

}
