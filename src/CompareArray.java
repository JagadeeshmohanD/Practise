import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compare same index of 2 different arrays and create another array for matching values
		int a[] = {1,4,5,7};
		int b[] = {6,4,2,7}; // o/p (4,7)
       // int[] ab = new int[4];
		ArrayList<Integer>al = new ArrayList<Integer>();
        
		for (int i=0;i<=(a.length-1);i++) {
			if(a[i] == b[i]) {
				//code to create another Array
				al.add(a[i]);
			}
		}
		Object[] c=al.toArray();
		for(Object obj : c)
		{
		System.out.println(obj);
		}
	}

}
