package com.generic;

public class GenericMaximum<E extends Comparable <E>> {
	
	E x;
	E y;
	E z;
	
	
	public GenericMaximum(E x,E y, E z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		
	}


	public <E extends Comparable<E>> E max(E a,E b,E c)
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
	public <E extends Comparable<E>> E maxofthree()
	{
		max(x,y,z);
		return (E) max(x,y,z);
	}
	public static void main(String[] args) {
		
			

	}

}
