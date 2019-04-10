package com.lang.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

	private Map<String,FlyWeight> qipan=new HashMap<>();
	public FlyWeight getChess(String color){
		if(qipan.get(color)!=null){
			return qipan.get(color);
		}else{
			FlyWeight qizhi=new qizhi(color);
			qipan.put(color, qizhi);
			return qizhi;
		}
		
	}
}
