import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

class App525 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputStrings = new ArrayList<>();

        while (scanner.hasNextLine()) {
            inputStrings.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }
        scanner.close();

        Map<String, Integer> dictionary = new TreeMap<>();
        for (String str : inputStrings) {
            int value = dictionary.containsKey(str) ? dictionary.get(str) + 1 : 1;
            dictionary.put(str, value);
        }

        System.out.println(dictionary);
    }
}