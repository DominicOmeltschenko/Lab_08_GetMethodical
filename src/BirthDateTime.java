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

        low = 1;
        high = 31;

        day = SafeInput.getRangedInt(pipe, "Enter the day of your birth " + " [" + low + "-" + high + "]", low, high);

        low = 1;
        high = 24;

        hour = SafeInput.getRangedInt(pipe, "Enter the hour of your birth " + " [" + low + "-" + high + "]", low, high);

        low = 1;
        high = 59;

        minute = SafeInput.getRangedInt(pipe, "Enter the minute of your birth " + " [" + low + "-" + high + "]", low, high);

        System.out.println(year + " " + month + " " + day + " " + hour + " " + minute);
    }

}
