package com.lang.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarHandler<T> implements InvocationHandler{


	private Object target;
	
	public StarHandler() {
		// TODO Auto-generated constructor stub
	}
	public StarHandler(Object ojb) {
		// TODO Auto-generated constructor stub
		this.target=ojb;
	}
	 /** 
     * 获取目标对象的代理对象 
	 * @param <T>
     * @return 代理对象 
     */  
    public T getProxy(Class<T> t) {  
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),   
                target.getClass().getInterfaces(), this);  
    }  
	
	public Object createProxyInstance(Object targetObject){
		this.target=targetObject;
		Object proxy= Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), targetObject.getClass().getInterfaces(), this);
		return  proxy;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		check();
		System.out.println("正真的方法执行前");
		System.out.println("面谈，签字，订票");
		if(method.getName().equals("sing")){
			method.invoke(target, args);
		}
		System.out.println("正真的方法执行后");
		System.out.println("收款");
		return null;
	}
	
	public void check(){
		System.out.println("check()");
	};

}
