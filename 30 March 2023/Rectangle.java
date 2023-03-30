package Lab;

public class Rectangle 
{
	private int length;   // instance variable
	private int breadth;
	
	Rectangle(int length,int breadth)  // Parameterized constructor
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	int Area() // method for calculation
	{
		return length * breadth;
	}
	
	}
 
class RectangleTest 
{
	public static void main(String[] args)  // main method
	{
		Rectangle r = new Rectangle(40,20);
		System.out.println("Area = "+r.Area()); // calculating area of rectangle
		Rectangle r1 = new Rectangle(30,30);
		System.out.println("New Area = "+r1.Area());
		
	}
	
}