package switchPractice;

public class Practice1 {
    public static void main(String[] args) {
        int count = 10;

        switch (count) {

            default:
                System.out.println("Wrong entry"); break;
            case 0:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 1:
                System.out.println("white");
                break;
            case 10:
                System.out.println("PINK");
                break;


        }
    }
}
