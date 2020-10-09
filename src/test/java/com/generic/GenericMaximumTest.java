package com.generic;
import org.junit.*;
import java.util.ArrayList;

import org.junit.Assert;
public class GenericMaximumTest {
	
	@Test
	public void givenFirst_Greater_ShouldReturnFirst() {
		GenericMaximum obj = new GenericMaximum(30,20,10,40,50);
    	ArrayList<Integer> arrlist = new ArrayList<Integer>();
    	arrlist=obj.add();
		boolean check=false; 
		if((Integer)obj.max(arrlist) == 50) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnSecond() {
		GenericMaximum obj = new GenericMaximum(20,30,40,10,50);
    	ArrayList<Integer> arrlist = new ArrayList<Integer>();
    	arrlist=obj.add();
		boolean check=false; 
		if((Integer)obj.max(arrlist) == 50) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnThird() {
		GenericMaximum obj = new GenericMaximum(50,10,20,30,40);
    	ArrayList<Integer> arrlist = new ArrayList<Integer>();
    	arrlist=obj.add();
		boolean check=false; 
		if((Integer)obj.max(arrlist) == 50) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirst_Float() {
		GenericMaximum obj = new GenericMaximum(30f, 20f, 10f,40f,50f);
		ArrayList<Float> arrlist = new ArrayList<Float>();
    	arrlist=obj.add();
		boolean check=false; 
		if((Float)obj.max(arrlist) == 50f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnSecond_Float() {
		GenericMaximum obj = new GenericMaximum(20f, 30f, 40f,10f,50f);
		ArrayList<Float> arrlist = new ArrayList<Float>();
    	arrlist=obj.add();
		boolean check=false; 
		if((Float)obj.max(arrlist) == 50f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnThird_Float() {
		GenericMaximum obj = new GenericMaximum(50f,10f,20f,30f,40f);
		ArrayList<Float> arrlist = new ArrayList<Float>();
    	arrlist=obj.add();
		boolean check=false; 
		if((Float)obj.max(arrlist) == 50f) {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnFirst_String() {
		GenericMaximum obj = new GenericMaximum<String>("Apple", "Peach", "Banana","Grapes","Watermelon");
		ArrayList<String> arrlist = new ArrayList<String>();
    	arrlist=obj.add();
		boolean check=false; 
		if((String)obj.max(arrlist) == "Watermelon") {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnSecond_String() {
		GenericMaximum obj = new GenericMaximum<String>("Peach","Apple","Banana","Watermelon","Grapes");
		ArrayList<String> arrlist = new ArrayList<String>();
    	arrlist=obj.add();
		boolean check=false; 
		if((String)obj.max(arrlist) == "Watermelon") {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}
	@Test
	public void givenFirst_Greater_ShouldReturnThird_String() {
		GenericMaximum obj = new GenericMaximum<String>("Apple", "Peach", "Banana","Grapes","Watermelon");
		ArrayList<String> arrlist = new ArrayList<String>();
    	arrlist=obj.add();
		boolean check=false; 
		if((String)obj.max(arrlist) == "Watermelon") {
		check = true;
		} 
		Assert.assertEquals(true, check);;
	}


}
