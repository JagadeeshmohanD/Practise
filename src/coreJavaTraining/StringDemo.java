package coreJavaTraining;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="hello";//string literal immutable sting,cannot be changed
		String b ="hello";//no duplictae memory 
		String c=a.concat("world");
		String s = new String("hello");//normal way of create
		String s1 = new String("hello");//creates new object every time in memory
		//string buffer or string builder
		StringBuffer sb =new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(5, 7, "aa");
		System.out.println(sb);
		sb.deleteCharAt(12);//hesheaaoworl
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//true
		System.out.println(a.contentEquals(s));//equals operators check for content true
		System.out.println(a.equalsIgnoreCase(s));//true
		System.out.println(a==s);//fail match references ==
		System.out.println(s==s1);//fail references are different as they are defined with string class
		
		//stringBuilder is not thread safe it is non synchronized
		StringBuilder sbb = new StringBuilder("hello");
		System.out.println(sbb.append('a'));
		
		
		
		

	}

}
