import java.io.*;
import java.util.Scanner;

class App1215 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("BŁĄD");
            scanner.close();
            return;
        }

        int[][] array, arrayT;
        array = new int[a][b];
        arrayT = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                try {
                    array[i][j] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("BŁĄD");
                    scanner.close();
                    return;
                }

            }
        }

        scanner.close();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arrayT[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < b; i++) {
            System.out.printf("%d", arrayT[i][0]);
            for (int j = 1; j < a; j++) {
                System.out.printf(" %d", arrayT[i][j]);
            }
            System.out.printf("%n");
        }
    }
}