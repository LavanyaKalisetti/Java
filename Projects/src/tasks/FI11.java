package tasks;

import java.util.function.Predicate;

public class FI11 {
	public static void main(String[] args) {
		String str[]= {"java","Python","C","C++"};
		Predicate<String> predicate=p -> p.endsWith("va");
		for(String s:str) {
			if(predicate.test(s))
				System.out.println(s);
		}
	}
}
