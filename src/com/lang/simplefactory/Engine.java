package com.lang.simplefactory;

public interface Engine {

	void run();
	void start();
}
class LuxuryEngine implements Engine{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵĿ�");
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	}
class lowEngine implements Engine{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵ���");
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}