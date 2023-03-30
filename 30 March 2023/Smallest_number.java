package Lab;

public class Smallest_number 
{
	void show()    // creating method
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<=b && a<=c)
		{
		System.out.println( a + " is smaller.");
		}
	else if(b>=a && b>=c)
		{
		System.out.println( b  + " is smaller.");
		}
	else
		{
		System.out.println( c  + " is smaller." );
		}
		
		
	}
	public static void main(String[] args)  // main method
	{
		Smallest_number sn = new Smallest_number(); //creating object of class
		sn.show();  // calling method
	}

}
