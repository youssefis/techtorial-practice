package accessModifier;

public class ChildOfAnimal extends Animal{

    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.ageProtected=8;
        animal.namePublic="Jerry2";
        animal.colorDefault="Red";

        ChildOfAnimal childOfAnimal= new ChildOfAnimal();
        childOfAnimal.ageProtected= 3;
        childOfAnimal.colorDefault="Red/White";
        childOfAnimal.namePublic="Jr Jerry";

    }

}
