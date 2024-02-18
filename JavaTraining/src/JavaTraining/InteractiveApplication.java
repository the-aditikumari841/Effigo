package JavaTraining;

import java.util.Scanner;

public class InteractiveApplication {
	public static void main(String args[]) {
		System.out.println("Welcome, Thank you for taking the survey");

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name ?");
		String name = scanner.nextLine();

		System.out.println("How much do you spent on coffee");
		double coffeePrice = scanner.nextDouble();

		System.out.println("How much do you spend on fast food ?");
		double foodPrice = scanner.nextDouble();

		System.out.println("How many times a week do you buy coffee ?");
		int coffeeAmount = scanner.nextInt();

		System.out.println("How many times a week do you buy fast food ?");
		int foodAmount = scanner.nextInt();

		scanner.close();

		System.out.println("Thannk you " + name + " for answering all the questions");
		System.out.println("Weekly, you buy coffee " + coffeeAmount + " times a week");
		System.out.println("Weekly, you buy fast food " + foodAmount + " times a week");
		System.out.println("Weekly, you spend $" + coffeePrice + " on coffee");
		System.out.println("Weekly, you spend $" + foodPrice + " on food");
		System.out.println("Weekly, you spend $" + (foodPrice + coffeePrice) + " on food and coffee");
	}
}