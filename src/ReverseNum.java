
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//543
		//345
		//543%10 = 3
		//54%10 = 4
		//5%10 = 5
		//345
		
		int a = 543;
		int reverse =0;
		while(a!=0) {
			int digit=a%10;
			reverse = digit+ reverse*10;//34
			a=a/10;
		}
		System.out.println(reverse);

	}

}
