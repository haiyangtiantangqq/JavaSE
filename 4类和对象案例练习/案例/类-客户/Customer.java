package ����;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Customer {
	String id;// �ͻ�id
	String name;// ����
	int score;// ����
	Customer[] c = new Customer[3];
	Scanner in = new Scanner(System.in);
	GetRandom g = new GetRandom();

	public void inti() {
		int a[] = g.getNum(99999, 10000, 3);
		c[0] = new Customer();
		c[0].name = "ëë";
		c[0].id = Integer.toString(a[0]);
		c[0].score = 345;

		c[1] = new Customer();
		c[1].name = "ĭĭ";
		c[1].id = Integer.toString(a[1]);
		c[1].score = 544;

		c[2] = new Customer();
		c[2].name = "����";
		c[2].id = Integer.toString(a[2]);
		c[2].score = 455;
	}

	public void show() {
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i].score < c[i + 1].score) {
				Customer p = c[i];
				c[i] = c[i + 1];
				c[i + 1] = p;
			}
		}
		System.out.println("�ͻ���Ϣ�������������£�");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].id + " " + c[i].name + " " + c[i].score);
		}
	}

	public void change() {// ע����������һ������Ŀ���

		while (true) {
			System.out.println("������ͻ�ID");
			String id = in.next();
			for (int i = 0; i < c.length; i++) {
				if (id.equals(c[i].id)) {
					while (true) {
						System.out.println("������ͻ�������");
						String a = in.next();
						System.out.println("�������ٴοͻ�������");
						String b = in.next();
						if (!a.equals(b)) {
							System.out.println("�������벻һ�£�����������ͻ�������");
						} else {
							c[i].name = b;
							System.out.println("idΪ" + c[i].id
									+ "�Ŀͻ��������޸ĳɹ�����Ϊ" + b);
							break;
						}
					}
					break;
				} else {
					System.out.println("�˺Ų����ڣ�����������");
				}
				break;
			}
			break;
		}
	}
}
