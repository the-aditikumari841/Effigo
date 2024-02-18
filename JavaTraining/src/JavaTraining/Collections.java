package JavaTraining;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();

		//Adding elements to the list
		cities.add("Lucknow");
		cities.add("Bengaluru");
		cities.add("Noida");
		cities.add("Hyderabad");

		//Accessing elements in the list
		System.out.println("Elements in the list:");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		//Updating the elements of List
		cities.set(2, "Mysore");
		System.out.println("After updating, elements in the list:");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		cities.remove(1);
		System.out.println("After removing, elements in the list:");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
	}
}