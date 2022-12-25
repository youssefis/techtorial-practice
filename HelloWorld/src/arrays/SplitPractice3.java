package arrays;

import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {

        String str="Sunday is daddy day";
        String[] part1=str.split("d");
        System.out.println(Arrays.toString(part1));
        String[] part2=str.split("d",3);
        System.out.println(Arrays.toString(part2));

        String date1= "12-23-2022";
        // if the day is 23 of december, print out 'Happy birthday! '
        String[] dateParts=date1.split("-");
        System.out.println(Arrays.toString(dateParts));
        if (dateParts[0].equals("12")&&dateParts[1].equals("23")){

            System.out.println("Happy birthday");
        }

        String date2="12.23.2022";

        String[] dateParts2=date2.split("\\.");
        System.out.println(Arrays.toString(dateParts2));

    }
}
