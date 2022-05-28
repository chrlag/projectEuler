package projecteuler.archives.problem1;

public class MultiplesOfThreeAndFive {

    private final int number;

    public MultiplesOfThreeAndFive(int number) {
        this.number = number;
    }

    public double returnSum() {
        if (number < 0) {
            return -1;
        }

        double sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum +=  i;
            }
        }

        return sum;
    }
}
