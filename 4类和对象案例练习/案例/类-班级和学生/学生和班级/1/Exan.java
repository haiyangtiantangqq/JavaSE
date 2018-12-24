package test;

public class Exan {
	Student[] students;
	Exan(Student[] students){
		this.students=students;
	}
	
	Student findMaxScoreStudent(){
		Student[] stus=this.students;
		Student max=stus[0];
		for(int i=stus.length;i-->1;){
			if(max.score<stus[i].score){
				max=stus[i];
			}
		}
		return max;
	}
	Student findMinScoreStudent(){
		Student[] stus=this.students;
		Student min=stus[0];
		for(int i=stus.length;i-->1;){
			if(min.score>stus[i].score){
				min=stus[i];
			}
		}
		return min;
	}
}
