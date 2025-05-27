package tasks;

@FunctionalInterface
interface N {
    int square(int x); 

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

public class FI8 implements N {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;

        FI8 f1 = new FI8();

        
        int add = N.add(a,b);
        int sub = N.sub(a,b);
        int mul = N.multiply(a, b);
        int div = N.divide(a, b);

        System.out.println(add + " " + sub + " " + mul + " " + div + " " + f1.square(6));
    
  N sq=(x) ->{
	return x*x;
    };
    System.out.print(sq.square(6));
}

	@Override
	public int square(int x) {
		return x*x;
	}

}
