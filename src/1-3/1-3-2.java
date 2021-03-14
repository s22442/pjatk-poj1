import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class App132 {
    private static final int EARTH_YEAR_SECONDS = 31557600;

    private static final Map<String, Double> PLANET_YEARS_MULTIPLIERS = new HashMap<>() {
        {
            put("Merkury", 0.2408467);
            put("Wenus", 0.61519726);
            put("Mars", 1.8808158);
            put("Ziemia", 1.);
            put("Jowisz", 11.862615);
            put("Saturn", 29.447498);
            put("Uran", 84.016846);
            put("Neptun", 164.79132);
        }
    };

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double inputSeconds = Double.parseDouble(scanner.next());
        String inputPlanet = scanner.next();

        scanner.close();

        if (!PLANET_YEARS_MULTIPLIERS.containsKey(inputPlanet)) {
            System.out.println("BŁĄD: Nieznana planeta");
            return;
        }

        System.out.printf("%.2f", inputSeconds / (EARTH_YEAR_SECONDS * PLANET_YEARS_MULTIPLIERS.get(inputPlanet)));
    }
}