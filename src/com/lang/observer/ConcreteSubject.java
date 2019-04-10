package com.lang.observer;

public class ConcreteSubject extends Subject{

	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
		this.notifyAllObserver();
	}
	
}
