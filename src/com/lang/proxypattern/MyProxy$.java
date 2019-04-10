package com.lang.proxypattern;

public class MyProxy$ extends Proxy$ implements ServiceDao {

	
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("my");
	}
	
	public static void main(String[] args) {
		ServiceDao s=new MyProxy$();
		s.add();
	}

}
