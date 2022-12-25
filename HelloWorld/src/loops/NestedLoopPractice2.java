package loops;

public class NestedLoopPractice2 {
    public static void main(String[] args) {


        HOUR:
        for (int h=1 ; h<=12 ; h++ ){



            MINUTE:
            for (int m=0 ;m<=59 ;m++ ){


                SECOND:
                for (int s=0;s<=59 ;s++ ){

                    if (h<=12) {

                        System.out.println("hour- " + h + " : " + "min-" + m + " : " + "sec-" + s+ " AM");
                    }else {
                        System.out.println("hour- " + h + " : " + "min-" + m + " : " + "sec-" + s+ " PM");

                    }

                }

            }
        }
    }
}
