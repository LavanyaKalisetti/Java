/*
 * Java Program to Convert Binary to Octal

   A Binary (base 2) number is given, and our task is to convert it into an Octal (base 8) number. 
   
   Example of Binary to Octal Conversion:
   Input : 100100
   Output: 44

   A Binary Number System is composed of two symbols: 0s (zeroes) and 1s (ones), 
   which represent low or off and high or on states, respectively, in digital electronics. 
   It is primarily a number system with a base and is extensively used in computer science as well. 
   All the data is stored in binary symbols in computers, which are also called bits. 
   The Binary System derives its name from the fact that it is composed of just two symbols.
   A Binary Number can also be thought of as a string of just 0s and 1s.

   An Octal Number System comprises eight digits ranging from 0 to 7. 
   It derives its name from the fact that it consists of eight digits (hence Oct), 
   which means eight. It is an 8-base number system and can be formulated by grouping the bits 
   in a binary number in groups of three and calculating the corresponding value 
   of each group as a single digit in the resultant Octal Number.

   Methods for Binary to Octal Conversion
   1.Using the built-in toOctalString() method
   2.Using User-defined method
 */

package Conversion_Programs;

public class Binary_Octal {
	int binaryToDecimal(long binary) {
		int DecimalNumber=0,i=0;
		while(binary>0) {
			DecimalNumber +=Math.pow(2, i++) * (binary % 10);
			binary/=10;
		}
		return DecimalNumber;	
	}
	int decimalToOctal(long binary) {
		int octalNumber=0,i=0;
		int DecimalNumber=binaryToDecimal(binary);
		while(DecimalNumber !=0) {
			octalNumber +=(DecimalNumber % 8)
					* ((int)Math.pow(10, i++));
			DecimalNumber /=8;
		}
		return octalNumber;
		
	}
	public static void main(String[] args) {
		Binary_Octal bo=new Binary_Octal();
		System.out.println("The Conversion of Decimal to Octal is: "+bo.decimalToOctal(10011));
		System.out.println("The Conversion of Binary to Decimal is: "+bo.binaryToDecimal(23));
	}

}
