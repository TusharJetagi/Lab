import java.util.HashSet;

public class EmptyHashSet 
{
    public static void main(String[] args) 
    {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add some elements to the HashSet
        set.add("Tushar");
        set.add("Vinayak");
        set.add("Rohit");

        // Print the original HashSet
        System.out.println("Original HashSet: " + set);

        // Clear the HashSet
        set.clear();

        // Print the HashSet after clearing it
        System.out.println("HashSet after clearing: " + set);
    }
}

/* Original HashSet: [Rohit, Tushar, Vinayak]
   HashSet after clearing: []
*/