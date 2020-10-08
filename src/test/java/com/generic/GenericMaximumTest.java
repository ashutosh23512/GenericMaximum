package com.generic;
import org.junit.*;
import org.junit.Assert;
public class GenericMaximumTest {
	
	@Test
	public void givenFirst_Greater_ShouldReturnFirst() {
		GenericMaximum obj = new GenericMaximum();
		Integer result = obj.maxInteger(30, 20, 10);
		boolean check=false; 
		if(result == 100) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecond() {
		GenericMaximum obj = new GenericMaximum();
		Integer result = obj.maxInteger(20, 30, 10);
		boolean check=false; 
		if(result == 100) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThird() {
		GenericMaximum obj = new GenericMaximum();
		Integer result = obj.maxInteger(20, 10, 30);
		boolean check=false; 
		if(result == 100) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}

}
