package Array;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,8,5,2,8};   // declare & initializing array
		for(int i:a) // for each loop for print
			System.out.println(i);
		
		System.out.println("Duplicate nos are: ");
		 for(int i = 0; i < a.length; i++) // this for loop for iteration from 0 to length of array
		 {  
	            for(int j = i + 1; j < a.length; j++) //this loop for compare with other elements
	            {  
	                if(a[i] == a[j])  // checking 
	                    System.out.println(a[j]);  
	            }  
	        }  
	}

}
