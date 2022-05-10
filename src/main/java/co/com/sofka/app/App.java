package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BasicCalculator calculator = new BasicCalculator();

        Boolean operacion = true;

        while (operacion) {

            System.out.println("******Bienvenido a la calculadora de Sofka******");
            System.out.println("******1. Addition******");
            System.out.println("******2. Subtraction******");
            System.out.println("******3. Multiplication******");
            System.out.println("******4. Division******");
            System.out.println("******5. Salir******");
            System.out.println("******Escoja un numero para la operación que desea realizar******");

            String opcion = bufferedReader.readLine();
            Integer numberOpcion = Integer.valueOf(opcion);
            Integer contador = 1;

            switch (numberOpcion) {

                case 1:
                    Long numberadd1 = calculator.returnNumberJoined(contador);
                    contador++;
                    Long numberadd2 = calculator.returnNumberJoined(contador);
                    Long resultAdd = calculator.addition(numberadd1, numberadd2);
                    System.out.println(numberadd1 + " + " + numberadd2 + " = " + resultAdd);
                    System.out.println("");
                    contador--;
                    break;
                case 2:
                    Long numberSub1 = calculator.returnNumberJoined(contador);
                    contador++;
                    Long numberSub2 = calculator.returnNumberJoined(contador);
                    Long resultSub = calculator.subtract(numberSub1, numberSub2);
                    System.out.println(numberSub1 + " - " + numberSub2 + " = " + resultSub);
                    System.out.println("");
                    contador--;
                    break;
                case 3:
                    Long numberMulti1 = calculator.returnNumberJoined(contador);
                    contador++;
                    Long numberMulti2 = calculator.returnNumberJoined(contador);
                    Long resultMulti = calculator.multiply(numberMulti1, numberMulti2);
                    System.out.println(numberMulti1 + " * " + numberMulti2 + " = " + resultMulti);
                    System.out.println("");
                    contador--;
                    break;
                case 4:
                    Long numberDivi1 = calculator.returnNumberJoined(contador);
                    contador++;
                    Long numberDivi2 = calculator.returnNumberJoined(contador);
                    Long resultDivi = calculator.division(numberDivi1, numberDivi2);
                    System.out.println(numberDivi1 + " / " + numberDivi2 + " = " + resultDivi);
                    System.out.println("");
                    contador--;
                    break;
                case 5:
                    System.out.println("Vuelva pronto");
                    operacion = false;
                    break;
                default:
                    System.out.println("Ingreso un valor diferente al solicitado");
                    break;
            }
        }
    }
}
