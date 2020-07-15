package coreJavaTraining;
//one try can be followed by multiple catch block
//catch should be an immediate block after try
public class ExceptionDemo {
	
	int a=4;
	//try catch mechanism


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int b =7;
         int c=0;
         int arr[]=new int[5];
		try 
		{
				//int k =b/c;
				//System.out.println(k);
				System.out.println(arr[7]);
		}
		catch(ArithmeticException et)
		{
			System.out.println("I catched the error/Exception"+ et);
		}
		catch(IndexOutOfBoundsException out)
		{
			System.out.println("I catched the error/Exception"+out);
		}
		catch(Exception e)
		{
			System.out.println("catched the error Exception"+e);
		}
		finally
		{
			//This block is executed irrespectively program execute or not
			//should be used along with try block
			//ex:-browser.close();or delete cookies 
			//finally block will not be executed when JVM is stopped forcefully
		  System.out.println("delete cookies");
		}
		
	}

}
