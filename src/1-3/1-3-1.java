import java.io.*;
import java.util.Set;
import java.util.HashSet;

class App131 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputChars = br.readLine().toLowerCase().replaceAll("[^a-z]", "").toCharArray();

        Set<Character> uniqueCharsSet = new HashSet<Character>();
        for (char c : inputChars) {
            uniqueCharsSet.add(c);
        }

        System.out.println(uniqueCharsSet.size() == 26);
    }
}