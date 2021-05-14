package pjatk;

public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;

    public CourseGrades() {
    }

    public CourseGrades(GradedActivity... grades) {
        this.grades = grades;
    }

    public void setGrades(GradedActivity... grades) {
        this.grades = grades;
    }

    public GradedActivity[] getGrades() {
        return this.grades;
    }

    public double getAverage() {
        double sum = 0;
        for (GradedActivity grade : this.grades) {
            sum += grade.getScore();
        }
        return sum / this.grades.length;
    }

    public GradedActivity getHighest() {
        int indexOfHighest = 0;
        double highest = this.grades[0].getScore();

        int index = 0;
        for (GradedActivity grade : this.grades) {
            final double score = grade.getScore();
            if (score > highest) {
                highest = score;
                indexOfHighest = index;
            }

            index++;
        }

        return this.grades[indexOfHighest];
    }

    public GradedActivity getLowest() {
        int indexOfLowest = 0;
        double lowest = this.grades[0].getScore();

        int index = 0;
        for (GradedActivity grade : this.grades) {
            final double score = grade.getScore();
            if (score < lowest) {
                lowest = score;
                indexOfLowest = index;
            }

            index++;
        }

        return this.grades[indexOfLowest];
    }
}
