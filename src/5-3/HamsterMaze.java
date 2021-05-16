import java.util.*;

class Hamster {
    private int hamsterNumber;

    // Dodaj pole typu String do klasy Hamster, zawierające imię gryzonia.
    private String hamsterName;

    public Hamster() {
        this.hamsterNumber = new Random().nextInt(11);
    }

    public Hamster(int hamsterNumber) {
        this.hamsterNumber = hamsterNumber;
    }

    public Hamster(String hamsterName) {
        this();
        this.hamsterName = hamsterName;
    }

    public Hamster(int hamsterNumber, String hamsterName) {
        this.hamsterNumber = hamsterNumber;
        this.hamsterName = hamsterName;
    }

    public int getHamsterNumber() {
        return this.hamsterNumber;
    }

    public String hamsterNumber() {
        return "This is Hamster #" + this.hamsterNumber;
    }

    public String toString() {
        return String.format("Hamster{hamsterNumber=%d, hamsterName=\"%s\"}", this.hamsterNumber, this.hamsterName);
    }
}

class Printer {
    // Uzupełnij metodę printAll wyświetlającą dane o przechowywanych obiektach.
    static void printAll(List<Hamster> hamsterList) {
        // Zmień kod z poprzedniego zadania tak, aby pobierać zawartość listy za pomocą
        // iteratorów.
        // for (Hamster hamster : hamsterList) {
        // System.out.println(hamster);
        // }

        Iterator<Hamster> hamsterIterator = hamsterList.iterator();
        while (hamsterIterator.hasNext()) {
            System.out.println(hamsterIterator.next());
        }
    }

    // Program w metodzie main po wywołaniu printAll ma przeglądać odwzorowanie dla
    // każdego klucza (korzystając z metody keySet()).
    static void printAll(Map<String, Hamster> hamsterMap) {
        for (String hamsterName : hamsterMap.keySet()) {
            System.out.printf("\"%s\"=%s%n", hamsterName, hamsterMap.get(hamsterName));
        }
    }
}

class HamsterNumberComparator implements Comparator<Hamster> {
    @Override
    public int compare(Hamster h1, Hamster h2) {
        return h1.getHamsterNumber() - h2.getHamsterNumber();
    }
}

public class HamsterMaze {
    public static void updateHamsterMap(Map<String, Hamster> hamsterMap, String hamsterLine) {
        ArrayList<String> hamsterArgs = new ArrayList<>(Arrays.asList(hamsterLine.split(" ")));

        int hamsterNumber;
        try {
            hamsterNumber = Integer.parseInt(hamsterArgs.remove(0));
        } catch (Exception e) {
            throw new IllegalArgumentException("Hamster number is NaN");
        }

        if (hamsterNumber < 0) {
            throw new IllegalArgumentException("Hamster number is less than 0");
        }

        // Does not work on Stepik (ancient egyptian Java version)
        // String hamsterName = String.join(" ", hamsterArgs);
        String hamsterName = "";
        int argIndex = 0;
        for (String arg : hamsterArgs) {
            hamsterName += arg;
            if (argIndex < hamsterArgs.size() - 1) {
                hamsterName += " ";
            }
            argIndex++;
        }

        hamsterMap.put(hamsterName, new Hamster(hamsterNumber, hamsterName));
    }

    // Stwórz metodę usuwającą element z listy za pomocą iteratora do poprzedniego
    // zadania.
    public static <E> void removeFromListViaIterator(List<E> list, E targetElement) {
        Iterator<E> listIterator = list.iterator();
        int targetIndex = 0;
        while (listIterator.hasNext()) {
            if (listIterator.next() == targetElement) {
                list.remove(targetIndex);
                break;
            }
            targetIndex++;
        }
    }

    public static void main(String[] args) {
        List<Hamster> hamsterList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            hamsterList.add(new Hamster(i));
        }

        // Remove Hamster{hamsterNumber=1, hamsterName="null"}
        removeFromListViaIterator(hamsterList, hamsterList.get(1));

        Printer.printAll(hamsterList);

        // W klasie HamsterMaze stwórz odwzorowanie Map, kojarząc imię gryzonia jako
        // klucz, a sam obiekt jako wartość.
        Map<String, Hamster> hamsterMap = new TreeMap<>();

        // W metodzie main klasy HamsterMaze powinno dokonywać się pobieranie danych
        // (identyfikator oraz imię), które będzie zapisywane w odwzorowaniu Map. W
        // przypadku nieprawidłowych danych (identyfikator ujemny lub jako ciąg
        // tekstowy) program powinien przechwycić wyjątek i ponownie wczytać dane.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hamster number and name separated by a space in a single line");
        System.out.println("Enter an empty line to stop collecting hamsters");
        while (scanner.hasNextLine()) {
            String hamsterLine = scanner.nextLine();

            if (hamsterLine.isEmpty()) {
                break;
            }

            try {
                updateHamsterMap(hamsterMap, hamsterLine);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();

        Printer.printAll(hamsterMap);

        // Zmień kod klasy Hamster z poprzedniego zadania w ten sposób aby wartość pola
        // hamsterNumber była inicjalizowana losową wartością z przedziału [0,10].
        // Utwórz kolekcję typu List 20 obiektów klasy Hamster. Wypisz kolekcję na
        // ekran, sortując je według pola hamsterNumber.
        List<Hamster> yetAnotherHamsterList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            yetAnotherHamsterList.add(new Hamster());
        }
        // Zaimplementuj w klasie Hamster interfejs Comparable<Hamster>. Następnie
        // korzystając z tego interfejsu posortuj listę za pomocą metody sort z klasy
        // Collections.
        Collections.sort(yetAnotherHamsterList, new HamsterNumberComparator());

        Printer.printAll(yetAnotherHamsterList);

        // TEST INPUT:
        // 123 Example hamster name
        // someJuicyNaN Dead hamster
        // -1 Negative hamster
        // 1 Hamster in Pain
        // 2 Hamster From Below
        //
        // (EXAMPLE) TEST OUTPUT:
        // Hamster{hamsterNumber=0, hamsterName="null"}
        // Hamster{hamsterNumber=2, hamsterName="null"}
        // Enter hamster number and name separated by a space in a single line
        // Enter an empty line to stop collecting hamsters
        // Hamster number is NaN
        // Hamster number is less than 0
        // "Example hamster name"=Hamster{hamsterNumber=123, hamsterName="Example hamster name"}
        // "Hamster From Below"=Hamster{hamsterNumber=2, hamsterName="Hamster From Below"}
        // "Hamster in Pain"=Hamster{hamsterNumber=1, hamsterName="Hamster in Pain"}
        // Hamster{hamsterNumber=1, hamsterName="null"}
        // Hamster{hamsterNumber=1, hamsterName="null"}
        // Hamster{hamsterNumber=2, hamsterName="null"}
        // Hamster{hamsterNumber=3, hamsterName="null"}
        // Hamster{hamsterNumber=3, hamsterName="null"}
        // Hamster{hamsterNumber=3, hamsterName="null"}
        // Hamster{hamsterNumber=4, hamsterName="null"}
        // Hamster{hamsterNumber=4, hamsterName="null"}
        // Hamster{hamsterNumber=4, hamsterName="null"}
        // Hamster{hamsterNumber=4, hamsterName="null"}
        // Hamster{hamsterNumber=6, hamsterName="null"}
        // Hamster{hamsterNumber=7, hamsterName="null"}
        // Hamster{hamsterNumber=7, hamsterName="null"}
        // Hamster{hamsterNumber=8, hamsterName="null"}
        // Hamster{hamsterNumber=9, hamsterName="null"}
        // Hamster{hamsterNumber=10, hamsterName="null"}
        // Hamster{hamsterNumber=10, hamsterName="null"}
    }
}