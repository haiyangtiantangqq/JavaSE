package com.test2;

import java.util.Scanner;

public class BankOperation {
	Scanner scan = new Scanner(System.in);
	int num = 0;//�˺�
	String name = "";//����
	int money = 0;//���
	public boolean login(Customer[] cuss){
		System.out.println("�������˺�:");
		int number = scan.nextInt();
		System.out.println("����������:");
		int password = scan.nextInt();
		for(int i=0;i<cuss.length;i++){
			if(cuss[i]!=null){
				if(cuss[i].getNumber()==number&&cuss[i].getPassword()==password){
					System.out.println("��¼�ɹ�");
					num = cuss[i].getNumber();
					name = cuss[i].getName();
					money = cuss[i].getMoney();
					return true;
				}
			}
		}
		System.out.println("�˺Ż��������");
		return false;
	}
	//ȡ��
	public void getMoney(Customer[] cuss){
		System.out.println("������ȡ����:");
		boolean isb = true;
		while(isb){
			int input = scan.nextInt();
			if(money<input){
				System.out.println("��������,����������!");
				isb = true;
			}else{
				for(int i=0;i<cuss.length;i++){
					if(cuss[i]!=null){
						if(cuss[i].getNumber()==num){
							cuss[i].setMoney(cuss[i].getMoney()-input);
							System.out.println("ȡ��ɹ�!�������Ϊ:"+cuss[i].getMoney());
							isb = false;
						}
					}
				}
			}
		}
		System.out.println("�������������һ���˵�");
		scan.next();
		interface2(cuss);
	}
	//���
	public void setMoney(Customer[] cuss){
		System.out.println("����������:");
		int input = scan.nextInt();
		for(int i=0;i<cuss.length;i++){
			if(cuss[i]!=null){
				if(cuss[i].getNumber()==num){
					cuss[i].setMoney(cuss[i].getMoney()+input);
					System.out.println("���ɹ�!�������Ϊ:"+cuss[i].getMoney());
				}
			}
		}
		System.out.println("�������������һ���˵�");
		scan.next();
		interface2(cuss);
	}
	public void interface1(Customer[] cuss){
		System.out.println("��ӭʹ���й�����");
		System.out.println("------------------");
		System.out.println("1.��¼");
		System.out.println("2.�˳�");
		System.out.println("------------------");
		System.out.println("��ѡ��:");
		int input = scan.nextInt();
		switch (input) {
		case 1:
			boolean isb = login(cuss);
			if(isb){
				interface2(cuss);
			}else{
				interface1(cuss);
			}
			break;
		case 2:
			System.out.println("ллʹ���й�������������ϵͳ");
			break;
		}
	}
	public void interface2(Customer[] cuss){
		System.out.println(name+"����/Ůʿ,����:");
		System.out.println("\t\t��ӭʹ���й�������������ϵͳ");
		System.out.println("------------------");
		System.out.println("1.���");
		System.out.println("2.ȡ��");
		System.out.println("3.�˳�");
		System.out.println("------------------");
		System.out.println("��ѡ��:");
		int input = scan.nextInt();
		switch (input) {
		case 1:
			setMoney(cuss);
			break;
		case 2:
			getMoney(cuss);
			break;
		case 3:
			interface1(cuss);
			break;
		}
	}
}
