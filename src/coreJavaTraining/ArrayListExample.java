package coreJavaTraining;

import java.util.ArrayList;

public class ArrayListExample {
//can accept duplicate values
	//ArrayList ,LinkedList,Vector-Implementing List Interface
	//Array has fixed size
	//Array list is dynamic
	//you can access and insert any values in any index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> s = new ArrayList<String>();
		s.add("Jags");
		s.add("java");
		System.out.println(s);
		s.add(0, "Student");
		System.out.println(s);
//		s.remove(1);
//		System.out.println(s);
//		s.remove("java");
//		System.out.println(s);
		System.out.println(s.get(2));
		System.out.println(s.contains("java"));
	    System.out.println(s.indexOf("Jags"));
	    System.out.println(s.isEmpty());
	    System.out.println(s.size());	
		

	}

}
