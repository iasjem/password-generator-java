/**
 * Program generates a random password with only 12 characters long
 * Password does not contain any special characters but only letters and numbers 
 * */

import java.util.Random;

public class MainSrc {

	public static void main(String[] args) {
		
		System.out.println("Password Generator by IasJem");
		
		String charList = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
		Random randomChar = new Random(); // this has been a very helpful link: http://programming.guide/java/generate-random-character.html
		String password="";
		
		for (int i=0; i< charList.length()/5; i++) { // only 12 characters long
			char chars = charList.charAt(randomChar.nextInt(charList.length()));
			password += String.valueOf(chars);
		}
		System.out.println("Your new password is: " + password);
	}

}
