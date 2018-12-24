package 人和狗;

import java.util.Date;

public class Dog {
	String no;
	String name;
	int age;
	BloodType btype;
	Date deadDate;
	int color;
	Person master;
	
	//鍚冨�?
	Shit eatShit(Shit s){
		System.out.println(this.name+"鍚冧簡涓�鍧ㄥ睅("+s.toString()+")");
		Shit newShit=this.lashi();
		return newShit;
	}
	
	Shit lashi(){
		Shit newShit= new Shit();
		newShit.color=0x0;
		newShit.weight=Math.random()*10;
		newShit.creater=this;
		System.out.println(this.name+"鎷変簡涓�鍧�?"+newShit.toString());
		return newShit;
	}
	void setMaster(Person p){
		this.master=p;
	}
}
