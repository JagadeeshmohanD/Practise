
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0,1,2,3,5,8,13,21,34
		int a= 0;
		int b=1;
		int i=1;
		int sum =0;
		while(i<9) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
		}

	}

}
