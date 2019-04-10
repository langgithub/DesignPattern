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
     * ��ȡĿ�����Ĵ������ 
	 * @param <T>
     * @return ������� 
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
		System.out.println("����ķ���ִ��ǰ");
		System.out.println("��̸��ǩ�֣���Ʊ");
		if(method.getName().equals("sing")){
			method.invoke(target, args);
		}
		System.out.println("����ķ���ִ�к�");
		System.out.println("�տ�");
		return null;
	}
	
	public void check(){
		System.out.println("check()");
	};

}
