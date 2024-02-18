package JavaTraining;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMinusTen {
	public static void main(String[] args) {

		String inputTimestamp = "2024-02-17T20:09:48";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

		try {

			LocalDateTime dateTime = LocalDateTime.parse(inputTimestamp, formatter);

			LocalDateTime tenDaysAgo = dateTime.minusDays(10);

			System.out.println("Original Timestamp: " + dateTime.format(formatter));
			System.out.println("Timestamp after subtracting 10 days: " + tenDaysAgo.format(formatter));
		} catch (Exception e) {
			System.out.println("Error: Invalid timestamp format or unable to parse the timestamp.");
			e.printStackTrace();
		}
	}
}
