package test;

public class Student {
	String no;
	String name;
	double score;
	Classes cls;
	
	Student(String no,String name,double score){
		this.no=no;
		this.name=name;
		this.score=score;
	}
	
	public String toString(){
		return "学号:"+this.no+",姓名:"+this.name+",成绩"+this.score;
		
	}
}
