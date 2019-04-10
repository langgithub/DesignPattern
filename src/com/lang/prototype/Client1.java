package com.lang.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 序列化与发序列化实现深度克隆
 * @author lang
 *
 */
public class Client1 {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		Date date=new Date();
		System.out.println("当前时间"+date);
		Sheep sheep1=new Sheep("莉莉", date);
        //序列化
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oop=new ObjectOutputStream(bos);
	    oop.writeObject(sheep1);
	    byte[] array=bos.toByteArray();
		//反序列化
	    ByteArrayInputStream bis=new ByteArrayInputStream(array);
	    ObjectInputStream oip=new ObjectInputStream(bis);
	    Sheep sheep2=(Sheep)oip.readObject();
		System.out.println(sheep2.toString()+""+sheep1.toString());
		
		Thread.sleep(1000);
		date.setTime(555555556);
		System.out.println("当前时间"+date);
		System.out.println(sheep2.toString()+""+sheep1.toString());
	}

}
