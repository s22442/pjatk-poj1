
class App5210 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Argument nie może być wartością ujemną");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}