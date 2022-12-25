package groupProject3;

public class Task1 {
    public static void main(String[] args) {
        String str1=" Snicker ";
        String result1= str1.trim().toUpperCase();
        System.out.println(result1);
        String str2=result1.substring(0,5);
        System.out.println(str2);
        System.out.println(str2.charAt(0));

        String str3="Cookie";
        String str4=str3.toLowerCase().replace("o","u").concat("s");
        System.out.println(str4);//cuukies





    }
}
