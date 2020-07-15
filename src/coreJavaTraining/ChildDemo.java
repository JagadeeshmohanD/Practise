package coreJavaTraining;

public class ChildDemo extends ParentDemo{
	
	String name="Airwatch";
	
	public ChildDemo()
	{
		super();//super constructor should be the first line in child constructor
		System.out.println("child constructor");
	}
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildDemo cd = new ChildDemo();
     cd.getStringdata();
     cd.getData();
     
	}

}
