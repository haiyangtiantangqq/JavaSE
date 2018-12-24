package ������operate;

import java.util.Random;
import java.util.Scanner;

public class Play {
	int turn = 0;// ����������������ӵ�����
	Random ran = new Random();
	Scanner in = new Scanner(System.in);
	Map map = new Map();

	boolean is1 = false;
	boolean is2 = false;
	int index1 = 0;
	int index2 = 0;

	public void play() {
		map.init();
		map.showMap(index1, index2);
		System.out.println("-----��ʼ��Ϸ��-----");
		while (true) {
			if (index1 == 99 || index2 == 99) {
				// ��Ϸ����
				if (index1 == 99) {
					System.out.println("��ϲ���1���ʤ��");
				} else {
					System.out.println("��ϲ���2���ʤ��");
				}
				break;
			} else {
				if (turn % 2 == 0) {// ���1�ж�
					play1();
					turn++;
				} else {// ���2�ж�
					play2();
					turn++;
				}
			}
		}
	}

	public void play1() {
		if (is1) {// �Ƿ���ͣ
			is1 = false;
		} else {
			System.out.println("�밴�����������Ϸ");
			in.nextLine();
			System.out.println("�����1 ������");
			int r = ran.nextInt(6) + 1;
			System.out.println("��������Ϊ:" + r);
			index1 = index1 + r;
			if (index1 > 99) {
				index1 = 99;
			}
			switch (map.map[index1]) {// ��ͼ�������
			case 1:// ��ͣ
				is1 = true;
				break;
			case 2:// ���˴�����
				System.out.println("��ϲ��ȵ����˴�����!��ѡ��:1.�Է�����4��      2.�Լ�ǰ��4��");
				int input = in.nextInt();
				if (input == 1) {
					index2 = index2 - 4;
					if (index2 < 0) {
						index2 = 0;
					}
				} else {
					index1 = index1 + 4;
				}
				break;
			case 3:// ����
				System.out.println("���˲ȵ�������!");
				index1 = index1 - 4;
				break;
			case 4:// ʱ�����
				System.out.println("����̫����,����ʱ�����!");
				index1 = index1 + 4;
			}
		}
		System.out.println("���1��2��ǰλ�÷ֱ�Ϊ" + index1 + "��" + index2);
		map.showMap(index1, index2);
	}

	public void play2() {
		if (is2) {// �Ƿ���ͣ
			is2 = false;
		} else {
			System.out.println("�밴�����������Ϸ");
			in.nextLine();
			System.out.println("�����2 ������");
			int r = ran.nextInt(6) + 1;
			System.out.println("��������Ϊ:" + r);
			index2 = index2 + r;
			if (index2 > 99) {
				index2 = 99;
			}
			switch (map.map[index2]) {// ��ͼ�������
			case 1:// ��ͣ
				is2 = true;
				break;
			case 2:// ���˴�����
				System.out.println("��ϲ��ȵ����˴�����!��ѡ��:1.�Է�����4��      2.�Լ�ǰ��4��");
				int input = in.nextInt();
				if (input == 1) {
					index1 = index1 - 4;
					if (index1 < 0) {
						index1 = 0;
					}
				} else {
					index2 = index2 + 4;
				}
				break;
			case 3:// ����
				System.out.println("���˲ȵ�������!");
				index2 = index2 - 4;
				break;
			case 4:// ʱ�����
				System.out.println("����̫����,����ʱ�����!");
				index2 = index2 + 4;
				break;
			}
		}
		System.out.println("���1��2��ǰλ�÷ֱ�Ϊ" + index1 + "��" + index2);
		map.showMap(index1, index2);
	}
}
