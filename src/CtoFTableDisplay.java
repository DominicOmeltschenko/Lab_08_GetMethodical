import java.util.Scanner;
public class CtoFTableDisplay {



    public static void main(String[] args) {

        ;
        System.out.printf("Celsius  |  Fahrenheit%n");

        for (double celsiusTemp = -100.00; celsiusTemp <= 100.00; celsiusTemp++) {

            double fahrenheitTemp = CtoF(celsiusTemp);
            System.out.printf("%7.2f  | %9.2f%n", celsiusTemp, fahrenheitTemp);

        }



    }
    public static double CtoF(double Celsius)
    {
        double fahrenheitTemp = 0.00;
        double CONSTANT = 1.8;
        String trash = "";
        fahrenheitTemp = (Celsius * CONSTANT) + 32;
        return fahrenheitTemp;
    }




}
