package com.lang.templete;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Template t=new Template() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("³ÔÃæÌõ");
			}
		};
		t.process();
	}

}
