package Task2;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {
	public static void main(String args[]) {
	
	 String upper   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String lower   = "abcdefghijklmnopqrstuvwxyz";
	 String digits  = "0123456789";
	 String special = "@#$%!&*";
	 
	 String allCharacters = upper + lower + digits + special;
	 
	 int passwordLength =6;
	 Random random=new Random();
	 
	 Supplier<String> passwordSupplier= ()-> {
		 StringBuilder password=new StringBuilder();
		 for(int i=0;i<passwordLength;i++) {
			 int index=random.nextInt(allCharacters.length());
			 password.append(allCharacters.charAt(index));
		 }
		 return password.toString();
		 };
		 
		 String generatedPassword = passwordSupplier.get();
		 System.out.println("Generated password:"+generatedPassword);
   }
}
