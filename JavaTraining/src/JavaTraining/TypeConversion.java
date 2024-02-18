package JavaTraining;

public class TypeConversion {

	public static void main(String[] args) {

		int ants = 2000;
		int purchasedBlockOfCheese = 1;
		System.out.println("There are" + ants + "ants, and" + purchasedBlockOfCheese + "block of cheese");
		System.out.println(
				"Each ant carried " + ((double) purchasedBlockOfCheese) / ants + "from the total cheese amount");
		double salary = 5423.94;
		int roundedSalary = (int) salary;
		System.out.println("Mortgage Broker : What is your monthly salary in dollars?");
		System.out.println("My monthly salary is : " + roundedSalary);
	}

}