import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int yourInteger = 0;
        double yourNumber = 0.0;
        yourInteger = SafeInput.getInt(pipe, "Enter your favorite integer");
        yourNumber = SafeInput.getDouble(pipe, "Enter your favorite number");
        System.out.println(" \nYour favorite integer is: " + yourInteger );
        System.out.println(" \nYour favorite number is: " + yourNumber );

    }
}
