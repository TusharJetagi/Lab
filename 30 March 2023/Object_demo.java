package Lab;

public class Object_demo   
{
	void show() // creating method
	{
		int a = 10;        // Initializing variable
		int b = 10;
		int c;
		c = a + b;		// we did addition operation here and saved result in c variable
		
		System.out.println("The result is: "+c);  // printing the result 
		
	}
	
	public static void main(String[] args)  // creating main method 
	{ 
		Object_demo ob = new Object_demo(); // creating object of class using new keyword.
		
		ob.show();  // calling method 
	}

}
