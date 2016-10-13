package test_1;
import test_2.student;
public class HelloWorld {
	static{
		System.out.println("静态");}
	
	public static void main(String[] args) {
		int age;
		// TODO Auto-generated method stub
		student p=new student();
		Animal a=new Cat();
		a.run();
		//Animal a=new Dog();
		a.eat();
		age=p.setAge(29);
		System.out.println(age);
	}

}
