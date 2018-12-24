package 人和狗;

import java.util.Date;


public class Person {
	//韬唤璇両D
	String id;
	//鍚嶅�?
	String name;
	//鍑虹敓鏃ユ湡
	Date birthDay;
	//瀹犵�?
	Dog pet;
	//骞撮�?
	int age;
	//閰嶅�?
	Person mate;
	
	/*缁撳�?*/
	void marray(Person p){
		this.mate=p;
		System.out.println(this.name+p.name);
	}
	
	//寰楀埌�?�犵�?
	void setPet(Dog pet){
		this.pet=pet;
		System.out.println(this.name+pet.name);
	}
	
	//鍗栧疇鐗�?
	Dog sellpet(){
		Dog mypet=this.pet;
		this.pet=null;
		System.out.println(this.name+mypet.name);
		return mypet;
	}
}
