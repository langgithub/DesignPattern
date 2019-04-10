package com.lang.mediator;

import java.util.HashMap;
import java.util.Map;

public class prisdent implements Mediator{

	private Map<String,Department> map=new HashMap<>();
	public void commend(String name){
		map.get(name).selfAction();
	}
	public void register(String name,Department depar){
		map.put(name, depar);
	}
	
	
}
