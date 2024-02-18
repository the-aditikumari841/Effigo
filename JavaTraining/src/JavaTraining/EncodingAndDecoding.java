package JavaTraining;

import java.util.Base64;

public class EncodingAndDecoding {
	public static void main(String[] args) {

		String originalString = "Hello, World!";

		String encodedString = encodeString(originalString);
		System.out.println("Encoded string: " + encodedString);

		String decodedString = decodeString(encodedString);
		System.out.println("Decoded string: " + decodedString);
	}

	public static String encodeString(String originalString) {
		byte[] encodedBytes = Base64.getEncoder().encode(originalString.getBytes());
		return new String(encodedBytes);
	}

	public static String decodeString(String encodedString) {
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		return new String(decodedBytes);
	}
}
