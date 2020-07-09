package coreJavaTraining;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //String is one of the prebuilt class in java
	//1.string literal
	//2.by creating object of string
		
		String a ="javatraining";//string literal
		String b = "hello"; // b will be pointed to hello as object
		//string ab = new string("hello");//with string class
		String c = new String("hello");//will create new duplicate object
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("Hello World"));
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		
		
		
		
	}

}
