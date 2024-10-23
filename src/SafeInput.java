import java.util.Scanner;
public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You said your favorite integer was: " + trash);
                System.out.println("Input a valid integer.");
            }
        } while (!done);
        return retInt;
    }
    public static Double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0.00;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You said your favorite number was: " + trash);
                System.out.println("Input a valid number.");
            }
        } while (!done);


        return retDouble;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retRangedInt = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retRangedInt = pipe.nextInt();
                if ( retRangedInt >= low && retRangedInt <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You said your favorite integer was: " + retRangedInt);
                    System.out.println("Input a valid integer." + " [" + low + "-" + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You said your favorite integer was: " + trash);
                System.out.println("Input a valid integer." + " [" + low + "-" + high + "]");
            }
        } while (!done);


        return retRangedInt;
    }

}
