package com.lang.state;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomeContext con=new HomeContext();
		con.setState(new freeState());
		con.showState();
	}
}
