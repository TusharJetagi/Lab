package Lab;

public class Student 
{
	 String Name;    // instance variable
     int Roll_no;
     String Depart;
     
     Student()		// Default constructor
     {
    	Name = "Tushar";
    	Roll_no = 40;
    	Depart = "CSE";
    	 
     }
     Student(String Name,int Roll_no,String Dept)	// Parameterized constructor
     {
    	 this.Name = Name;
    	 this.Roll_no = Roll_no;
    	 this.Depart = Dept;
     }
     void Display() 
     {
    	 System.out.println("The Name is: "+Name+"\nThe Roll_no is: "+Roll_no+"\nThe Depart is: "+Depart);
    	 
     }
     public static void main(String[] args) 
     {
    	 Student obj = new Student();
    	 System.out.println("   Default constructor  \n");
    	 obj.Display();
    	 Student obj1=new Student("Virat",18,"Cricket");
    	 System.out.println("\n  Parameterized constructor  \n");
    	 obj1.Display();
	}

}
