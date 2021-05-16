import java.io.*;

class App529 {
    public static <E> int findIndex(E[] array, E targetElement) throws Exception {
        int index = 0;
        for (E element : array) {
            if (element == targetElement) {
                break;
            }

            index++;
        }

        if (index == array.length) {
            throw new Exception("Elementu nie znaleziono.");
        }

        return index;
    }

    public static <E> String arrayToString(E[] array) {
        String str = "[";

        int index = 0;
        for (E element : array) {
            str += String.valueOf(element);

            if (index < array.length - 1) {
                str += ", ";
            }

            index++;
        }

        str += "]";

        return str;
    }

    public static void main(String[] args) throws IOException {
        final String[] strArray = { "Ala", "ma", "kota" };
        final Integer[] intArray = { 1, 2, 3, 123, 3, 2, 1 };

        final String strTarget1 = "Ala";
        final String strTarget2 = "ma";
        final String strTarget3 = "kota";
        final String strTarget4 = "psa";
        final Integer intTarget1 = 123;
        final Integer intTarget2 = 2;
        final Integer intTarget3 = 0;

        try {
            System.out.printf("Index of '%s' in %s: %d%n", strTarget1, arrayToString(strArray),
                    findIndex(strArray, strTarget1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Index of '%s' in %s: %d%n", strTarget2, arrayToString(strArray),
                    findIndex(strArray, strTarget2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Index of '%s' in %s: %d%n", strTarget3, arrayToString(strArray),
                    findIndex(strArray, strTarget3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Index of '%s' in %s: %d%n", strTarget4, arrayToString(strArray),
                    findIndex(strArray, strTarget4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Index of '%s' in %s: %d%n", intTarget1, arrayToString(intArray),
                    findIndex(intArray, intTarget1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Index of '%s' in %s: %d%n", intTarget2, arrayToString(intArray),
                    findIndex(intArray, intTarget2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Index of '%s' in %s: %d%n", intTarget3, arrayToString(intArray),
                    findIndex(intArray, intTarget3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // OUTPUT:
        // Index of 'Ala' in [Ala, ma, kota]: 0
        // Index of 'ma' in [Ala, ma, kota]: 1
        // Index of 'kota' in [Ala, ma, kota]: 2
        // Elementu nie znaleziono.
        // Index of '123' in [1, 2, 3, 123, 3, 2, 1]: 3
        // Index of '2' in [1, 2, 3, 123, 3, 2, 1]: 1
        // Elementu nie znaleziono.
    }
}