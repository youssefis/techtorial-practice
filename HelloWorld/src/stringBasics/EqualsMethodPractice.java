package stringBasics;

public class EqualsMethodPractice {
    public static void main(String[] args) {
        //equals();

        String name1="Dmitriy";
        String name2= "Dmitriy";
        String name3 = new String("Dmitriy");
        System.out.println(name1.equals(name2)); //true
        //==
        System.out.println(name1==name2); // true
        System.out.println(name1.equals(name3)); //false
        System.out.println(name1==name3);

        String name4= new String("Dmitriy");
        System.out.println(name3.equals(name4));

        System.out.println(name3==name4);
         String name5=name4;
        System.out.println(name4.equals(name5));
        System.out.println(name4==name5);
        String name6=new String(name1);
        System.out.println(name6==name1);

    }
}
