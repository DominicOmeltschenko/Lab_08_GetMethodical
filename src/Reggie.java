import java.util.Scanner;
public class Reggie {

    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);
        String socialSecurityNumber = "";
        String mNumber = "";
        String menuChoice = "";

        socialSecurityNumber = SafeInput.getRegExString(pipe, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$" );
        mNumber = SafeInput.getRegExString(pipe, "Enter your UC M number", "^(M|m)\\d{5}$" );
        menuChoice = SafeInput.getRegExString(pipe, "Enter your menu choice Open,Save,View,Quit", "^[OoSsVvQq]$" );



        System.out.println("Your social security number is: " + socialSecurityNumber);
        System.out.println("Your UC M number is: " + mNumber);
        System.out.println("Your menu choice is: " + menuChoice);

    }

}
