import java.io.*;
import java.util.Scanner;

class App1212 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());

        if (m <= 0 || n <= 0) {
            System.out.println("BŁĄD");
            scanner.close();
            return;
        }

        int[] mArray, nArray;
        mArray = new int[m];
        nArray = new int[n];

        for (int i = 0; i < m; i++) {
            mArray[i] = Integer.parseInt(scanner.next());
        }
        for (int i = 0; i < n; i++) {
            nArray[i] = Integer.parseInt(scanner.next());
        }

        scanner.close();

        int result = 0;
        int minLength = Math.min(m, n);
        for (int i = 0; i < minLength; i++) {
            result += mArray[i] * nArray[i];
        }

        System.out.println(result);
    }
}