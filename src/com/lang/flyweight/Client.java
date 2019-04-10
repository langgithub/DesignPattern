package com.lang.flyweight;

public class Client {

	public static void main(String[] args) {
		/*FlyWeight baiqi=new qizhi("白色");
		FlyWeight heiqi=new qizhi("白色");
				
		System.out.println(baiqi);
		System.out.println(heiqi);*/
		
		FlyWeightFactory factory=new FlyWeightFactory();
		qizhi qizhi1=(qizhi) factory.getChess("白色");
		qizhi qizhi2=(qizhi) factory.getChess("黑色");
		qizhi1.movie(new ZuoBiao(1, 2));
		qizhi2.movie(new ZuoBiao(5, 6));
	}
}
