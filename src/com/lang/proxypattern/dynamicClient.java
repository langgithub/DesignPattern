package com.lang.proxypattern;

import java.lang.reflect.Proxy;

public class dynamicClient {

	public static void main(String[] args) {
		
		StarHandler handler=new StarHandler(new RealStar());
		
		//�Ҵ�ʲô�����ͣ��Ϳ��Ի�ȡʲô������
		star realStar=  (star) handler.getProxy(star.class);
		realStar.sing();
		
	}
}
