import java.io.*;
import java.util.Scanner;

class App126 {
    public static void main(String[] args) throws IOException {
        String a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.next();
        b = scanner.next();

        scanner.close();

        System.out.println("\"%" + b + " " + a + "%\"");
    }
}