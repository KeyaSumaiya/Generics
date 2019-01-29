package com.naztech.GenericsPrac2;



public class CustomList1<T> {
	private Object[] al=new Object[30]; 
	private int head=-1;
	
	public void addelement(T obj) {
		al[++head] = obj;
	}
	public Object addelementAt(int i, T obj) {
		int currHead = head;
		while(currHead+1>=i) {
			al[currHead+1] = al[currHead];
			currHead--;
		}
		al[i] = obj;
		return al;
	}
	
	
	public int size() {
		// TODO Auto-generated method stub
		return this.head+1;
	}
//	public Object get(int i) {
//		// TODO Auto-generated method stub
//		return al[i];
//	}
	
	
	public Object get(int i) {
		return al[i];
	}
	

	
	public static void main(String [ ] args)
	{

		
	      
	}
	
	
	
}
