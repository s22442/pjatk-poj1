import java.io.*;

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            return;
        }

        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            return;
        }

        this.month = month;
    }

    public void setYear(int year) {
        if (year < 1990 || year > 2050) {
            return;
        }

        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void displayDate() {
        if (this.day == 0 || this.month == 0 || this.year == 0) {
            System.out.println("The date is invalid");
        } else {
            System.out.printf("%02d/%02d/%02d%n", this.day, this.month, this.year);
        }
    }
}

class MyDateTest {
    public static void main(String[] args) throws IOException {
        MyDate validDate1 = new MyDate(1, 10, 1991);
        MyDate validDate2 = new MyDate(30, 3, 2021);
        MyDate invalidDate1 = new MyDate(32, 1, 1999);
        MyDate invalidDate2 = new MyDate(3, 5, 2051);

        validDate1.displayDate();
        validDate2.displayDate();
        invalidDate1.displayDate();
        invalidDate2.displayDate();
    }
}