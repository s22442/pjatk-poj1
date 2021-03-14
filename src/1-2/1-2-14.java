import java.io.*;

class App1214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] array = br.readLine().toCharArray();

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                System.out.println("NIE");
                return;
            }
        }

        System.out.println("TAK");
    }
}