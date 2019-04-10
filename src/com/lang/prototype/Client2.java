package com.lang.prototype;

import java.util.Date;

public class Client2 {

	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		// TODO Auto-generated method stub

		//深克隆 
		Date date=new Date();
		System.out.println("当前时间"+date);
		Sheep sheep1=new Sheep("莉莉",date);
		Sheep sheep2=(Sheep) sheep1.clone();
		sheep1.CloneBirthday(sheep2);//实现深克隆
		System.out.println(sheep1.toString()+"-----"+sheep2.toString());
		
		date.setTime(59851253);
		System.out.println("当前时间"+date);
		Thread.sleep(1000);
		sheep1.setBirthday(date);
		System.out.println(sheep1.toString()+"-----"+sheep2.toString());
	}

}
