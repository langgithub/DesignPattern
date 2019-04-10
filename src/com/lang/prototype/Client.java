package com.lang.prototype;

import java.util.Date;

/**
 * 浅克隆，实质是内存地址复制
 * @author lang
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		// TODO Auto-generated method stub

		//浅复制  地址没变，但改变了地址所对应的值
		Date date=new Date();
		System.out.println("当前时间"+date);
		Sheep sheep1=new Sheep("莉莉",date);
		Sheep sheep2=(Sheep) sheep1.clone();
		System.out.println(sheep1.toString()+"-----"+sheep2.toString());
		
		date.setTime(59851253);
		System.out.println("当前时间"+date);
		Thread.sleep(1000);
		sheep1.setBirthday(date);
		System.out.println(sheep1.toString()+"-----"+sheep2.toString());
	}

}
