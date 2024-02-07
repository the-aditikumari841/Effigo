package JavaProjectPackage;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        // Using hashmap to store fruits and their quantity
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Melon", 1);
        fruits.put("Mango", 8);
        fruits.put("Peach", 5);
        fruits.put("Lemon", 2);

        System.out.println("Fruits Inventory:");
        System.out.println(fruits);

        // Retreiving the elements by key
        System.out.println("The price of Melon is: " + fruits.get("Melon"));
        System.out.println("The price of Mango is: " + fruits.get("Mango"));
        System.out.println("The price of Peach is: " + fruits.get("Peach"));
        System.out.println("The price of Lemon is: " + fruits.get("Lemon"));

    }
}
