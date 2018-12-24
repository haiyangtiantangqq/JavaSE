package 人和狗;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		Person p1= new Person();
		p1.id= new String("52385238");
		p1.name="xiaowang";
		p1.age=17;
		p1.birthDay=new Date(1999,4,20);
		
		Person p2= new Person();
		p2.id="3838438";
		p2.name="xiaoli";
		p2.age=18;
		p2.birthDay=new Date(1999,2,8);
		
		Dog dog= new Dog();
		dog.no="10086";
		dog.name="鐚�?";
		dog.age=2;
		dog.color=0xffff00;
		
		BloodType type1= new BloodType();
		type1.name="涓崕鐢板洯鐘�";
		type1.from="閲嶅�?";
		type1.hi=false;
		p1.setPet(dog);
		p1.marray(p2);
		Dog temp=p1.sellpet();
		p2.setPet(temp);
		dog.eatShit(dog.eatShit(dog.lashi()));
	}

}
