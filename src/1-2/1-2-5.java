import java.io.*;
import java.util.Scanner;

class App125 {
    private static boolean isNatural(int number) {
        return number > 0;
    }

    public static void main(String[] args) throws IOException {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        scanner.close();

        if (!isNatural(a) || !isNatural(b)) {
            throw new IOException("input numbers are not natural");
        }

        System.out.println("Dodawanie: " + a + " + " + b + " = " + (a + b));
        System.out.println("Odejmowanie: " + a + " - " + b + " = " + (a - b));
        System.out.println("Mnożenie: " + a + " * " + b + " = " + (a * b));
        System.out.println("Dzielenie modulo: " + a + " mod " + b + " = " + (a % b));
    }
}