package loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        int num1=1, lastNum=10;

        while (num1<=lastNum){
            System.out.println("***");
            num1++;
        }
        num1=1;lastNum=10;
        do {
            System.out.println("$$$$$");
            num1++;
        }
        while (num1<=lastNum);
    }
}
