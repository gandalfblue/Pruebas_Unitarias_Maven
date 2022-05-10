package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalculator {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long addition(Long number1, Long number2) {
        logger.info( "Addition {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long subtract(Long number1, Long number2) {
        logger.info( "Subtraction {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multiplication {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) {
        Boolean numbers = isaBoolean(number1, number2);
        if (numbers) {
            logger.info("No se puede dividir los numeros {} y {}, porque da 0 como resultado", number1, number2);
            return 0L;
        }
        logger.info( "Division {} / {}", number1, number2 );
        return number1 / number2;
    }

    private boolean isaBoolean(Long number1, Long number2) {
        return number1 == 0 || number2 == 0;
    }

    public Long returnNumberJoined(Integer contador) throws IOException {
        System.out.println("Enter number " + contador + ":");
        String textNumber = bufferedReader.readLine();
        Long number = Long.valueOf(textNumber);
        return number;
    }

}
