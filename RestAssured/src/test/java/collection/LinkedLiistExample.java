package collection;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * LinkedList is implemented using Doubly linked list. This is best suited for insertion and deletion operations.
 * Unlike ArrayList, this is not the best for retrieving the data.
 * All the collections implements Serializable and cloneable Interfaces.
 *  LinkedList also implements those Interfaces but not RandomAccess Interface.
 */
public class LinkedLiistExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		System.out.println("the list cointains : "+linkedList);
		System.out.println("-----------------------------------------------------------------------");
		
		linkedList.addFirst(null);
		linkedList.addLast(null);
		linkedList.add(5, 50);
		System.out.println("updated list cointains : "+linkedList);
		System.out.println("-----------------------------------------------------------------------");
   
		System.out.println("the list cointains : "+linkedList);

		System.out.println("first value : "+linkedList.getFirst()); 
		System.out.println("last value : "+linkedList.getLast()); 
		System.out.println("index valve 4 is : "+linkedList.get(4));
		System.out.println("the list cointains : "+linkedList);

		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("the list cointains : "+linkedList);

		System.out.println("remove first is : "+linkedList.removeFirst());
		System.out.println("remove last is : "+linkedList.removeLast());
		System.out.println("remove by index : "+linkedList.remove(4));
		System.out.println("the list cointains : "+linkedList);


		System.out.println("-----------------------------------------------------------------------");
		//poll method works like remove and this is only for linkedlist
		System.out.println("poll : "+linkedList.poll());
		System.out.println("the list cointains : "+linkedList);

		System.out.println("poll first is : "+linkedList.pollFirst());
		System.out.println("the list cointains : "+linkedList);

		System.out.println("poll last : "+linkedList.pollLast());
		System.out.println("the list cointains : "+linkedList);

		
		System.out.println("-----------------------------------------------------------------------");
		//offer method works like add and this is only for linkedlist
		linkedList.offer(20);
		linkedList.offerFirst(10);
		linkedList.offerLast(40);
		System.out.println("the list cointains : "+linkedList);
		System.out.println("-----------------------------------------------------------------------");
        //contains 
	    System.out.println(linkedList.contains(100));

	    System.out.println(linkedList.contains(10));
		System.out.println("-----------------------------------------------------------------------");

	    
	    for (Integer integer : linkedList) {
	    	System.out.println("using for each : "+integer);
			
		}
		System.out.println("-----------------------------------------------------------------------");

	    Iterator<Integer> iterator=linkedList.iterator();
	    while (iterator.hasNext()) {
	    	System.out.println("using iterator : "+iterator.next());
			
		}
		

	}
}
