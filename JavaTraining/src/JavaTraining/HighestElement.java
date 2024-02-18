package JavaTraining;

import java.util.Scanner;

public class HighestElement {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();

		int highest = Integer.MIN_VALUE;

		if (number1 > highest)
			highest = number1;
		if (number2 > highest)
			highest = number2;
		if (number3 > highest)
			highest = number3;

		System.out.println("Highest = " + highest);
		scanner.close();
	}

}