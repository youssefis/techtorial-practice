package primitives;

public class LogicalOperators1 {
    public static void main(String[]args){
        //  Travel --> passport, ticket

        boolean passport=false;
        boolean ticket=true;

        boolean travel = passport && ticket;
        System.out.println("Can travel "+ travel);

        // party --> dressCoat, Age

        boolean dressCoat=true, age=true, attendParty;
        attendParty=dressCoat && age;
        System.out.println("Can attend party "+attendParty);

        // there is an event for kids, only kids between 12 and 16 years old are allowed to attend

        int childAge=14, lowerLimit=12, overLimit=16 ;

        boolean kidIsWelcomed=childAge<overLimit && childAge>lowerLimit;
        System.out.println("kid is Welcomed "+ kidIsWelcomed);

        // parents  want to come together for a family dinner
        // but kids who are age of 12 (inclusive) to 18 (inclusive) are not allowed to come with them
        // adults and younger kids are together

        int age1=5, limit1=12, limit2=18;
        boolean withAdult = age1<=limit1 || age1 >=limit2;
        System.out.println("with adult "+ withAdult);


        // || OR
        // cash   card

        boolean cash=false, card=true, buy;
        buy= cash || card;
        System.out.println("buy "+ buy);

        //

        System.out.println(true || false && false);
        System.out.println(true && false || false);
        System.out.println((true || false)&& false);
        System.out.println('B'+2 == 3*'C' || !true && 'C'<'B'/3);









    }
}
