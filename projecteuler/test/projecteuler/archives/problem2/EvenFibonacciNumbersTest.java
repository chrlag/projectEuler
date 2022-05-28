package projecteuler.archives.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenFibonacciNumbersTest {

    @Test
    void calculateEvenSum_limitIs89_outputIs44() {
        // Arrange
        EvenFibonacciNumbers target = createTarget(89);
        double evenSum;

        // Act
        evenSum = target.calculateEvenSum();

        // Assert
        assertEquals(44, evenSum);
    }

    @Test
    void calculateEvenSum_limitIs89_outputIsxx() {
        // Arrange
        EvenFibonacciNumbers target = createTarget(4_000_000);
        double evenSum;

        // Act
        evenSum = target.calculateEvenSum();

        // Assert
        assertEquals(4613732, evenSum);
    }

    private EvenFibonacciNumbers createTarget(double limit) {
        return new EvenFibonacciNumbers(limit);
    }

}