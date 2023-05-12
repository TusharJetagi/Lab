import java.util.TreeSet;
import java.util.Iterator;


  public class ReverseTreeSet 
  {
  public static void main(String[] args) 
  {
	// Create a TreeSet
     TreeSet<String> set = new TreeSet<String>();
     
   // Add some elements to the TreeSet
          set.add("Apple");
          set.add("Watermelon");
          set.add("Grapes");
          set.add("Kiwi");
          set.add("Mango");
          
     // print original list
   System.out.println("Original tree set:\n" + set);  
     
     // Print the elements in reverse order using the descending iterator
   	 Iterator<String> it = set.descendingIterator();
     System.out.println("\nElements in Reverse Order:");
     while (it.hasNext()) 
     {
    	 System.out.println(it.next());
     }
  }
}

  /* Original tree set:
     [Apple, Grapes, Kiwi, Mango, Watermelon]

     Elements in Reverse Order:
 	 Watermelon
	 Mango
	 Kiwi
	 Grapes
	 Apple
*/