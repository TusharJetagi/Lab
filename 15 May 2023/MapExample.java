import java.util.HashMap;
import java.util.Map;

public class MapExample 
{
    public static void main(String[] args) 
    {
        // create a new map
        Map<String, String> map = new HashMap<>();
        map.put("101", "Cricket");
        map.put("102", "Football");

        // check if map is empty
        if (map.isEmpty()) 
        {
            System.out.println("Map is empty.");
        }
        
        else 
        {
            System.out.println("Map is not empty.");

            // remove all elements from map
            map.clear();

            // check if map is empty again
            if (map.isEmpty())
            {
                System.out.println("All elements have been removed from the map.");
            } 
            
            else 
            {
                System.out.println("Could not remove all elements from the map.");
            }
        }
    }
}

/* Map is not empty.
   All elements have been removed from the map.
*/