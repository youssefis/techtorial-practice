package loops;

public class NestedLoopPractice3 {
    public static void main(String[] args) {


        for (int i = 2020; i <= 2030; i++) {
            System.out.print(i + "---->");
            for (int k = 1; k <= 12; k++) {
                switch (k) {
                    case 1:
                    System.out.print(k+"-Jan" + ", "); break;
                    case 2:
                        System.out.print(k+"-Feb" + ", ");break;
                    case 3:
                        System.out.print(k+"-Mar" + ", ");break;
                    case 4:
                        System.out.print(k+"-Apr" + ", ");break;
                    case 5:
                        System.out.print(k+"-May" + ", ");break;
                    case 6:
                        System.out.print(k+"-Jun" + ", ");break;
                    case 7:
                        System.out.print(k+"-Jul" + ", ");break;
                    case 8:
                        System.out.print(k+"-Aug" + ", ");break;
                    case 9:
                        System.out.print(k+"-Sep" + ", ");break;
                    case 10:
                        System.out.print(k+"-Oct" + ", ");break;
                    case 11:
                        System.out.print(k+"-Nov" + ", ");break;
                    case 12:
                        System.out.print(k+"-Dec");break;



                }
                }
                System.out.println();
            }


        }
    }


