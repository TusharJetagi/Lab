import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSorter 
{
    public static void main(String[] args) 
    {
        // Create an empty ArrayList of strings
        ArrayList<String> strings = new ArrayList<String>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter some strings
        System.out.println("Enter some strings (one per line):");

        // Read the strings entered by the user and add them to the ArrayList
        while (scanner.hasNextLine()) 
        {
            String line = scanner.nextLine();
            if (line.isEmpty()) 
            {
                break;
            }
            strings.add(line);
        }

        // Sort the ArrayList in ascending order using the sort() method of the Collections class
        Collections.sort(strings);

        // Print the sorted ArrayList
        System.out.println("Sorted strings:");
        for (String string : strings) 
        {
            System.out.println(string);
        }
    }
}


/*Output:- Enter some strings (one per line):
tushar
vinayak
onkar
suhel

Sorted strings:
onkar
suhel
tushar
vinayak
*/