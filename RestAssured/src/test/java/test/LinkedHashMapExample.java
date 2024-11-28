package test;

import java.util.Map;
import java.util.LinkedHashMap;

//LinkedHashMap maintains the order of insertion. The following example demonstrates this:
public class LinkedHashMapExample {
	public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // Adding elements
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 28);

        // Printing elements in insertion order
        System.out.println("Entries in LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Accessing values
        System.out.println("Age of Alice: " + linkedHashMap.get("Alice"));
    }

}
