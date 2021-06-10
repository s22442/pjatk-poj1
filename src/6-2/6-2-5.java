import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class App625 {
    public static void main(String[] args) throws IOException {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku:");
        File file = new File(consoleInput.nextLine());
        if (!file.exists()) {
            System.out.printf("Plik %s nie istnieje%n", file.getName());
            consoleInput.close();
            return;
        }

        ArrayList<String> fileLines = new ArrayList<>();
        Scanner fileInput = new Scanner(file);
        while (fileInput.hasNext()) {
            fileLines.add(fileInput.nextLine());
        }
        int fileLinesLength = fileLines.size();
        fileInput.close();

        System.out.println("Podaj liczbę ostatnich linii pliku do wyświetlenia:");
        int amountOfLinesToPrint = consoleInput.nextInt();
        consoleInput.close();
        if (amountOfLinesToPrint > fileLinesLength) {
            System.out.printf("Plik %s zawiera jedynie %d linii tekstu. Wyświetlone zostaną wszystkie%n",
                    file.getName(), fileLinesLength);
            amountOfLinesToPrint = fileLinesLength;
        }

        for (int i = fileLinesLength - amountOfLinesToPrint; i < fileLinesLength; i++) {
            System.out.println(fileLines.get(i));
        }
    }
}
