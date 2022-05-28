package projecteuler.archives.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesOfThreeAndFiveTest {

    @Test
    void returnSum_inputIs10_outputIs23() {
        // Arrange
        MultiplesOfThreeAndFive target = createTarget(10);
        double sum;

        // Act
        sum = target.returnSum();

        // Assert
        assertEquals(23, sum);
    }

    @Test
    void returnSum_inputIs1000_outputIs233168() {
        // Arrange
        MultiplesOfThreeAndFive target = createTarget(1000);
        double sum;

        // Act
        sum = target.returnSum();

        // Assert
        assertEquals(233168, sum);
    }

    @Test
    void returnSum_inputIsNegative_outputIsMinus1() {
        // Arrange
        MultiplesOfThreeAndFive target = createTarget(-1);
        double sum;

        // Act
        sum = target.returnSum();

        // Assert
        assertEquals(-1, sum);
    }

    private MultiplesOfThreeAndFive createTarget(int number) {
        return new MultiplesOfThreeAndFive(number);
    }
}