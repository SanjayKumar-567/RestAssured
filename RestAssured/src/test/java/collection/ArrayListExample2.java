package collection;


	
	
	
	import java.util.ArrayList;

	public class ArrayListExample2 {
	    public static void main(String[] args) {
	        // 1. Create an ArrayList of String type
	        ArrayList<String> cities = new ArrayList<>();

	        // 2. Adding elements to the ArrayList
	        cities.add("New York");
	        cities.add("Los Angeles");
	        cities.add("Chicago");
	        cities.add("Houston");
	        System.out.println("Cities after adding: " + cities);

	        // 3. Inserting an element at a specific index
	        cities.add(2, "San Francisco");
	        System.out.println("Cities after adding at index 2: " + cities);

	        // 4. Accessing elements using get() method
	        String cityAtIndex1 = cities.get(1);
	        System.out.println("City at index 1: " + cityAtIndex1);

	        // 5. Modifying elements using set() method
	        cities.set(3, "Seattle");
	        System.out.println("Cities after modifying index 3: " + cities);

	        // 6. Checking if the ArrayList contains an element
	        boolean containsLA = cities.contains("Los Angeles");
	        System.out.println("Does the list contain 'Los Angeles'? " + containsLA);

	        // 7. Removing an element by value
	        cities.remove("Houston");
	        System.out.println("Cities after removing 'Houston': " + cities);

	        // 8. Removing an element by index
	        cities.remove(0);  // Removes the element at index 0 (New York)
	        System.out.println("Cities after removing index 0: " + cities);

	        // 9. Checking the size of the ArrayList
	        int size = cities.size();
	        System.out.println("Size of the ArrayList: " + size);

	        // 10. Checking if the ArrayList is empty
	        boolean isEmpty = cities.isEmpty();
	        System.out.println("Is the ArrayList empty? " + isEmpty);

	        // 11. Clearing all elements from the ArrayList
	        cities.clear();
	        System.out.println("Cities after clearing: " + cities);

	        // 12. Checking the ArrayList size after clearing
	        System.out.println("Size after clearing: " + cities.size());
	    }
	}



