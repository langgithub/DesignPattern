package com.lang.singleton;

public class SingletonDemo2 {

	//������Ĵ��۸߾�������ʽ
	private static SingletonDemo2 instance;
	
	private SingletonDemo2(){}
	//�������ã�����Ч�ʵ�
	public static synchronized SingletonDemo2 getInstance(){
		if(instance==null){
			instance=new SingletonDemo2();
		}
		 
		return instance;
	}
}
