package 对象;

import java.util.Random;

public class GetRandom {
	public static void main(String[] args) {
		GetRandom gr=new GetRandom();
		int num[]=gr.getNum(10,1,10);//括号内的参数分别是最大值,最小值,和随机数的个数	
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}	
	public int[] getNum(int max,int min,int count){
		int number[]=new int[count];
		int num=0;//记录有效数据
		while(num<count){
			int r=(int)(Math.random()*(max-min+1)+min);
			if(count>max-min+1||min>max){
				System.out.println("你所要求的数据范围有误!");
				return null;
			}
			boolean b=false;
			for(int i=0;i<number.length;i++){
				if(r==number[i]){
					b=true;
					break;
				}
			}		
			if(!b){
				number[num]=r;
				num++;
			}	
		}	
		return number;
	}

}