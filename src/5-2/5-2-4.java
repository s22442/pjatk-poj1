import java.io.*;
import java.util.HashSet;
import java.util.Set;

class App524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aInputStrings = br.readLine().split(" ");
        String[] bInputStrings = br.readLine().split(" ");

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        for (String str : aInputStrings) {
            aSet.add(Integer.parseInt(str));
        }
        for (String str : bInputStrings) {
            bSet.add(Integer.parseInt(str));
        }

        Set<Integer> resultSet = new HashSet<>();

        for (Integer i : aSet) {
            if (!bSet.contains(i)) {
                resultSet.add(i);
            }
        }

        for (Integer i : bSet) {
            if (!aSet.contains(i)) {
                resultSet.add(i);
            }
        }

        System.out.println(resultSet);
    }
}
