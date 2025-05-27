package tasks;

import java.util.function.Function;

public class FI9 {
	public static void main(String args[]) {
		Function<String,String> fun=str -> str.substring(2,5);
		System.out.println(fun.apply("Hyderabad"));
	}

}
