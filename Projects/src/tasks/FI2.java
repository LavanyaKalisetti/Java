package tasks;

@FunctionalInterface
 interface Cube {
	int cube(int b);
}
 public class FI2{
	public static void main(String[] args) {
		int a=3;
		Cube cube=b -> b*b*b;
		System.out.println(cube.cube(a));
	}
}

