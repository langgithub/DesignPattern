package com.lang.simplefactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�򵥹���ģʽ��clientֱ�������ڲ��򽻵�
		/*Car a=SimpleFactory.createAudi();
		Car b=SimpleFactory.createBengci();
		a.run();
		b.run();*/
		
		//����ģʽ
		/*Car a=new AuDiFactory().creatCar();
		Car b=new BengCiFactory().creatCar();
		a.run();
		b.run();*/
		
		//���󹤳�ģʽ
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
