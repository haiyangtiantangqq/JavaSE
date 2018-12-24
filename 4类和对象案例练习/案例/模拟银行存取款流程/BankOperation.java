package com.test2;

import java.util.Scanner;

public class BankOperation {
	Scanner scan = new Scanner(System.in);
	int num = 0;//账号
	String name = "";//姓名
	int money = 0;//余额
	public boolean login(Customer[] cuss){
		System.out.println("请输入账号:");
		int number = scan.nextInt();
		System.out.println("请输入密码:");
		int password = scan.nextInt();
		for(int i=0;i<cuss.length;i++){
			if(cuss[i]!=null){
				if(cuss[i].getNumber()==number&&cuss[i].getPassword()==password){
					System.out.println("登录成功");
					num = cuss[i].getNumber();
					name = cuss[i].getName();
					money = cuss[i].getMoney();
					return true;
				}
			}
		}
		System.out.println("账号或密码错误");
		return false;
	}
	//取款
	public void getMoney(Customer[] cuss){
		System.out.println("请输入取款金额:");
		boolean isb = true;
		while(isb){
			int input = scan.nextInt();
			if(money<input){
				System.out.println("您的余额不足,请重新输入!");
				isb = true;
			}else{
				for(int i=0;i<cuss.length;i++){
					if(cuss[i]!=null){
						if(cuss[i].getNumber()==num){
							cuss[i].setMoney(cuss[i].getMoney()-input);
							System.out.println("取款成功!您的余额为:"+cuss[i].getMoney());
							isb = false;
						}
					}
				}
			}
		}
		System.out.println("按任意键返回上一级菜单");
		scan.next();
		interface2(cuss);
	}
	//存款
	public void setMoney(Customer[] cuss){
		System.out.println("请输入存款金额:");
		int input = scan.nextInt();
		for(int i=0;i<cuss.length;i++){
			if(cuss[i]!=null){
				if(cuss[i].getNumber()==num){
					cuss[i].setMoney(cuss[i].getMoney()+input);
					System.out.println("存款成功!您的余额为:"+cuss[i].getMoney());
				}
			}
		}
		System.out.println("按任意键返回上一级菜单");
		scan.next();
		interface2(cuss);
	}
	public void interface1(Customer[] cuss){
		System.out.println("欢迎使用中国银行");
		System.out.println("------------------");
		System.out.println("1.登录");
		System.out.println("2.退出");
		System.out.println("------------------");
		System.out.println("请选择:");
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
			System.out.println("谢谢使用中国银行自助服务系统");
			break;
		}
	}
	public void interface2(Customer[] cuss){
		System.out.println(name+"先生/女士,您好:");
		System.out.println("\t\t欢迎使用中国银行自助服务系统");
		System.out.println("------------------");
		System.out.println("1.存款");
		System.out.println("2.取款");
		System.out.println("3.退出");
		System.out.println("------------------");
		System.out.println("请选择:");
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
