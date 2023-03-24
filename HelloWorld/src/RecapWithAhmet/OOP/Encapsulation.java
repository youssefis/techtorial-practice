package RecapWithAhmet.OOP;

public class Encapsulation {

    /*
    Possible interview Questions
        1-what is encapsulation? why do we use it?
            --> Encapsulation is the process of wrapping code and data together into a single unit;
            --> and we use is to hide or protect data,
        2-how can you access the data from encapsulation?
          --> in encapsulation data can be accessed by using getters and setters and
          access modifiers,
        3-if encapsulation is hiding the data from users/other classes, and we still can
        access it, by using getters and setters, so what is the point of using it?
            --> Actually, you access the data from users/other classes by getters and setters,
            but they cannot access your implementation inside the method. it means
            you are still protecting data based on your condition.
         Summary: in encapsulation you still access the data by using
         getters and setters,  but you can not change the implementation
         which limits you.

        -->

     */


    public static void main(String[] args) {

        EncapsulationPractice encapsulationPractice=new EncapsulationPractice();
        encapsulationPractice.setCreditCard(555555);
        System.out.println(encapsulationPractice.getCreditCard()  );
        encapsulationPractice.setName("ahmed");
        System.out.println(encapsulationPractice.getName());

    }

}
