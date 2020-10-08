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
	public String maxString(String a,String b,String c)
	{
		Integer max = a.length();
		String maxstring=a;
		Integer blength=b.length();
		Integer clength=c.length();
		
		if(blength.compareTo(max)>0) {
			max=blength;
			maxstring=b;
		}
		if(clength.compareTo(max)>0) {
			max=clength;
			maxstring=c;
		}
		return maxstring;
		
	}
	public static void main(String[] args) {


	}

}
