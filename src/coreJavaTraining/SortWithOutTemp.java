package coreJavaTraining;

public class SortWithOutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,7,8,6,9};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
