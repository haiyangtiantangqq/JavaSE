package ����;

import java.util.Random;

public class GetRandom {
	public static void main(String[] args) {
		GetRandom gr=new GetRandom();
		int num[]=gr.getNum(10,1,10);//�����ڵĲ����ֱ������ֵ,��Сֵ,��������ĸ���	
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}	
	public int[] getNum(int max,int min,int count){
		int number[]=new int[count];
		int num=0;//��¼��Ч����
		while(num<count){
			int r=(int)(Math.random()*(max-min+1)+min);
			if(count>max-min+1||min>max){
				System.out.println("����Ҫ������ݷ�Χ����!");
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