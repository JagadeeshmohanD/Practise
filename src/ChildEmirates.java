
public class ChildEmirates extends ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.safetyGuidlines();
		c.bodycolor();
		
		//ParentAircraft p = new ParentAircraft(); //cannot insintiate abstract class
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
