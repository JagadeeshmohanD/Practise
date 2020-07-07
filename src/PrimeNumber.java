
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,2,3,5,7,11,13,17,19,23
		//11%i=0
		int val =53;
		boolean flag = false;
		for(int i=2;i<=val/2;i++) {
			if(val%i==0) {
				flag = true;
				break;
			}
		}
		if(flag) 
			System.out.println("it is not prime");
			else
			System.out.println("it is a prime");

	}

}
