package Task2;

import java.util.function.Function;

public class FunctionApplier {

    public static int applyFunction(int value, Function<Integer, Integer> function) {
        return function.apply(value);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> x + 5;
        Function<Integer, Integer> multiply = x -> x * 2;
        Function<Integer, Integer> subtract = x -> x - 3;

        int sampleValue1 = 10;
        System.out.println("Original value: " + sampleValue1);
        System.out.println("After adding 5: " + applyFunction(sampleValue1, add));
        System.out.println("After multiplying by 2: " + applyFunction(sampleValue1, multiply));
        System.out.println("After subtracting 3: " + applyFunction(sampleValue1, subtract));

        System.out.println();

        int sampleValue2 = -15;
        System.out.println("Original value: " + sampleValue2);
        System.out.println("After adding 5: " + applyFunction(sampleValue2, add));
        System.out.println("After multiplying by 2: " + applyFunction(sampleValue2, multiply));
        System.out.println("After subtracting 3: " + applyFunction(sampleValue2, subtract));

        System.out.println();

        int sampleValue3 = 100;
        System.out.println("Original value: " + sampleValue3);
        System.out.println("After adding 5: " + applyFunction(sampleValue3, add));
        System.out.println("After multiplying by 2: " + applyFunction(sampleValue3, multiply));
        System.out.println("After subtracting 3: " + applyFunction(sampleValue3, subtract));
    }
}
