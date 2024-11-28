import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
    // Creating a HashMap
    Map<Integer, String> hashMap = new HashMap<>();
    
    // Adding elements
    hashMap.put(1, "Apple");
    hashMap.put(2, "Banana");
    hashMap.put(3, "Cherry");
    hashMap.put(4, "null");
    hashMap.put(5, "grapes");
    hashMap.put(6, "mango");
      System.out.println(hashMap);
    // Retrieving elements
    
    System.out.println("Value for key 3: " + hashMap.get(3)); // Output: Banana

    // Removing an element
    hashMap.remove(1);
    hashMap.remove(6);

    // Checking if a key exists
    System.out.println("Contains key 1: " + hashMap.containsKey(1)); // Output: false

    // Checking if a value exists
    System.out.println("Contains value 'Cherry': " + hashMap.containsValue("Cherry")); // Output: true

    // Iterating over the entries[
    System.out.println("Entries in hashMap:");
    for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
        System.out.println(hashMap);
    }
}

}
