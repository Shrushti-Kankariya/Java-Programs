import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> h1 = new HashMap<>();
        h1.put(12, "Shru");
        h1.put(14, "Neha");
        h1.put(16, "Vina");
        h1.put(14, "Neha"); // Duplicate key will overwrite the previous value

        // Get the entry set from the HashMap
        Set<Map.Entry<Integer, String>> s1 = h1.entrySet(); // Define the entry set with generics

        // Create an iterator for the entry set
        Iterator<Map.Entry<Integer, String>> i1 = s1.iterator(); // Define the iterator with generics

        // Iterate over the HashMap entries
        while (i1.hasNext()) {
            Map.Entry<Integer, String> m1 = i1.next(); // No need to cast, as types are already defined
            System.out.println("Roll no: " + m1.getKey() + " Name: " + m1.getValue());
        }
        
        Map m2 = Collections.synchronizedMap(h1);
    }
}
