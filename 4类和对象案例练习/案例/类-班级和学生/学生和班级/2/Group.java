package 学生和班级;

public class Group {	
	String group;//班级名
	Student[] stu;//班级学生（数组）
	//构造方法
	Group(String group,Student[] stu){
		this.group=group;this.stu=stu;}
	double Ave(){//计算班级平均分
    	double sum = 0;
    	Student[] students=this.stu;
        for(int i=students.length;i-->1;)
           {sum=students[i].grade;}
        return sum/students.length;}
	int stucount(){
		if(this.stu==null){return 0;}
		return this.stu.length;}
  }
    	
    	