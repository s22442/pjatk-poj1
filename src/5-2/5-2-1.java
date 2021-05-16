import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class App521 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            strings.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }
        scanner.close();

        System.out.println(strings);
    }
}