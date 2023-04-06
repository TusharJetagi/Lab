package Lab;
class Bank				// Parent class.  
{  
float getRateOfInterest()
	{
	return 0;
	}  
}  
							  
class SBI extends Bank	//Child classes.
{  
float getRateOfInterest()
	{
	return 8;
	}  
}  
  
class ICICI extends Bank
{  
float getRateOfInterest()
	{
	return 7;
	}  
}  
class AXIS extends Bank
{  
float getRateOfInterest()
	{
	return 9;
	}  
}  
  
public class Question_3 	//class to create objects and call the methods
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		System.out.println("Rate of Interest of SBI is: "+s.getRateOfInterest());
		
		
		ICICI i=new ICICI();
		System.out.println("Rate of Interest of ICICI is: "+i.getRateOfInterest());
		
		
		AXIS a=new AXIS();  
		System.out.println("Rate of Interest of AXIS is: "+a.getRateOfInterest());  
	}  
}  
	
	



