package coreJavaTraining;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CentralTraffic a = new AustralianTraffic();
    a.redStop();
    a.greenGo();
    a.flashYellow();
    
    AustralianTraffic at = new AustralianTraffic();
    at.walkonsymbol();
    
    ContinentalTraffic ct = new AustralianTraffic();
    ct.Trainsymbol();
	}
public void walkonsymbol() {
	System.out.println("walk on signal symbol");
}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Flash implementation");
		
	}
	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Stop on Train symbol");
		
	}

}
