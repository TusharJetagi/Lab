import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashSetToTreeSet 
{
    public static void main(String[] args) 
    {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Pineapple");
        
        System.out.println("Original Hash Set: \n" + hashSet);
        

        // Create a TreeSet from the HashSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Print the TreeSet
        System.out.println("\nTreeSet: \n" + treeSet);
    }
}

/* Original Hash Set: 
   [Apple, Pineapple, Banana]

   TreeSet: 
   [Apple, Banana, Pineapple]
*/