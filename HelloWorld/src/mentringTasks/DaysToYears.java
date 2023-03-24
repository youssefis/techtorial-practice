package mentringTasks;

public class DaysToYears {

    /*
    Create a method that takes days as a parameters, and prints how many years, month and days is there
    Input:1000
    Output:
            No. of years: 2
            No. of months:9
            No. of days:0
     */

    public static void main(String[] args) {
        daysToYears(1);
    }


    public static void daysToYears (int d){
        int year,month,day;
        year=d/365;
        d=d%365;
        month=d/30;
        d=d%30;
        day=d;
        System.out.println("No. of years: "+year);
        System.out.println("No. of months: "+month);
        System.out.println("No. of days: "+day);

    }



}
