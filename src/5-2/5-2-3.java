import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class App523 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> ints = new TreeSet<>();

        while (scanner.hasNextInt()) {
            ints.add(scanner.nextInt());
        }
        scanner.close();

        System.out.println(ints);
    }
}