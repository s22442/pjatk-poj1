import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int salary;
    private String currency;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, String email, int salary, String currency) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.currency = currency;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toString() {
        return String.format("Employee{id=%s, firstName=%s, lastName=%s, email=%s, salary=%d, currency=%s}", this.id,
                this.firstName, this.lastName, this.email, this.salary, this.currency);
    }

}

class App628 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.csv");
        if (!file.exists()) {
            System.out.printf("Plik %s nie istnieje%n", file.getName());
            return;
        }

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner input = new Scanner(file);
        input.nextLine(); // Discard header line
        while (input.hasNext()) {
            String[] employeeArgs = input.nextLine().split(",");
            employees.add(new Employee(employeeArgs[0], employeeArgs[1], employeeArgs[2], employeeArgs[3],
                    Integer.parseInt(employeeArgs[4]), employeeArgs[5]));
        }
        input.close();

        Map<String, Integer> currencyFrequency = new TreeMap<>();
        int comEmailCount = 0;
        for (Employee employee : employees) {
            String employeeCurrency = employee.getCurrency();
            currencyFrequency.put(employeeCurrency,
                    currencyFrequency.containsKey(employeeCurrency) ? currencyFrequency.get(employeeCurrency) + 1 : 1);

            String email = employee.getEmail();
            String emailEnd = email.substring(email.length() - 4);
            if (emailEnd.contains(".com")) {
                comEmailCount++;
            }
        }

        System.out.println("Zestawienie ile osób zarabia w danej walucie:");
        for (Map.Entry<String, Integer> entry : currencyFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.printf("Liczba osób mających email, gdzie na końcu jest .com: %d%n", comEmailCount);
    }
}
