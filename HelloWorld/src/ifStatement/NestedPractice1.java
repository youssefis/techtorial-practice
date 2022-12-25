package ifStatement;

public class NestedPractice1 {
    public static void main(String[] args) {
        boolean id=true, visa=true, ticket=false;
        System.out.println("Checking ID is next..");
        if (id){
            System.out.println("Checking visa is next..");
            if (visa){
                System.out.println("Checking ticket is next");
                if (ticket){
                    System.out.println("Enjoy your flight!!");
                }else {
                    System.out.println("You should have ticket");
                }
            } else {
                System.out.println("You should have visa");
            }
        }else {
            System.out.println("First you should have valid ID");
        }
    }
}
