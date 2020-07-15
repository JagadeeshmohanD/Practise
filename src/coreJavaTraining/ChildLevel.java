package coreJavaTraining;
//function overloading
//either argument count should be different or argument data type should be different
public class ChildLevel extends ChildClassDemo{

	public void getdata(int a)
	{
		System.out.println(a);
	}
	public void getdata(String b)
	{
		System.out.println(b);
	}
	public void getdata(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multilevel inheritance is not allowed in java
		System.out.println();
    ChildLevel cl = new ChildLevel();
    cl.audiosystem();
    cl.getdata(2);
    cl.getdata("hello");
    cl.getdata(3, 5);
    
	}

}
