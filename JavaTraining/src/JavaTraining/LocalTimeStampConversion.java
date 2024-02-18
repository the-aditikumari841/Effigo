package JavaTraining;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class LocalTimeStampConversion {
	public static void main(String[] args) {

		String inputTimestamp = "2024-02-17T20:09:48";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

		try {

			LocalDateTime localDateTime = LocalDateTime.parse(inputTimestamp, formatter);

			LocalDateTime utcDateTime = localDateTime.atZone(ZoneId.of("Asia/Kolkata"))
					.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();

			System.out.println("UTC Timestamp: " + utcDateTime.format(formatter));

			LocalDateTime backToISTDateTime = utcDateTime.atZone(ZoneOffset.UTC)
					.withZoneSameInstant(ZoneId.of("Asia/Kolkata")).toLocalDateTime();

			System.out.println("Local Timestamp in IST format: " + backToISTDateTime.format(formatter));
		} catch (Exception e) {
			System.out.println("Error: Invalid timestamp format or unable to parse the timestamp.");
			e.printStackTrace();
		}
	}
}
