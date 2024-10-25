import java.util.Objects;
import java.util.Scanner;
public class DevTest {



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

            pipe.nextLine();

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

            pipe.nextLine();

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
                    if (retRangedInt >= low && retRangedInt <= high)
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println("You said your favorite integer was: " + retRangedInt);
                        System.out.println("Input a valid integer." + " [" + low + "-" + high + "]");
                        pipe.nextLine();
                    }

                }
                else
                {
                    trash = pipe.nextLine();
                    System.out.println("You said your favorite integer was: " + trash);
                    System.out.println("Input a valid integer." + " [" + low + "-" + high + "]");
                }
            } while (!done);

            pipe.nextLine();

            return retRangedInt;
        }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retRangedDouble = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retRangedDouble = pipe.nextDouble();
                if ( retRangedDouble >= low && retRangedDouble <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You said your favorite number was: " + retRangedDouble);
                    System.out.println("Input a valid number." + " [" + low + "-" + high + "]");
                    pipe.nextLine();
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You said your favorite number was: " + trash);
                System.out.println("Input a valid number." + " [" + low + "-" + high + "]");
            }
        } while (!done);

        pipe.nextLine();

        return retRangedDouble;
    }
        public static boolean getYNConfirm(Scanner pipe, String prompt)
        {
            String confirmYN;
            String trash = "";
            boolean done = false;
            boolean confirmAnswer = false;
            do {
                System.out.print("\n" + prompt + ": ");
                confirmYN = pipe.nextLine();
                if (confirmYN.equalsIgnoreCase("Y") || confirmYN.equalsIgnoreCase("N"))
                {

                    if (confirmYN.equalsIgnoreCase("Y"))
                    {
                        confirmAnswer = true;
                        done = true;
                    }
                    else
                    {
                        confirmAnswer = false;
                        done = true;
                    }
                }
                else
                {

                    System.out.println("You said the statement is: " + confirmYN);
                    System.out.println("Input Y or N!");
                }
            } while (!done);

            pipe.nextLine();

            return confirmAnswer;
        }
        public static String getRegExString(Scanner pipe, String prompt, String regEx)
        {
            String value = " ";
            String trash = "";
            boolean done = false;
            do {
                System.out.print("\n" + prompt + ": ");
                value = pipe.nextLine();
                if (value.matches(regEx))
                {
                    done = true;
                }
                else
                {
                    System.out.println("You said: " + value);
                    System.out.println("Please enter your social security number in the valid format [xxx-xx-xxxx]");
                }

            } while (!done);

            pipe.nextLine();

            return value;
        }

    /* public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String yourState = "";
        yourState = getNonZeroLenString(pipe, "Enter the state you live in");
        System.out.println(" \nYou currently live in: " + yourState);
    }
    */
    /*
   public static void main(String[] args) {
       Scanner pipe = new Scanner(System.in);
       int yourNumber = 0;
       yourNumber = getInt(pipe, "Enter your favorite integer");
       System.out.println(" \nYour favorite integer is: " + yourNumber );
   }
     */
    /*
   public static void main(String[] args) {
       Scanner pipe = new Scanner(System.in);
       double yourNumber = 0;
       yourNumber = getDouble(pipe, "Enter your favorite number");
       System.out.println(" \nYour favorite number is: " + yourNumber );
   }
     */
    /*
   public static void main(String[] args)
   {
       int low  = 1;
       int high = 10;
       Scanner pipe = new Scanner(System.in);
       int yourNumber = 0;
       yourNumber = getRangedInt(pipe, "Enter your favorite integer" + " [" + low + "-" + high + "]", low , high);
       System.out.println(" \nYour favorite integer is: " + yourNumber );
   }

    */
    /*

    public static void main(String[] args)
    {
        double low  = 0.5;
        double high = 10.5;
        Scanner pipe = new Scanner(System.in);
        double yourNumber = 0;
        yourNumber = getRangedDouble(pipe, "Enter your favorite number" + " [" + low + "-" + high + "]", low , high);
        System.out.println(" \nYour favorite number is: " + yourNumber );
    }
    */

    /*
   public static void main(String[] args)
   {

       Scanner pipe = new Scanner(System.in);
       boolean trueOrFalse = false;
       trueOrFalse = getYNConfirm(pipe, "Is this statement true");
       System.out.println("Then this statement is " + trueOrFalse );
   }

     */
    /*
   public static void main(String[] args)
   {

       Scanner pipe = new Scanner(System.in);
       String socialSecurityNumber = "";
       socialSecurityNumber = getRegExString(pipe, "Enter your social security number [xxx-xx-xxxx]" ,"\\d{3}-\\d{2}-\\d{4}" );
       System.out.println("Your social security number is: " + socialSecurityNumber);

   }

     */
}
