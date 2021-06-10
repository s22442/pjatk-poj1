import java.io.*;

class App627 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj nazwę pliku:");
        File file = new File(br.readLine());

        if (!file.exists()) {
            System.out.printf("Plik %s nie istnieje%n", file.getName());
            return;
        }

        System.out.printf("Rozmiar w bajtach: %d%n", file.length());
    }
}
