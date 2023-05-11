import java.util.ArrayList;

public class ArrayListJoiner 
{
    public static void main(String[] args) 
    {
        // Create two ArrayLists of integers
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        
        // Add some integers to the first ArrayList
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        
        // Add some integers to the second ArrayList
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);

        // Join the two ArrayLists using the addAll() method of ArrayList class
        ArrayList<Integer> joinedNumbers = new ArrayList<Integer>(numbers1);
        joinedNumbers.addAll(numbers2);

        // Print the joined ArrayList
        System.out.println("Joined ArrayList:");
        for (int number : joinedNumbers) 
        {
            System.out.println(number);
        }
    }
}

/*Output:- Joined ArrayList:
1
2
3
4
5
6
*/