package ѧ���Ͱ༶;

public class Group {	
	String group;//�༶��
	Student[] stu;//�༶ѧ�������飩
	//���췽��
	Group(String group,Student[] stu){
		this.group=group;this.stu=stu;}
	double Ave(){//����༶ƽ����
    	double sum = 0;
    	Student[] students=this.stu;
        for(int i=students.length;i-->1;)
           {sum=students[i].grade;}
        return sum/students.length;}
	int stucount(){
		if(this.stu==null){return 0;}
		return this.stu.length;}
  }
    	
    	