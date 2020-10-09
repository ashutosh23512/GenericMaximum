package com.generic;
import java.util.ArrayList;
import java.util.Collections;
public class GenericMaximum<E extends Comparable <E>> {
	ArrayList<E> arrlist = new ArrayList<E>();
	E v;
	E w;
	E x;
	E y;
	E z;
	
	public GenericMaximum(E v,E w,E x,E y, E z)
	{
		this.v=v;
		this.w=w;
		this.x=x;
		this.y=y;
		this.z=z;	
	}
	public ArrayList<E> add(){
		arrlist.add(v);
		arrlist.add(w);
		arrlist.add(x);
		arrlist.add(y);
		arrlist.add(z);
		return arrlist;
	}
	
	public <E extends Comparable<E>> E max(ArrayList<E> arrlist)
	{
    	Collections.sort(arrlist);
    	printMax(arrlist);
    	return arrlist.get(arrlist.size()-1);
	}
	
   public static <E> void printMax(ArrayList<E> arrlist) {
    	System.out.println(arrlist.get(arrlist.size()-1));
    	
    }

	public static void main(String[] args) {
		
			

	}

}
