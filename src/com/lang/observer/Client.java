package com.lang.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteSubject sub=new ConcreteSubject();
		
		ObserverA obj1=new ObserverA();
		ObserverA obj2=new ObserverA();
		ObserverA obj3=new ObserverA();
	
		sub.registerObserver(obj1);
		sub.registerObserver(obj2);
		sub.registerObserver(obj3);
		
		sub.setStatus(50);
		
	}

}
