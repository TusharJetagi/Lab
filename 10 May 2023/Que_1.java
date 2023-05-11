import java.util.ArrayList;

public class Que_1 
{
public static void main(String[] args) 
{
	
	// Create an ArrayList of integers
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    // Add some integers to the ArrayList
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    // Loop through the ArrayList and print each element using its position
    for (int i = 0; i < numbers.size(); i++) 
    {
        System.out.println("Element at position " + i + ": " + numbers.get(i));
    }

}
}

/*	Output:-Element at position 0: 1
Element at position 1: 2
Element at position 2: 3
Element at position 3: 4
Element at position 4: 5
*/