package collection;


	import java.util.ArrayList;
	import java.util.Iterator;

	public class ArrayListExample1 {
	    public static void main(String[] args) {
	        // 1. Creating an ArrayList of Strings
	        ArrayList<String> fruits = new ArrayList<>();

	        // 2. Adding elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");

	        // 3. Inserting an element at a specific index
	        fruits.add(1, "Mango"); // Inserts "Mango" at index 1

	        // 4. Accessing elements from the ArrayList
	        String fruitAtIndex2 = fruits.get(2);
	        System.out.println("Element at index 2: " + fruitAtIndex2);

	        // 5. Updating elements in the ArrayList
	        fruits.set(2, "Grapes"); // Replaces element at index 2 with "Grapes"

	        // 6. Removing elements from the ArrayList
	        fruits.remove("Apple"); // Removes "Apple" from the list
	        fruits.remove(0); // Removes the element at index 0

	        // 7. Checking if the ArrayList contains an element
	        boolean hasBanana = fruits.contains("Banana");
	        System.out.println("Contains Banana: " + hasBanana);

	        // 8. Getting the size of the ArrayList
	        int size = fruits.size();
	        System.out.println("Size of the list: " + size);

	        // 9. Iterating over the elements in the ArrayList
	        System.out.println("Iterating using for-each loop:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // 10. Iterating using Iterator
	        System.out.println("Iterating using Iterator:");
	        Iterator<String> iterator = fruits.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // 11. Clearing all elements from the ArrayList
	        fruits.clear();
	        System.out.println("List after clear operation: " + fruits);

	        // 12. Checking if the ArrayList is empty
	        boolean isEmpty = fruits.isEmpty();
	        System.out.println("Is the list empty? " + isEmpty);

	        // 13. Adding a collection to the ArrayList
	        ArrayList<String> newFruits = new ArrayList<>();
	        newFruits.add("Pineapple");
	        newFruits.add("Strawberry");
	        fruits.addAll(newFruits);
	        System.out.println("List after adding new fruits: " + fruits);

	        // 14. Converting ArrayList to an array
	        String[] fruitsArray = fruits.toArray(new String[0]);
	        System.out.println("Array elements:");
	        for (String fruit : fruitsArray) {
	            System.out.println(fruit);
	        }

	        // 15. Cloning the ArrayList
	        ArrayList<String> clonedList = (ArrayList<String>) fruits.clone();
	        System.out.println("Cloned list: " + clonedList);
	    }
	}



