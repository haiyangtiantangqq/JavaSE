package 学生和班级;

public class Main {		
		public static void main(String[] args) {
			Student[] Agroup=new Student[]{
			new Student("001","张飞",50.5),
		    new Student("002","刘备",60.5),
			new Student("003","关羽",90),
			new Student("004","黄忠",65),
			new Student("005","马超",80)};
			Group Ga=new Group("Java1",Agroup);
			Student[] Bgroup=new Student[]{
			new Student("006","曹操",99),
			new Student("007","夏侯渊",81.5),
		    new Student("008","夏侯惇",80),
			new Student("009","张辽",87)};
			Group Gb=new Group("Java2",Bgroup);
			System.out.println();
			
			
}}
