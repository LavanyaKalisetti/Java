/*
 * By using java.util.function.
 * Function interface Square root and Cuberoot of an integer.
 */
package tasks;

import java.util.Scanner;
import java.util.function.Function;

public class Test2 {
	public static void main(String[] args) {
	
	Function<Integer,Integer> square=(n)->{
		return n*n;
	};
	Function<Integer,Integer> cube=(n)->{
		return n*n*n;
	};
	System.out.println("Square = "+square.apply(5)+"," +"Cube = "+cube.apply(5));
	//System.out.println("Cube = "+cube.apply(5));
	
	}

}

