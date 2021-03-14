import java.io.*;

class App123 {
    public static void main(String[] args) throws IOException {
        double a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // System.out.print("Podaj bok a: ");
        a = Double.parseDouble(br.readLine());

        // System.out.print("Podaj bok b: ");
        b = Double.parseDouble(br.readLine());

        // System.out.println("Pole prostokąta: " + (a * b));
        System.out.println(a * b);
    }
}