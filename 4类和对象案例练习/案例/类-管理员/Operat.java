package com.test2;

import java.util.Scanner;

public class Operat {
	Scanner input = new Scanner(System.in);
	Admin aa;// ����Ա1,ȫ�ֱ���
	Admin bb;// ����Ա2
	Admin user[] = new Admin[2];// �Զ�����������

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
			System.out.println("�������˺�:");
			String name = input.next();
			System.out.println("����������:");
			String pwd = input.next();
			if (name.equals(aa.uname) && pwd.equals(aa.password)
					|| name.equals(bb.uname) && pwd.equals(bb.password)) {
				while (true) {
					if (name.equals(aa.uname) && pwd.equals(aa.password)) {
						System.out.println("������������");
						String p1 = input.next();
						System.out.println("���ٴ�����������");
						String p2 = input.next();
						if (p1.equals(p2)) {
							aa.password = p1;
							System.out.println("�����޸ĳɹ�!");
							break;
						} else {
							System.out.println("�����������벻һ��,����������!");
						}

					} else {

						System.out.println("������������");
						String p1 = input.next();
						System.out.println("���ٴ�����������");
						String p2 = input.next();
						if (p1.equals(p2)) {
							aa.password = p1;
							System.out.println("�����޸ĳɹ�!");
							break;
						} else {
							System.out.println("�����������벻һ��,����������!");
						}
					}
				}
				break;

			} else {
				System.out.println("�˺Ż���������,��������!");
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
//		System.out.println("�˺�:" + user[i].uname + "����:" + user[i].password);}}
//
//	public void modify2() {
//		while (true) {
//			System.out.println("�������˺�:");
//			String name = input.next();
//			System.out.println("����������:");
//			String pwd = input.next();
//			for (int i = 0; i < user.length; i++) {
//				if (name.equals(user[i].uname) && pwd.equals(user[i].password)) {//��֤��¼
//					while (true) {
//						System.out.println("������������");    //�޸�����
//						String p1 = input.next();
//						System.out.println("���ٴ�����������");
//						String p2 = input.next();
//						if (p1.equals(p2)) {
//							user[i].password = p1;
//							System.out.println("�����޸ĳɹ�!");
//							break;�����޸ĳɹ�������
//						} else {
//							System.out.println("�������벻һ��,��������!~");
//						}
//					}
//					break;//������¼
//				} else {
//					System.out.println("�˺Ż���������!");
//					break;
//				}
//			}
//			break;//���������޸����뷽��
//		}
//
//	}

}
