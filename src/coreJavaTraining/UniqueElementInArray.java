package coreJavaTraining;

public class UniqueElementInArray {
	   static int firstNonRepeating(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) { 
	            int j; 
	            for (j = 0; j < n; j++) 
	                if (i != j && arr[i] == arr[j]) 
	                    break; 
	            if (j == n) 
	                return arr[i]; 
	        } 
	  
	        return -1; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	  
	        int arr[] = {4,5,4,5,6,4,3,2,1,9,6,9}; 
	        int n = arr.length; 
	  
	        System.out.print(firstNonRepeating(arr, n)); 
	    }  

}
