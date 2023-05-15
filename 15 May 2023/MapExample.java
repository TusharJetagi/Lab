
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // create a new map
        Map<String, String> map = new HashMap<>();
        map.put("101", "Tushar");
        map.put("102", "Virat");
        map.put("103", "Rohit");

        // get input from user
        System.out.print("Enter key to find value: ");
        String key = scanner.nextLine();

        // search for key in map
        String value = map.get(key);

        // print result
        if (value != null) 
        {
            System.out.println("Value found: " + value);
            System.out.println("Object: " + map);
        } 
        
        else 
        {
            System.out.println("Value not found.");
        }
    }
}

/*Enter key to find value: 101
Value found: Tushar
Object: {101=Tushar, 102=Virat, 103=Rohit}

Enter key to find value: 105
Value not found.
*/