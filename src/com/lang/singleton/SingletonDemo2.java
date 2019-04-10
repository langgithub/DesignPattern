package com.lang.singleton;

public class SingletonDemo2 {

	//生成类的代价高就用懒汉式
	private static SingletonDemo2 instance;
	
	private SingletonDemo2(){}
	//方法调用，调用效率低
	public static synchronized SingletonDemo2 getInstance(){
		if(instance==null){
			instance=new SingletonDemo2();
		}
		 
		return instance;
	}
}
