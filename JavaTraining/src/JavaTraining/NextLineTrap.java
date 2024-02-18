package JavaTraining;

import java.util.Scanner;

public class NextLineTrap {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Enter your age, your friend's age, and your parent's age");
		int yourAge = scanner.nextInt();
		int friendAge = scanner.nextInt();
		int parentAge = scanner.nextInt();

		System.out.println("Ages: You - " + yourAge + "Friend - " + friendAge + "Parent - " + parentAge);

		System.out.println("\n Enter a greeting : ");
		scanner.nextLine(); //throwaway nextLine to be wasted on empty space.
		String greeting = scanner.nextLine();

		System.out.println("Greeting : " + greeting);

		//nextDouble() example
		System.out.println("\n Enter the price of a book, a coffee and a meal : ");
		double bookPrice = scanner.nextDouble();
		double coffeePrice = scanner.nextDouble();
		double mealPrice = scanner.nextDouble();

		System.out.println("Prices: Book" + bookPrice + ", Coffee, " + coffeePrice + ", mealPrice" + mealPrice);

		System.out.println("\n Enter a restaurant name:");
		scanner.nextLine();
		String restaurant = scanner.nextLine();

		System.out.println("Restaurant : " + restaurant);

		//nextLong() example
		System.out.println("\n Enter the population of three cities : ");
		long city1Population = scanner.nextLong();
		long city2Population = scanner.nextLong();
		long city3Population = scanner.nextLong();

		System.out.println("Populations : City 1 - " + city1Population + ", City 2 - " + city2Population + ", City 3 - "
				+ city3Population);

		System.out.println("Enter the name of the most populuos city: ");
		String cityName = scanner.nextLine();

		System.out.println("Most populous city: " + cityName);

		System.out.println("\n Enter three colors: ");
		String color1 = scanner.next();
		String color2 = scanner.next();
		String color3 = scanner.next();

		System.out.println("Colors: 1 - " + color1 + ",2 - " + color2 + ", 3 - " + color3);

		System.out.println("\n Enter your favourite color combination: ");
		scanner.nextLine();
		String colorCombination = scanner.nextLine();
		System.out.println("Favourite coor combination: " + colorCombination);

		scanner.close();

	}
}
