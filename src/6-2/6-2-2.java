import java.io.*;

class App622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj nazwę pliku:");
        String fileName = br.readLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.printf("Plik %s istnieje i zostanie nadpisany%n", fileName);
        } else {
            System.out.printf("Plik %s nie istnieje i zostanie utworzony%n", fileName);
        }

        System.out.println("Napisz coś:");
        String str = br.readLine();

        PrintWriter output = new PrintWriter(fileName);
        output.println(str);
        output.close();
    }
}
