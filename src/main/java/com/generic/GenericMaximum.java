package com.generic;

public class GenericMaximum {

	public int maxInteger(Integer a,Integer b,Integer c)
	{
		Integer max = a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
		
	}
	public float maxFloat(Float a,Float b,Float c)
	{
		Float max = a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
		
	}
	public static void main(String[] args) {

		

	}

}
