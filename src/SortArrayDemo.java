
public class SortArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sort Array in Ascending and Descending order
		int a[] = {2,6,1,4,9};//1,2,4,6,9
		
		for (int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				//sort with ascending order
				if(a[i]>a[j]) {
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
