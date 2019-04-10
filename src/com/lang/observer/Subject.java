package com.lang.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> list=new ArrayList<>();
	
	public void registerObserver(Observer observer){
		list.add(observer);
	}
	
	public void removeObserver(Observer observer){
		list.remove(observer);
	}
	
	public void notifyAllObserver(){
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
