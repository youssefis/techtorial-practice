package stringBasics;

public class StringMethod3 {
    public static void main(String[] args) {
        String str = "water";
    // startsWith(); return boolean
        boolean result1=str.startsWith("w");
        System.out.println(result1); //true
        System.out.println(str.startsWith("water")); //true
        System.out.println(str.startsWith("ter")); //false
    // endsWith (); return boolean
        System.out.println(str.endsWith("er")); //true
        System.out.println(str.endsWith("r")); //true
        System.out.println(str.endsWith("wat")); //false

    }
}
