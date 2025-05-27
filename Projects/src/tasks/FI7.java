package tasks;

@FunctionalInterface
interface NIT {
    int square(int x); 

    default int add(int a, int b) {
        return a + b;
    }

    default int sub(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

public class FI7 implements NIT {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;

        FI7 f1 = new FI7();

        
        int add = f1.add(a, b);
        int sub = f1.sub(a, b);
        int mul = NIT.multiply(a, b);
        int div = NIT.divide(a, b);

        System.out.println(add + " " + sub + " " + mul + " " + div + " " + f1.square(6));
    }

    @Override
    public int square(int x) {
        return x * x;
    }
}
