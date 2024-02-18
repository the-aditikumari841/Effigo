package JavaTraining;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeStampToUnixTimeStamp {
	public static void main(String[] args) {

		String inputTimestamp = "2024-02-17T20:09:48";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

		try {

			LocalDateTime localDateTime = LocalDateTime.parse(inputTimestamp, formatter);

			long unixTimestamp = localDateTime.atZone(ZoneId.of("Asia/Kolkata")).toEpochSecond();

			System.out.println("Unix Timestamp: " + unixTimestamp);
		} catch (Exception e) {
			System.out.println("Error: Invalid timestamp format or unable to parse the timestamp.");
			e.printStackTrace();
		}
	}
}
