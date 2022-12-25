package loops;

public class BreakContinuePractice {
    public static void main(String[] args) {
        for (int i=1;i<16;i++){

                if (i>5 && i<12){
                    System.out.println("Off");
                    continue;
                }
            System.out.println("Day"+i+"- work");

        }
    }
}
