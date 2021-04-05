import java.io.*;
import java.util.stream.IntStream;

class Numbers {
    private int[] numbers;

    public Numbers(int... numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        return IntStream.of(numbers).sum();
    }

    public double average() {
        return IntStream.of(numbers).average().getAsDouble();
    }

    public int min() {
        return IntStream.of(numbers).min().getAsInt();
    }

    public int max() {
        return IntStream.of(numbers).max().getAsInt();
    }

    public int product() {
        int product = 1;

        for (int n : numbers) {
            product *= n;
        }

        return product;
    }

    public double geometric() {
        return Math.pow(this.product(), 1. / numbers.length);
    }
}

class NumbersTest {
    public static void main(String[] args) throws IOException {
        Numbers numbers = new Numbers(3, 4, 10);

        System.out.println("sum(): " + numbers.sum());
        System.out.println("average(): " + numbers.average());
        System.out.println("min(): " + numbers.min());
        System.out.println("max(): " + numbers.max());
        System.out.println("geometric(): " + numbers.geometric());
    }
}