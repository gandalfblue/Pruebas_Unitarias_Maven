package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

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

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.addition(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void division() {
    }

    @Test
    void returnNumberJoined() {
    }
}