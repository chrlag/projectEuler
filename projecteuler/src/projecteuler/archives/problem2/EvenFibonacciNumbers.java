package projecteuler.archives.problem2;

public class EvenFibonacciNumbers {

    private static final int FIRST_TERM = 1;
    private static final int SECOND_TERM = 2;

    private final double limit;

    private double currentFibonacciTerm;
    private double previousFibonacciTerm;
    private double evenSum;

    public EvenFibonacciNumbers(double limit) {
        this.currentFibonacciTerm = SECOND_TERM;
        this.previousFibonacciTerm = FIRST_TERM;
        this.evenSum = 0;
        this.limit = limit;
    }

    public double calculateEvenSum() {
        while (currentFibonacciTerm <= limit) {
            if (currentFibonacciTerm % 2 == 0) {
                evenSum += currentFibonacciTerm;
            }

            double tempNumber = currentFibonacciTerm;
            currentFibonacciTerm += previousFibonacciTerm;
            previousFibonacciTerm = tempNumber;
        }

        return evenSum;
    }
}
