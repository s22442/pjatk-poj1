import java.io.*;
import java.util.Scanner;

class App626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj nazwę pliku:");
        File file = new File(br.readLine());

        if (!file.exists()) {
            System.out.printf("Plik %s nie istnieje%n", file.getName());
            return;
        }

        PrintWriter output = new PrintWriter(file.getName() + ".dat");
        Scanner input = new Scanner(file).useDelimiter("(\\b|\\B)");
        while (input.hasNext()) {
            char c = input.next().charAt(0);
            output.print(String.format("%8s", Integer.toBinaryString(c)).replaceAll(" ", "0"));
        }
        output.close();
        input.close();
    }
}
