public class NegativeNumberArgumentException extends Exception {
    public NegativeNumberArgumentException() {
        super("Do metody została przekazana liczba ujemna");
    }

    public NegativeNumberArgumentException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new NegativeNumberArgumentException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new NegativeNumberArgumentException("Test wyjątku");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // OUTPUT:
        // Do metody została przekazana liczba ujemna
        // Test wyjątku
    }
}
