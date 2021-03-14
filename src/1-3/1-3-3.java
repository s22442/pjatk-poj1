import java.io.*;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
// import java.util.stream.Collectors;

class App133 {
    private static int max_rec(List<Integer> numbers) {
        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        return Math.max(numbers.remove(0), max_rec(numbers));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] inputNumbersStrings = br.readLine().split(" ");

        // Does not work on Stepik :(
        // List<Integer> inputNumbersList = Arrays.stream(br.readLine().split("
        // ")).map(Integer::parseInt)
        // .collect(Collectors.toList());

        List<Integer> inputNumbersList = new ArrayList<Integer>() {
            {
                for (String str : inputNumbersStrings) {
                    add(Integer.parseInt(str));
                }
            }
        };

        System.out.println(max_rec(inputNumbersList));
    }
}