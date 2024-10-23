import java.util.Scanner;
public class DevTest {


    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
        {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
            retInt = pipe.nextInt();
            done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You said your favorite integer was: " + trash);
                System.out.println("Input a valid integer.");
            }
        } while (!done);


        return retInt;
    }

   /* public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String yourState = "";
        yourState = getNonZeroLenString(pipe, "Enter the state you live in");
        System.out.println(" \nYou currently live in: " + yourState);
    }
    */
   public static void main(String[] args) {
       Scanner pipe = new Scanner(System.in);
       int yourNumber = 0;
       yourNumber = getInt(pipe, "Enter your favorite integer");
       System.out.println(" \nYour favorite integer is: " + yourNumber );
   }
}
