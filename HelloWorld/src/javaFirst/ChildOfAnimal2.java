package javaFirst;

import accessModifier.Animal;

public class ChildOfAnimal2 extends Animal   {

    public static void main(String[] args) {

        Animal animal=new Animal();

        animal.namePublic="Jerry";
        animal.eatPublic();

        ChildOfAnimal2 childOfAnimal2=new ChildOfAnimal2();
        childOfAnimal2.ageProtected=2;
        childOfAnimal2.namePublic="Jr Jerry2";

        double d= childOfAnimal2.eatPublic();



    }

}
