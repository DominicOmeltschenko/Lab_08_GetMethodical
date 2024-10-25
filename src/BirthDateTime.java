import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int low = 1950;
        int high = 2015;

        year = SafeInput.getRangedInt(pipe, "Enter the year of your birth " + " [" + low + "-" + high + "]", low, high);

        low = 1;
        high = 12;

        month = SafeInput.getRangedInt(pipe, "Enter the month of your birth " + " [" + low + "-" + high + "]", low, high);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                high = 31;
                break;
            case 2:
                high = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                high = 30;
                break;
        }

        day = SafeInput.getRangedInt(pipe, "Enter the day of your birth " + " [" + low + "-" + high + "]", low, high);


        high = 24;

        hour = SafeInput.getRangedInt(pipe, "Enter the hour of your birth " + " [" + low + "-" + high + "]", low, high);


        high = 59;

        minute = SafeInput.getRangedInt(pipe, "Enter the minute of your birth " + " [" + low + "-" + high + "]", low, high);

        System.out.println("You were born in " + year + " in the month " + month + " on the day " + day + " in the hour " + hour + " at the minute " + minute);
    }

}
