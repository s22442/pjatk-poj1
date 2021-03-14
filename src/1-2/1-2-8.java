import java.io.*;

class App128 {
    public static String getMonthOutput(int number) {
        switch (number) {
        case 1:
            return "Styczeń: 31 dni";
        case 2:
            return "Luty: 28 dni";
        case 3:
            return "Marzec: 31 dni";
        case 4:
            return "Kwiecień: 30 dni";
        case 5:
            return "Maj: 31 dni";
        case 6:
            return "Czerwiec: 30 dni";
        case 7:
            return "Lipiec: 31 dni";
        case 8:
            return "Sierpień: 31 dni";
        case 9:
            return "Wrzesień: 30 dni";
        case 10:
            return "Październik: 31 dni";
        case 11:
            return "Listopad: 30 dni";
        case 12:
            return "Grudzień: 31 dni";
        default:
            return "BŁĄD";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;

        number = Integer.parseInt(br.readLine());

        System.out.println(getMonthOutput(number));
    }
}