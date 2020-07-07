
public class SumOfElements {

	//create a method which accepts Array and Returns sum of all the elements in array
	//print 5 Multiplication table without using multiply operator
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int sum = sumArray(a);
		System.out.println(sum);
		int result = multiply(5,10);
        System.out.println(result);
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k=1;
		int sum=0;
		while(k<=j)
		{
			sum = sum +i;
			k++;
			
		}
		return sum;
	}

	public static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;(i<=a.length-1);i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
