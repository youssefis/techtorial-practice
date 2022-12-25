package primitives;

public class comparisonOperators2 {
    public static void main(String[]args){

        // There is an event, person is 18 years old or older, s/he can attend the event

        int ageOfPerson=20, requiredAge=18;
        boolean canAttend = ageOfPerson >= requiredAge;
        System.out.println(canAttend);//true

        boolean camAttend1= requiredAge<=ageOfPerson;
        System.out.println(camAttend1);

        //kids, if the age of child 12 or less, that child can go to the event

        int ageOfKid=11, kidsRerquiredAge=12;
        boolean canAttendKids = kidsRerquiredAge <= ageOfKid;
        System.out.println("can the kid attend? "+ canAttendKids);

        // if the age of child is 10, they can not participate

        int childAge=11, requiredChildAge=10;
        boolean canChildAttend=childAge != requiredChildAge;
        System.out.println(canChildAttend);




    }
}
