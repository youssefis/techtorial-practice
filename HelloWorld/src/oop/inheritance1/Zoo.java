package oop.inheritance1;

public class Zoo {

    public static void main(String[] args) {

        Animal animal1=new Animal();
        System.out.println(animal1.color);

        WildAnimal wild=new WildAnimal();

        System.out.println(wild.color);
        Lion lion=new Lion();

        System.out.println(lion.color);
        System.out.println("+++++++++++++++");
        lion.color="Brownish";
        System.out.println(lion.color);

        DomesticAnimal domesticAnimal= new DomesticAnimal();
        System.out.println(domesticAnimal.color);
        Cat cat=new Cat();
        System.out.println(cat.color);

        animal1.eat();
        wild.eat();
        domesticAnimal.eat();
        lion.eat();
        cat.eat();
        animal1.name="Father";
        System.out.println(animal1.name);
        System.out.println(wild.name);
        animal1.eat();
        lion.name="Simba";
        lion.eat();
        System.out.println("=====================");

        animal1.sleep();
        wild.sleep();
        animal1.speak();
        wild.speak();
        lion.speak();

        System.out.println(domesticAnimal.hasToy);
        System.out.println(cat.hasToy);
        domesticAnimal.play();
        cat.play();
        System.out.println("================");
        domesticAnimal.name="Jerry";
        cat.name="Tom";
        domesticAnimal.play();
        cat.play();






    }

}
