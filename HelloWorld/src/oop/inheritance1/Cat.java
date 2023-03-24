package oop.inheritance1;

public class Cat extends DomesticAnimal{

    String name;

    @Override
    public void play() {
        System.out.println(name+" is playing");
    }
    int jump(){
        System.out.println("Cat is jumping");
        return  5;
    }
    // commenting out private hunt method below since it was
    //having wider access modifier in the parent class.
    //now it is not compiling since we made it private
//    private void hunt(){
//        System.out.println("Cat is Hunting");
//    }

    @Override
    public Cat hunt(){

        return new Cat();

    }

}
