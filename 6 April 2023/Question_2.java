package Lab;
class Person 
{
    String name;
    int age;
    
    public Person(String name, int age) 	// Constructor for Person class
    {
        this.name = name;
        this.age = age;
    }
    
    public void speak() 		// Speak method for Person class
    {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old.");
    }
}

class Stud extends Person 
{
    int grade;
    
    public Stud(String name, int age, int grade) 	// Constructor for Student class
    {
        super(name, age);
        this.grade = grade;
    }
    
    public void study() 		// Study method for Student class
    {
        System.out.println(this.name + " with grade " + this.grade + " is studying.");
    }
}
   
public class Question_2 
{
	public static void main(String[] args) 
	{
        Stud s = new Stud("Tushar", 23, 90);	// Create an object of the Student class
        s.speak();		// Call the speak() method of the Person class
        s.study();		// Call the study() method of the Student class
	}
}