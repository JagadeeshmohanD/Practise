package coreJavaTraining;

public class reverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pallendrom
		String s = "Malayalam";
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			
			t=t+s.charAt(i);
		}
		System.out.println(t);
		if(s.equalsIgnoreCase(t)) {
			System.out.println("Given String is Palindrome");
		}
		else
			System.out.println("Given String is Not palindrome");
        	
	}

}
