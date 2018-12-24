package 飞行棋operate;

import java.util.Random;
import java.util.Scanner;

public class Play {
	int turn = 0;// 控制两个玩家扔骰子的轮数
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
		System.out.println("-----开始游戏！-----");
		while (true) {
			if (index1 == 99 || index2 == 99) {
				// 游戏结束
				if (index1 == 99) {
					System.out.println("恭喜玩家1获得胜利");
				} else {
					System.out.println("恭喜玩家2获得胜利");
				}
				break;
			} else {
				if (turn % 2 == 0) {// 玩家1行动
					play1();
					turn++;
				} else {// 玩家2行动
					play2();
					turn++;
				}
			}
		}
	}

	public void play1() {
		if (is1) {// 是否暂停
			is1 = false;
		} else {
			System.out.println("请按任意键继续游戏");
			in.nextLine();
			System.out.println("请玩家1 扔骰子");
			int r = ran.nextInt(6) + 1;
			System.out.println("扔骰子数为:" + r);
			index1 = index1 + r;
			if (index1 > 99) {
				index1 = 99;
			}
			switch (map.map[index1]) {// 地图对象调用
			case 1:// 暂停
				is1 = true;
				break;
			case 2:// 幸运大轮盘
				System.out.println("恭喜你踩到幸运大轮盘!请选择:1.对方倒退4步      2.自己前进4步");
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
			case 3:// 地雷
				System.out.println("惨了踩到地雷了!");
				index1 = index1 - 4;
				break;
			case 4:// 时空隧道
				System.out.println("运气太好了,进入时空隧道!");
				index1 = index1 + 4;
			}
		}
		System.out.println("玩家1和2当前位置分别为" + index1 + "、" + index2);
		map.showMap(index1, index2);
	}

	public void play2() {
		if (is2) {// 是否暂停
			is2 = false;
		} else {
			System.out.println("请按任意键继续游戏");
			in.nextLine();
			System.out.println("请玩家2 扔骰子");
			int r = ran.nextInt(6) + 1;
			System.out.println("扔骰子数为:" + r);
			index2 = index2 + r;
			if (index2 > 99) {
				index2 = 99;
			}
			switch (map.map[index2]) {// 地图对象调用
			case 1:// 暂停
				is2 = true;
				break;
			case 2:// 幸运大轮盘
				System.out.println("恭喜你踩到幸运大轮盘!请选择:1.对方倒退4步      2.自己前进4步");
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
			case 3:// 地雷
				System.out.println("惨了踩到地雷了!");
				index2 = index2 - 4;
				break;
			case 4:// 时空隧道
				System.out.println("运气太好了,进入时空隧道!");
				index2 = index2 + 4;
				break;
			}
		}
		System.out.println("玩家1和2当前位置分别为" + index1 + "、" + index2);
		map.showMap(index1, index2);
	}
}
