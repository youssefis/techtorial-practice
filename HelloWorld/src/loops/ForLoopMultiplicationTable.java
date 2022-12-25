package loops;

public class ForLoopMultiplicationTable {
    public static void main(String[] args) {

        for (int i=1; i<=10;i++) {
            System.out.println();
            System.out.println("multiplication table of "+ i);
            for (int k = 1; k <= 10; k++) {

                System.out.println(i + " * " + k + " = " + i * k);

                if (k==5){
                    break;
                }

            }


        }


    }
}
