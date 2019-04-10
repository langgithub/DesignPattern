package com.lang.proxypattern;

import java.lang.reflect.Proxy;

public class dynamicClient {

	public static void main(String[] args) {
		
		StarHandler handler=new StarHandler(new RealStar());
		
		//我传什么类类型，就可以获取什么类类型
		star realStar=  (star) handler.getProxy(star.class);
		realStar.sing();
		
	}
}
