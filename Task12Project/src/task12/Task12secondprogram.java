package task12;

import java.util.ArrayList;

public class Task12secondprogram {
	public static void main(String[] args) {

	// Create an ArrayList of Strings
    ArrayList stringList = new ArrayList<>();

    // Add elements to the ArrayList
    stringList.add("Hello");
    stringList.add("World");
    stringList.add("AI");
    stringList.add("Assistant");

    // Print the ArrayList before removing elements
    System.out.println("ArrayList before removing elements: " + stringList);

    // Remove all elements from the ArrayList
    stringList.clear();

    // Print the ArrayList after removing elements
    System.out.println("ArrayList after removing elements: " + stringList);
}
}
