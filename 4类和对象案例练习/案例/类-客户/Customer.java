package 对象;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Customer {
	String id;// 客户id
	String name;// 姓名
	int score;// 积分
	Customer[] c = new Customer[3];
	Scanner in = new Scanner(System.in);
	GetRandom g = new GetRandom();

	public void inti() {
		int a[] = g.getNum(99999, 10000, 3);
		c[0] = new Customer();
		c[0].name = "毛毛";
		c[0].id = Integer.toString(a[0]);
		c[0].score = 345;

		c[1] = new Customer();
		c[1].name = "沫沫";
		c[1].id = Integer.toString(a[1]);
		c[1].score = 544;

		c[2] = new Customer();
		c[2].name = "秀秀";
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
		System.out.println("客户信息按积分排序如下：");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].id + " " + c[i].name + " " + c[i].score);
		}
	}

	public void change() {// 注意两次姓名一致情况的考虑

		while (true) {
			System.out.println("请输入客户ID");
			String id = in.next();
			for (int i = 0; i < c.length; i++) {
				if (id.equals(c[i].id)) {
					while (true) {
						System.out.println("请输入客户新姓名");
						String a = in.next();
						System.out.println("请输入再次客户新姓名");
						String b = in.next();
						if (!a.equals(b)) {
							System.out.println("两次输入不一致，请重新输入客户新姓名");
						} else {
							c[i].name = b;
							System.out.println("id为" + c[i].id
									+ "的客户新姓名修改成功，名为" + b);
							break;
						}
					}
					break;
				} else {
					System.out.println("账号不存在，请重新输入");
				}
				break;
			}
			break;
		}
	}
}
