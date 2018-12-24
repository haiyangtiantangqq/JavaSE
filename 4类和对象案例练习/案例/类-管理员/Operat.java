package com.test2;

import java.util.Scanner;

public class Operat {
	Scanner input = new Scanner(System.in);
	Admin aa;// 管理员1,全局变量
	Admin bb;// 管理员2
	Admin user[] = new Admin[2];// 自定义数据类型

	public void initial1() {
		aa = new Admin();
		aa.uname = "abc";
		aa.password = "a123";

		bb = new Admin();
		bb.uname = "def";
		bb.password = "d123";
	}

	public void show1() {
		System.out.println(aa.uname + " " + aa.password);
		System.out.println(bb.uname + " " + bb.password);

	}

	public void modify1() {
		while (true) {
			System.out.println("请输入账号:");
			String name = input.next();
			System.out.println("请输入密码:");
			String pwd = input.next();
			if (name.equals(aa.uname) && pwd.equals(aa.password)
					|| name.equals(bb.uname) && pwd.equals(bb.password)) {
				while (true) {
					if (name.equals(aa.uname) && pwd.equals(aa.password)) {
						System.out.println("请输入新密码");
						String p1 = input.next();
						System.out.println("请再次输入新密码");
						String p2 = input.next();
						if (p1.equals(p2)) {
							aa.password = p1;
							System.out.println("密码修改成功!");
							break;
						} else {
							System.out.println("两次密码输入不一致,请重新输入!");
						}

					} else {

						System.out.println("请输入新密码");
						String p1 = input.next();
						System.out.println("请再次输入新密码");
						String p2 = input.next();
						if (p1.equals(p2)) {
							aa.password = p1;
							System.out.println("密码修改成功!");
							break;
						} else {
							System.out.println("两次密码输入不一致,请重新输入!");
						}
					}
				}
				break;

			} else {
				System.out.println("账号或密码有误,重新输入!");
			}
		}
	}

	public static void main(String[] args) {
		Operat op = new Operat();
		op.initial1();
		op.show1();
		op.modify1();

		// op.initial2();
		// op.show2();
		// op.modify2();

	}
	
	

//	public void initial2() {
//		user[0] = new Admin();
//		user[0].uname = "abc";
//		user[0].password = "a123";
//
//		user[1] = new Admin();
//		user[1].uname = "def";
//		user[1].password = "d123";
//
//	}
//
//	public void show2() {
//	  for (int i = 0; i < user.length; i++) {
//		System.out.println("账号:" + user[i].uname + "密码:" + user[i].password);}}
//
//	public void modify2() {
//		while (true) {
//			System.out.println("请输入账号:");
//			String name = input.next();
//			System.out.println("请输入密码:");
//			String pwd = input.next();
//			for (int i = 0; i < user.length; i++) {
//				if (name.equals(user[i].uname) && pwd.equals(user[i].password)) {//验证登录
//					while (true) {
//						System.out.println("请输入新密码");    //修改密码
//						String p1 = input.next();
//						System.out.println("请再次输入新密码");
//						String p2 = input.next();
//						if (p1.equals(p2)) {
//							user[i].password = p1;
//							System.out.println("密码修改成功!");
//							break;密码修改成功，跳出
//						} else {
//							System.out.println("两次输入不一致,重新输入!~");
//						}
//					}
//					break;//跳出登录
//				} else {
//					System.out.println("账号或密码有误!");
//					break;
//				}
//			}
//			break;//跳出整个修改密码方法
//		}
//
//	}

}
