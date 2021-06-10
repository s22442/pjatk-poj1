import java.io.*;
import java.util.Scanner;

class App624 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj nazwę pliku 1:");
        String file1Name = br.readLine();
        File file1 = new File(file1Name);

        System.out.println("Podaj nazwę pliku 2:");
        String file2Name = br.readLine();
        File file2 = new File(file2Name);

        if (!file1.exists()) {
            System.out.printf("Plik %s nie istnieje%n", file1Name);
            return;
        }
        if (!file2.exists()) {
            System.out.printf("Plik %s nie istnieje%n", file2Name);
            return;
        }

        FileWriter writer = new FileWriter(file2Name, true);
        PrintWriter output = new PrintWriter(writer);
        Scanner input = new Scanner(file1);
        while (input.hasNext()) {
            output.println(input.nextLine());
        }
        output.close();
        input.close();
    }
}
