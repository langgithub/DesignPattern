package com.lang.singleton;

/**
 * ����ʽ������Ķ���
 * ��Ȼ�̰߳�ȫ������Ч�ʸ�
 * @author lang
 *
 */
public class SingletonDemo1 {
	//��ʼ�����أ����������������
	private static SingletonDemo1 instance=new SingletonDemo1();

	private SingletonDemo1(){}
	
	public static SingletonDemo1 getInstance(){
		return instance;
	}
}
