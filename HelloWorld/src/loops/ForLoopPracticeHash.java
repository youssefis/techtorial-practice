package loops;

import java.util.Scanner;

public class ForLoopPracticeHash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the length");
        int length =sc.nextInt();
        System.out.println("please enter the width");
        int with= sc.nextInt();

        for (int l=0; l<length;l++){


            for (int w=0;w<with;w++){
                System.out.print("#");
            }
            System.out.println();
        }


    }
}
