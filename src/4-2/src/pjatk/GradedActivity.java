package pjatk;

// Original code: https://stepik.org/lesson/502160/step/4?unit=493859
// Changes:
// - added contructor
// - added toString()
// - cleaned getGrade()

public class GradedActivity {
    private double score;

    public GradedActivity(double score) {
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    public char getGrade() {
        if (score >= 90)
            return '5';
        else if (score >= 80)
            return '4';
        else if (score >= 70)
            return '3';
        else if (score >= 60)
            return '2';
        else
            return '1';
    }

    public String toString() {
        return String.format("GradedActivity{score=%.2f}", this.score);
    }
}
