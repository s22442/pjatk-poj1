
class TestScores {
    private double[] testScores;

    public TestScores(double... testScores) {
        for (double score : testScores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Test score out of range");
            }
        }

        this.testScores = testScores;
    }

    public double average() {
        // Does not work on Stepik :(
        // return DoubleStream.of(this.testScores).average().getAsDouble();

        double sum = 0;
        for (double score : this.testScores) {
            sum += score;
        }
        return sum / this.testScores.length;
    }

    public static void main(String[] args) {
        final double[] CORRECT_TEST_SCORES_1 = { 1, 2, 3, 4, 5, 6, 10, 20, 30, 40, 50, 60 };
        final double[] CORRECT_TEST_SCORES_2 = { 99, 0, 100, 51, 1 };
        final double[] INCORRECT_TEST_SCORES_1 = { 123, 0, 100, 51 };
        final double[] INCORRECT_TEST_SCORES_2 = { 0, 0, 12, 13, -1 };

        try {
            TestScores testScores = new TestScores(CORRECT_TEST_SCORES_1);
            System.out.println(testScores.average());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            TestScores testScores = new TestScores(CORRECT_TEST_SCORES_2);
            System.out.println(testScores.average());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            TestScores testScores = new TestScores(INCORRECT_TEST_SCORES_1);
            System.out.println(testScores.average());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            TestScores testScores = new TestScores(INCORRECT_TEST_SCORES_2);
            System.out.println(testScores.average());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // OUTPUT:
        // 19.25
        // 50.2
        // Test score out of range
        // Test score out of range
    }
}
