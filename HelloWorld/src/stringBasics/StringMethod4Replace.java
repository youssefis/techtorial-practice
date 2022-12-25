package stringBasics;

public class StringMethod4Replace {
    public static void main(String[] args) {

        String str= "wednesday";
        String strUpdate =str.replace('e','*');
        System.out.println(strUpdate);
        String update2= str.replace("d","$$");
        System.out.println(update2);
        String update3=str.replace("day","-");
        System.out.println(update3);

    }
}
