package com.lang.simplefactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//简单工厂模式有client直接与其内部打交道
		/*Car a=SimpleFactory.createAudi();
		Car b=SimpleFactory.createBengci();
		a.run();
		b.run();*/
		
		//工厂模式
		/*Car a=new AuDiFactory().creatCar();
		Car b=new BengCiFactory().creatCar();
		a.run();
		b.run();*/
		
		//抽象工厂模式
		AbstractFactory abstractf=new LuxuryCarFactory();
		abstractf.creatEngine().run();
		abstractf.creatSeat().message();
		abstractf.creatTyre().revolve();;
		
		AbstractFactory b=new LowCarFactory();
		b.creatEngine().run();
		b.creatSeat().message();
		b.creatTyre().revolve();
		
	}

}
