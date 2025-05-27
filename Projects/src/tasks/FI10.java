package tasks;

import java.util.function.Predicate;

public class FI10 {
	public static void main(String args[]) {
		Predicate<Integer> greater=a -> a>15;
		Predicate<Integer> less=a -> a<10;
		
		boolean bool=greater.test(20);
		boolean bool1=greater.test(2);
		boolean bool2=less.test(5);
		boolean bool3=less.test(20);
		System.out.println(bool);
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
	}

}
