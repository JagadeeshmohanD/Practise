package coreJavaTraining;

public class ConstructorDemo {
	//default
	public ConstructorDemo() {
		System.out.println("the constructor");
		System.out.println("the constructor 1");
	}
	//Parameterized constructor
	public ConstructorDemo(int a,int b) {
		System.out.println("its parametrized constructor");
	}
	public ConstructorDemo(String str) {
		System.out.println(str);
	}
	public void getdata() {
		System.out.println("the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//block of code when ever an object is created
		//constructor will not return any values,name of constructor should be the class name
		//complier will call default constructor
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cp = new ConstructorDemo(1,2);
		ConstructorDemo cps = new ConstructorDemo("hello");
		cd.getdata();
		
	}

}
