package com.lang.flyweight;

public class Client {

	public static void main(String[] args) {
		/*FlyWeight baiqi=new qizhi("��ɫ");
		FlyWeight heiqi=new qizhi("��ɫ");
				
		System.out.println(baiqi);
		System.out.println(heiqi);*/
		
		FlyWeightFactory factory=new FlyWeightFactory();
		qizhi qizhi1=(qizhi) factory.getChess("��ɫ");
		qizhi qizhi2=(qizhi) factory.getChess("��ɫ");
		qizhi1.movie(new ZuoBiao(1, 2));
		qizhi2.movie(new ZuoBiao(5, 6));
	}
}
