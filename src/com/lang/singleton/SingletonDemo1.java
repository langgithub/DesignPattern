package com.lang.singleton;

/**
 * 饿汉式加载类的对象
 * 天然线程安全，调用效率高
 * @author lang
 *
 */
public class SingletonDemo1 {
	//初始化加载，立即加载这个对象
	private static SingletonDemo1 instance=new SingletonDemo1();

	private SingletonDemo1(){}
	
	public static SingletonDemo1 getInstance(){
		return instance;
	}
}
