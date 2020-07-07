
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,6,1,4,9};
		//*swap with variable*
//		int b =4;
//		int c =5;
////		int temp;
////		temp=b;
////		b=c;
////		c=temp;
//		
//	// swap without temp variable
//		b=b+c; //9
//		c=b-c; //4
//		b=b-c; //5
//		
//		System.out.println(b);
//		System.out.println(c);
		//sort with descending order
		for (int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					//swap
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}

}
