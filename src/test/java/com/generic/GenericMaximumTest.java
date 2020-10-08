package com.generic;
import org.junit.*;
import org.junit.Assert;
public class GenericMaximumTest {
	
	@Test
	public void givenFirst_Greater_ShouldReturnFirst() {
		GenericMaximum obj = new GenericMaximum();
		Integer result = obj.maxInteger(30, 20, 10);
		boolean check=false; 
		if(result == 30) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecond() {
		GenericMaximum obj = new GenericMaximum();
		Integer result = obj.maxInteger(20, 30, 10);
		boolean check=false; 
		if(result == 30) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThird() {
		GenericMaximum obj = new GenericMaximum();
		Integer result = obj.maxInteger(20, 10, 30);
		boolean check=false; 
		if(result == 30) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirst_Float() {
		GenericMaximum obj = new GenericMaximum();
		Float result = obj.maxFloat(30f, 20f, 10f);
		boolean check=false; 
		if(result == 30f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecond_Float() {
		GenericMaximum obj = new GenericMaximum();
		Float result = obj.maxFloat(20f, 30f, 10f);
		boolean check=false; 
		if(result == 30f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThird_Float() {
		GenericMaximum obj = new GenericMaximum();
		Float result = obj.maxFloat(20f, 10f, 30f);
		boolean check=false; 
		if(result == 30f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}


}
