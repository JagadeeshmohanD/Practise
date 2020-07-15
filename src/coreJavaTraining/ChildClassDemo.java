package coreJavaTraining;

public class ChildClassDemo extends ParentClassDemo {
	public void audisystem()
	{
		System.out.println("new audio system for child");
	}
    public void engine()
    {
    	System.out.println("New Engine BS6 Implemented");
    }
    public void colour()
    {
    	System.out.println(colour);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildClassDemo cd = new ChildClassDemo();
     cd.colour();
     cd.brakes();
     cd.audisystem();//function overridin both have method same name same signature same parameter
	}

}
