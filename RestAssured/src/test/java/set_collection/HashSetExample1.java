package set_collection;


	import java.util.HashSet;
	import java.util.Iterator;

	public class HashSetExample1 {
	    public static void main(String[] args) {
	        // 1. Create a HashSet to store String elements
	        HashSet<String> countries = new HashSet<>();

	        // 2. Add elements to the HashSet		
	        countries.add("USA");
	        countries.add("India");
	        countries.add("Germany");
	        countries.add("Australia");

	        // 3. Adding a duplicate element (which will be ignored)
	        countries.add("USA");

	        // 4. Display the HashSet elements
	        System.out.println("HashSet elements: " + countries);

	        // 5. Check if a specific element exists in the HashSet
	        boolean containsIndia = countries.contains("India");
	        System.out.println("Does HashSet contain 'India'? " + containsIndia);

	        // 6. Remove an element from the HashSet
	        countries.remove("Germany");
	        System.out.println("HashSet after removing 'Germany': " + countries);

	        // 7. Iterate through the HashSet elements using Iterator
	        System.out.println("Iterating through HashSet:");
	        Iterator<String> iterator = countries.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // 8. Get the size of the HashSet
	        int size = countries.size();
	        System.out.println("Size of HashSet: " + size);

	        // 9. Check if the HashSet is empty
	        boolean isEmpty = countries.isEmpty();
	        System.out.println("Is the HashSet empty? " + isEmpty);

	        // 10. Clear the HashSet
	        countries.clear();
	        System.out.println("HashSet after clearing: " + countries);
	    }
	}



