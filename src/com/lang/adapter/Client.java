package com.lang.adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeKong three=new ThreeKong();
		
		Adapter adpater=new Adapter(three);
 
		get2Kong(adpater);
	}
	/**
	 * 
	 */
	public static void get2Kong(Target t){
		System.out.println("ÐèÒªÁ½¿×²å×ù");
		t.virtual2To3();
	}

}
