import java.io.*;

class App621 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj nazwę pliku:");
        String fileName = br.readLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.printf("Plik %s istnieje%n", fileName);
        } else {
            System.out.printf("Plik %s nie istnieje%n", fileName);
        }
    }
}
