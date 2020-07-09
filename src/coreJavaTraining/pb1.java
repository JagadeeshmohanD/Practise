package coreJavaTraining;

public class pb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested loops working
		for(int i =1;i<=4;i++)//outer for loop this block will loop for 4 times
			{
		System.out.println("Outer Loop Started");
			for(int j=1;j<=4;j++) //inner for loop
			{
				System.out.println("inner Loop");
			}
		System.out.println("Outer Loop Finish");
		}

	}

}
