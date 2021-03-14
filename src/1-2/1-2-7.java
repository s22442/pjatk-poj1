import java.io.*;
import java.util.Scanner;

class App127 {
    public static boolean makesTriangle(float a, float b, float c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public static void main(String[] args) throws IOException {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);

        a = Float.parseFloat(scanner.next());
        b = Float.parseFloat(scanner.next());
        c = Float.parseFloat(scanner.next());

        scanner.close();

        if (!(a > 0 && b > 0 && c > 0)) {
            System.out.println("BŁĄD");
            return;
        }

        System.out.println(makesTriangle(a, b, c) ? "TAK" : "NIE");
    }
}