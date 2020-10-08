package com.generic;

public class GenericMaximum {

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
	public <E extends Comparable> E max(E a,E b,E c)
	{
		E max = a;
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
