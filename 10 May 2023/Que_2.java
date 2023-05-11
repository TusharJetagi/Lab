import java.util.ArrayList;
import java.util.Collections;

public class Que_2 
{
	public static void main(String[] args) {
		 // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Add some integers to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // Sort the ArrayList in descending order using Collections.sort() method
        Collections.sort(numbers, Collections.reverseOrder());

        // Print the sorted ArrayList
        System.out.println("ArrayList in descending order:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
	}

/*Output:- ArrayList in descending order:
9
7
5
2
1
*/
