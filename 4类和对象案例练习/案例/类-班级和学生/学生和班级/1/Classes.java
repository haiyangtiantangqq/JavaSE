package test;

public class Classes {
	String name;
	Student[] students;
	
	Classes(String name,Student[] students){
		this.name=name;
		this.students=students;
	}
	
	double countAvg(){
		double sum=0;
		Student[] stus=this.students;
		for(int i=stus.length;i-->1;){
			sum+=stus[i].score;
		}
		return sum/stus.length;
	}
	
	int getStudentAmount(){
		if(this.students==null){
			return 0;
		}
		return this.students.length;
		
	}
	
	public String toString(){
		return this.name+"班共"+this.getStudentAmount()+"个学生,平均分是"+this.countAvg();
		
	}
}
