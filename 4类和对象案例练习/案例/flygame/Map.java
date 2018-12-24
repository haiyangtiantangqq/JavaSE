package 飞行棋operate;

import java.util.Random;
import java.util.Scanner;

public class Map {
	/*
	 * 符号定义: ☞(开始) ※(炸弹:倒退数步) ∷(普通步) ■(暂停：对方走) 〓(时空隧道：前进数步)
	 * ◎(幸运转盘：选择自己前进数步或对方倒退数步) 玩法： 总共100步（随机产生地图），谁最先走完谁赢
	 */

	int[] map = new int[100];//地图数组（元素0、1、2、3、4代表对应符号）
	Random ran = new Random();
	
	public String getMark(int index1, int index2, int index) {// 获取玩家实时地图，传入玩家所在下标，显示位置
		String str = "";
		if (index1 == index && index2 == index) {// 游戏开始
			str = "≌";//玩家1和2 下标位置重合时显示
		} else if (index1 == index) {// 显示玩家A位置
			str = "Ａ";
		} else if (index2 == index) {// 显示玩家B位置
			str = "Ｂ";
		} else {
			switch (map[index]) {// 普通符号和4种特殊符号显示
			case 0:
				str = "∷";//普通符号
				break;
			case 1:
				str = "■";//4种特殊符号
				break;
			case 2:
				str = "◎";
				break;
			case 3:
				str = "※";
				break;
			case 4:
				str = "〓";
				break;
			}
		}
		return str;// 返回对应的符号
	}

	public void init() {//初始化4种特殊符号
		// 随机得到4个暂停
		for (int i = 1; i <= 4; i++) {
			int r = ran.nextInt(92) + 4;// 产生4到96 的随机数
			if (map[r] == 0) {//普通符号的项
				map[r] = 1;// 把下标为随机数的项(普通符号)置为1到4（对应4种特殊符号）
			} else {
				i--;
			}
		}
		// 随机得到4个幸运大轮盘
		for (int i = 1; i <= 4; i++) {
			int r = ran.nextInt(92) + 4;
			if (map[r] == 0) {
				map[r] = 2;
			} else {
				i--;
			}
		}
		// 随机得到4个地雷
		for (int i = 1; i <= 4; i++) {
			int r = ran.nextInt(92) + 4;
			if (map[r] == 0) {
				map[r] = 3;
			} else {
				i--;
			}
		}
		// 随机得到4个时空隧道
		for (int i = 1; i <= 4; i++) {
			int r = ran.nextInt(92) + 4;
			if (map[r] == 0) {
				map[r] = 4;
			} else {
				i--;
			}
		}
	}

	public void showMap(int index1, int index2) {//显示地图
		for (int i = 0; i < 31; i++) {
			System.out.print(getMark(index1, index2, i));
		}
		System.out.println();
		for (int i = 31; i < 35; i++) {
			for (int j = 0; j < 30; j++) {
				System.out.print("　");
			}
			System.out.println(getMark(index1, index2, i));
		}
		for (int i = 65; i >= 35; i--) {
			System.out.print(getMark(index1, index2, i));
		}
		System.out.println();
		for (int i = 66; i < 69; i++) {
			System.out.println(getMark(index1, index2, i));
		}
		for (int i = 69; i < 100; i++) {
			System.out.print(getMark(index1, index2, i));
		}
		System.out.println();
	}
}
