import java.io.*;

class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;
    private int attendance;
    private int pojGrade;

    public Student(String firstName, String lastName, int indexNumber, int attendance, int pojGrade) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setIndexNumber(indexNumber);
        this.setAttendance(attendance);
        this.setPojGrade(pojGrade);
    }

    public Student(int indexNumber, int attendance, int pojGrade) {
        this.setFirstName("Unknown");
        this.setLastName("Unknown");
        this.setIndexNumber(indexNumber);
        this.setAttendance(attendance);
        this.setPojGrade(pojGrade);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setPojGrade(int pojGrade) {
        this.pojGrade = this.attendance >= 50 ? pojGrade : 2;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public int getAttendance() {
        return this.attendance;
    }

    public int getPojGrade() {
        return this.pojGrade;
    }

    public String toString() {
        return String.format(
                "First name: %s%n" + "Last name: %s%n" + "Index number: %d%n" + "Attendance: %d%%%n" + "POJ grade: %d",
                this.firstName, this.lastName, this.indexNumber, this.attendance, this.pojGrade);
    }
}

class StudentTest {
    public static void main(String[] args) throws IOException {
        Student goodStudent = new Student("Jan", "Kowalski", 90511, 90, 5);
        Student badStudent = new Student("Jan", "Niekowalski", 90211, 90, 2);
        Student absentStudent = new Student("Jan", "Bezkowalski", 49511, 49, 5);
        Student unknownStudent = new Student(90500, 90, 5);

        System.out.println(goodStudent.toString() + "\n");
        System.out.println(badStudent.toString() + "\n");
        System.out.println(absentStudent.toString() + "\n");
        System.out.println(unknownStudent.toString() + "\n");
    }
}
