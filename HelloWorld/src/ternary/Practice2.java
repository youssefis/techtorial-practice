package ternary;

public class Practice2 {
    public static void main(String[] args) {
        String str="Techtorial ";
        String str2= new String("Techtorial");
        String result= 'a'=='a'? str.concat("Academy") : str.replace("Tech","TECH");
        System.out.println(result);
        System.out.println('a'>'a'? str.concat("Academy") : str.replace("Tech","TECH"));

    }
}
