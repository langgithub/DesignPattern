package com.lang.iterator;

public class Client {

	public static void main(String[] args) {
		ConcretaList con=new ConcretaList();
		con.addObj("aa");
		con.addObj("bb");
		con.addObj("cc");
		
		for(MyIterator iterator=con.createIterator();iterator.hashNext();iterator.next()){
			System.out.println(iterator.getCurrentObj());
			
		}
	}
}
