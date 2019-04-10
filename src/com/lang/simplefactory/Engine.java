package com.lang.simplefactory;

public interface Engine {

	void run();
	void start();
}
class LuxuryEngine implements Engine{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跑的快");
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("启动快");
	}
	}
class lowEngine implements Engine{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跑的慢");
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("启动慢");
	}
	
}