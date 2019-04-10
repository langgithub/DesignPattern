package com.lang.prototype;

import java.util.Date;

/**
 * ǳ��¡��ʵ�����ڴ��ַ����
 * @author lang
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		// TODO Auto-generated method stub

		//ǳ����  ��ַû�䣬���ı��˵�ַ����Ӧ��ֵ
		Date date=new Date();
		System.out.println("��ǰʱ��"+date);
		Sheep sheep1=new Sheep("����",date);
		Sheep sheep2=(Sheep) sheep1.clone();
		System.out.println(sheep1.toString()+"-----"+sheep2.toString());
		
		date.setTime(59851253);
		System.out.println("��ǰʱ��"+date);
		Thread.sleep(1000);
		sheep1.setBirthday(date);
		System.out.println(sheep1.toString()+"-----"+sheep2.toString());
	}

}
