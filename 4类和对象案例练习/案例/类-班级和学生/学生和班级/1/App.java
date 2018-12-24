package test;

public class App {
	public static void main(String[] args) {
		Student[] classAStudents= new Student[]{
				new Student("001","张飞",50.5),
				new Student("002","刘备",60.5),
				new Student("003","关羽",90),
				new Student("004","黄忠",65),
				new Student("005","马超",80)};
		//创建班级a
		Classes classA= new Classes("java1",classAStudents);
		
		//创建班级b
		Classes classB= new Classes("java2",new Student[]{
				new Student("001","曹操",90),
				new Student("002","夏侯惇",80),
				new Student("003","夏侯渊",81.5),
				new Student("003","张辽",87)
		});
		
		//获取a班和b班的总人数
		int exmaAmount=classA.getStudentAmount()+classB.getStudentAmount();
		
		//创建参考人数数组
		Student[] exmaStudents= new Student[exmaAmount];
		
		//把a班学生和b班学生放入参考数组
		for(int i=0;i<classAStudents.length;i++){
			exmaStudents[i]=classAStudents[i];
		}
		for(int i=classAStudents.length;i<exmaAmount;i++){
			exmaStudents[i]=classB.students[i-classAStudents.length];
		}
		Exan exam= new Exan(exmaStudents); 
		
		System.out.println("---------------本次考试情况如下------------------");
		System.out.println(classA.toString());
		System.out.println(classB.toString());
		System.out.println("本次考试最高分:");
		Student highest=exam.findMaxScoreStudent();
		System.out.println(highest);
		System.out.println("本次考试最底分:");
		Student lowest= exam.findMinScoreStudent();
		System.out.println(lowest);
	}
}
