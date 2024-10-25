import java.util.Scanner;

public class CheckOut {


        public static void main(String[] args)
        {
            Scanner pipe = new Scanner(System.in);
            double total = 0.00;
            double current = 0.00;
            double low = 0.50;
            double high = 10.00;

            do {

                current = SafeInput.getRangedDouble(pipe, "Enter the price of your item " + " [" + low + "-" + high + "]", low, high);

                total = total + current;

            }while (SafeInput.getYNConfirm(pipe, "Would you like to add another item"));

            System.out.printf("The total of all of your item is: %.2f%n", total);


        }
}
