package com.generic;
import org.junit.*;
import org.junit.Assert;
public class GenericMaximumTest {
	
	@Test
	public void givenFirst_Greater_ShouldReturnFirst() {
		GenericMaximum obj = new GenericMaximum<Integer>(30, 20, 10);
		Integer result =(Integer) obj.maxofthree();
		boolean check=false; 
		if(result == 30) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecond() {
		GenericMaximum obj = new GenericMaximum<Integer>(20, 30, 10);
		Integer result =(Integer) obj.maxofthree();		
		boolean check=false; 
		if(result == 30) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThird() {
		GenericMaximum obj = new GenericMaximum<Integer>(20, 10, 30);
		Integer result =(Integer) obj.maxofthree();		
		boolean check=false; 
		if(result == 30) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirst_Float() {
		GenericMaximum obj = new GenericMaximum<Float>(30f, 20f, 10f);
		Float result = (float)obj.maxofthree();
		boolean check=false; 
		if(result == 30f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecond_Float() {
		GenericMaximum obj = new GenericMaximum<Float>(20f, 30f, 10f);
		Float result = (float)obj.maxofthree();
		boolean check=false; 
		if(result == 30f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThird_Float() {
		GenericMaximum obj = new GenericMaximum<Float>(20f, 10f, 30f);
		Float result = (float)obj.maxofthree();
		boolean check=false; 
		if(result == 30f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirst_String() {
		GenericMaximum obj = new GenericMaximum<String>("Apple", "Peach", "Banana");
		String result =(String) obj.maxofthree();
		boolean check=false; 
		if(result == "Peach") {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenSecond_Greater_ShouldReturnSecond_String() {
		GenericMaximum obj = new GenericMaximum<String>("Peach", "Banana", "Apple");
		String result =(String) obj.maxofthree();
		boolean check=false; 
		if(result == "Peach") {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenThird_Greater_ShouldReturnThird_String() {
		GenericMaximum obj = new GenericMaximum<String>("Banana", "Apple", "Peach");
		String result =(String) obj.maxofthree();
		boolean check=false; 
		if(result == "Peach") {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}


}
