/*
 Java Program to Add Two Binary Strings
 */
package gfg.programs;

public class AddBinaryString {
	static String addBinary(String a,String b) {
		int i1=Integer.parseInt(a,2);
		int i2=Integer.parseInt(b,2);
		int sum=i1+i2;
		String result=Integer.toBinaryString(sum);
		return result;
	}
	public static void main(String args[]) {
		String a="10";
		String b="01";
		System.out.print(addBinary(a,b));
	}

}
