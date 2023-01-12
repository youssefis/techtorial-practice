package object;

public class AnimalTest {
    public static void main(String[] args) {
        Animal Animal1= new Animal();
        System.out.println(Animal1);

        System.out.println(Animal1.name);
        System.out.println(Animal1.color);
        System.out.println(Animal1.age);
        Animal1.name="Simba";
        System.out.println(Animal1.name);
        Animal1.color="brown";
        Animal1.age=4;
        System.out.println(Animal1.color);
        System.out.println(Animal1.age);
        System.out.println("++++++++++++++++++++++++++++");
        Animal cat=new Animal();

        cat.name="Tom";
        cat.color="black";
        cat.age=2;
        System.out.println(cat.name);
        System.out.println(cat.color);
        System.out.println(cat.age);
        System.out.println(Animal1.gender);
        System.out.println(cat.gender);
        cat.gender="male";
        System.out.println(cat.gender);
        System.out.println("==============================");

        cat.eat();
        Animal1.eat();
        System.out.println("========================");
        // create a method that will print all properties of every animal
        cat.allProperties();
        Animal1.allProperties();
        System.out.println("==================================");
        Animal dog=new Animal();
        dog.name="rex";
        System.out.println(dog.energyLevel);
        dog.eat();
        System.out.println(dog.energyLevel);
        System.out.println("cat's EnergyLevel??  is "+cat.energyLevel);

        // create run method
        // when an animal runs
        // it will lose 20 points of energy
        // implement the logic and show leftover energy
        // include name of the animal in the methode to let user know
        // which animal is running

        dog.run();
        dog.run();
        dog.run();
        dog.eat();














    }
}
