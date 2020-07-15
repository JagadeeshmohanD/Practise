package coreJavaTraining;

public class StaticVar {
	
	String name;//instance variable
	String address;
	//static String city = "Bangalore";//class variable all static
	static String city;
	//static int i=0;
	static int i;
	static {
		city = "Bangalore";
		i=0;
	}
	
	StaticVar(String name,String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	public void getAddress()
	{
		System.out.println(address +" "+city);
	}
	
	public static void getcity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj = new StaticVar("bob","Marthalli");
		StaticVar obj1 = new StaticVar("Ram","Indranagar");
		StaticVar obj2 = new StaticVar("sam","cvramannagar");
		obj.getAddress();
        obj1.getAddress();
        obj2.getAddress();
        StaticVar.getcity();
        StaticVar.i=4;
	}

}
