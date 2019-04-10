package com.lang.birdge;

public class Client {

	public static void main(String[] args) {
		Brand brand=new Lenovo();
		Computer c=new desktop(brand);
		c.sale();
	}
}
