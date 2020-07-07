
public class AustralianTraffic implements CentralTraffic,continentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
      
		AustralianTraffic at = new AustralianTraffic();
		at.walkonsymbole();
		
		continentalTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		//code
		System.out.println("greenGo Implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
		
	}
public void walkonsymbole() {
	System.out.println("cross the road");
}
	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash Yellow Implementation");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Stop when trainSymbol");
	}

}
