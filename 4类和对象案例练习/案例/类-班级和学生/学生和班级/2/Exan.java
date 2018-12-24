package 学生和班级;

public class Exan {
	Student[] stu;
	Group gg;
	int[] a;
	public String ToString(){
		System.out.println(gg.group+"班共有"+gg.stucount()+"个学生，平均分是"+gg.Ave());
		return null;
	} 

}
