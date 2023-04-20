package Lab;

public class CheckingValue 
{
	public static void main(String[] args) 
	{
		 int[] num = {1789, 2035, 1456, 2013};
		    int TargetValue = 2013;
		    boolean found = false;

		    for (int n : num) 
		    {
		      if (n == TargetValue) 
		      {
		        found = true;
		        break;
		      }
		    }
		    
		    if(found)
		      System.out.println(TargetValue + " is found.");
		    else
		      System.out.println(TargetValue + " is not found.");
		  }
	}


