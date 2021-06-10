import java.io.*;
import java.util.Scanner;

class App623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int newlinesCount = 0;
        int lettersCount = 0;
        int numbersCount = 0;
        int whitespacesCount = 0;

        System.out.println("Podaj nazwę pliku:");
        String fileName = br.readLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.printf("Plik %s nie istnieje%n", fileName);
            return;
        }

        String str = "";
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            whitespacesCount++;
            newlinesCount++;
            str += scanner.nextLine();
        }
        scanner.close();

        whitespacesCount += str.length() - str.replace(" ", "").length();
        str = str.replace(" ", "");

        numbersCount = str.length() - str.replaceAll("\\d+", "").length();
        str = str.replaceAll("\\d+", "");

        lettersCount = str.length();

        System.out.printf("Ilość linii: %d%n", newlinesCount);
        System.out.printf("Ilość liter: %d%n", lettersCount);
        System.out.printf("Ilość cyfr: %d%n", numbersCount);
        System.out.printf("Ilość białych znaków: %d%n", whitespacesCount);
    }
}
