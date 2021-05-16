import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class App522 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            strings.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }
        scanner.close();

        ArrayList<String> uppercaseStrings = new ArrayList<String>();
        for (String str : strings) {
            uppercaseStrings.add(str.toUpperCase());
        }

        System.out.println(uppercaseStrings);
    }
}