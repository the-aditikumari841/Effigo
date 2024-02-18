package JavaTraining;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class EncryptionAndDecryption {
	public static void main(String[] args) {
		try {

			SecretKey secretKey = generateSecretKey();

			String originalMessage = "Hello, World!";
			System.out.println("Original message: " + originalMessage);

			String encryptedMessage = encrypt(originalMessage, secretKey);
			System.out.println("Encrypted message: " + encryptedMessage);

			String decryptedMessage = decrypt(encryptedMessage, secretKey);
			System.out.println("Decrypted message: " + decryptedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SecretKey generateSecretKey() throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		return keyGenerator.generateKey();
	}

	public static String encrypt(String message, SecretKey secretKey) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptedBytes = cipher.doFinal(message.getBytes());
		return Base64.getEncoder().encodeToString(encryptedBytes);
	}

	public static String decrypt(String encryptedMessage, SecretKey secretKey) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
		return new String(decryptedBytes);
	}
}
