package stringBasics;

public class Practice1 {
    public static void main(String[]args){
        String word = "Fluffy";
        System.out.println(word);
        System.out.println(word+5+3);

        //reassignment

        word ="Test";
        System.out.println(word);
        //compound assignment
        word+=word; // ---> word= word+word;
        System.out.println(word); //TestTest
         String text="1234";
        System.out.println(text+100); // 1234100
        System.out.println(text+word); // only one time when printing
        System.out.println(text);
        text+="5"; // text=text+"5"
        System.out.println(text);
        text+=6;
        System.out.println(text);
        int number=333;
        text+=number;
        System.out.println(text);
        String name= "java"+111;
        System.out.println(name);
        String lastName= "Selenium"+'t';
        System.out.println(lastName);
        name= "Jenny";
        lastName= "Brown";
        name= name+lastName;
        System.out.println(name);
        System.out.println(lastName);
        String lunch = new String("Burger");
        System.out.println(lunch); //Burger
        lunch+=" with fries";
        System.out.println(lunch);




    }
}
