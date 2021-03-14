import java.io.*;

class App1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = -1;
        while (n < 0) {
            n = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }
    }
}