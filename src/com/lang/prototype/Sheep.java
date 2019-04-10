package com.lang.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable,Serializable{
	private String name;
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	public String toString() {
		return "Sheep [name=" + name + ", birthday=" + birthday + "]";
	}
	
	public void CloneBirthday(Sheep sheep) {
		sheep.birthday=(Date) this.birthday.clone();
	} 
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
