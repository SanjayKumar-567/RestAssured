package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List(I) is the Child of Collection(I). ArrayList (C) is one of the classes
 * provides implementation for the List(I). In list duplicate values are allowed
 * and the insertion order is maintained. The underlying DS is resizeable Array
 * or Growable Array. We can insert Heterogeneous objects as well. NOTE: All the
 * collections can store Heterogeneous objects can be stored except TREE SET and
 * TREE MAP. ArraList and vector implements RandomAccess, Serializable and
 * Cloneable Interfaces Synchronized-> No Thread safe-> NO Default capacity-10
 * Fill Ratio or Load factor:1 or 100% Growth Rate: current_size +
 * current_size/2
 */

public class ArrayListExample {

	public void arrayListExample() {
		ArrayList<String> games = new ArrayList<String>();
		games.add("coc");
		games.add("hay day");
		games.add("pubg");
		games.add("cod");
		System.out.println(games);

		System.out.println("===========================");
		games.add(0, "bug on the wire");
		games.add(5, "road rash");
		System.out.println(games);
		System.out.println("===========================");

		String randomondex = games.get(3);
		System.out.println("favi " + randomondex);
		games.add("road rash");
		System.out.println("===========================");

		games.indexOf("road rash");
		System.out.println(games.indexOf("First indexof" + "road rash"));
		games.lastIndexOf("road rash");
		System.out.println("Last indexof " + games.lastIndexOf("road rash"));
		games.indexOf("gta");
		System.out.println("if the given value is not present the we get the value of " + games.indexOf("gta"));
		System.out.println("===========================");

		System.out.println(games);

		System.out.println("===========================");

		ArrayList<String> anotherList = new ArrayList<String>();
		// add all will work like clone
		anotherList.addAll(games);
		System.out.println("another list values are " + anotherList);

		// remove method is used to remove values
		anotherList.remove(0);
		System.out.println(anotherList);// remove method is not working

		anotherList.remove("road rash");
		System.out.println(anotherList);

		// clear method will delete all in the list
		anotherList.clear();
		System.out.println(anotherList.isEmpty());
		System.out.println(anotherList);
		System.out.println("===========================");

		// set method is used to update values
		games.set(0, null);
		games.set(1, "clash of clans");
		games.remove(0);
		games.remove(5);
		System.out.println(games);
		System.out.println(games.isEmpty());// this method will return true or false

		// iterate
		for (String string : games) {
			System.out.println("using for each :" + string);

		}
		System.out.println("------------------------------------------------------------------------------------");

		for (int i = 0; i < games.size(); i++) {
			System.out.println("using normal for loop  :" + games.get(i));

		}
		System.out.println("------------------------------------------------------------------------------------");
//    this is listiterator method  using this we can tranvers forward and back word
		ListIterator<String> iterator = games.listIterator();
		while (iterator.hasNext()) {
			System.out.println("by using list iterator : "+iterator.next());
		}
		System.out.println("------------------------------------------------------------------------------------");
		while (iterator.hasPrevious()) {
			System.out.println("by using list iterator : "+iterator.previous());

		}

		System.out.println("------------------------------------------------------------------------------------");

		// iterator only forward direction is possible
		Iterator<String> iterator1 = games.iterator();
		while (iterator1.hasNext()) {
			System.out.println("by using iterator : "+iterator1.next());

		}

		System.out.println("------------------------------------------------------------------------------------");

	}

	public static void main(String[] args) {
		ArrayListExample example = new ArrayListExample();
		example.arrayListExample();

	}

}
