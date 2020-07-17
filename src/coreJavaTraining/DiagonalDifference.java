package coreJavaTraining;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[][]= {{1,2,3},{4,5,6},{9,8,9}};
	int sumdr=0;
	int sumdl=0;
	int diagonaldiff=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(i==j)
			{
				sumdr=sumdr+a[i][j];
			}
			if((i+j)==(a.length-1))
			{
				sumdl=sumdl+a[i][j];
			}
		}
	}
	 diagonaldiff=Math.abs(sumdr-sumdl); 
     System.out.println("Sum of diagonal elements"+ sumdr);
     System.out.println("Sum of diagonal elements"+ sumdl);
     System.out.println("The absolute diagonal difference"+ " "+ diagonaldiff);
     
	}

}
