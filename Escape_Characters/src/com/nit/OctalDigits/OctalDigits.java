package com.nit.OctalDigits;

public class OctalDigits {
	public static void main(String[] args) {
		System.out.println("a\0b");
		System.out.println("a\1b");
		System.out.println("a\2b");
		System.out.println("a\3b");
		System.out.println("a\4b");
		System.out.println("a\5b");
		System.out.println("a\6b");
		System.out.println("a\7b");
		//System.out.println("a\8b");  //Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\ )
		//System.out.println("a\9b");  //Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\ )
		System.out.println("a\10b");
		System.out.println("a\11b");
		System.out.println("a\12b");
		System.out.println("axyz\10\10b");
}
}
