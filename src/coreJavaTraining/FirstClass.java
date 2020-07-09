package coreJavaTraining;

public class FirstClass {
	//Methods
	public void getDate() {
		//
		System.out.println("i am in method");	
		//return "hello";
	}
	static int a =4;
//object or instances or references of class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fn = new FirstClass();
		fn.getDate();
		secondClass sn = new secondClass();
		sn.setData();
		System.out.println(fn.a);
		System.out.println("Hi");
		System.out.println("Hello World");
		System.out.println(a);
		System.out.println("a");

	}

}
