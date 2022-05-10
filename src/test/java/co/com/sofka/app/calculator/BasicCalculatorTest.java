package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Testing sum: 1+1=2")
    void addition() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.addition(number1, number2);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several addition")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalAddition(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.addition(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    void subtract() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 1L;
        Long expectedValue = 4L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtract")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "2,    1,   1",
            "6,    5,   1",
            "40,  20,  20",
            "100,  100, 0"
    })
    public void severalSubtract(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);

    }

    @Test
    void multiply() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 5L;
        Long expectedValue = 25L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiply")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "1,    2,   2",
            "4,    5,   20",
            "10,  20,  200",
            "100,  100, 10000"
    })
    public void severalMultiply(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);

    }

    @Test
    void division() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 2L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several division")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "4,    2,   2",
            "100,    5,   20",
            "100,  10,  10",
            "100,  100, 1"
    })
    public void severalDivision(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);

    }
}