package RecapWithAhmet.OOP;

public class Polymorphism {

    /*

    1- what is polymorphism? (poly:many, morphism:forms)
        --> it is a different form of object

    2- what is dynamic and static polymorphism?
        --> Dynamic polymorphism: is all about Overriding.--> Dynamic(Action)
        --> Static Polymorphism: is all about overloading. --> static (stable) --> no action

    3-what is the difference between Overriding and overloading? (*** The most common***)
        OVERLOADING:
            1- Overloading happen in the same class
            2- final,static and private methods can be overloaded
            3- Whenever you overload, it checks method signature (Different method signature)
                    Method signature ==> Name of the method+ Parameter
                                     -->public void run (int speed)
                                     -->private void run (int speed, String name)
        OVERRIDING:
            1- Happen in a subClass
            2- final,static and private methods can not be overriding
            3- Whenever you override, it checks not only method signature also return type
            and must have same method signature


     */

    public void dismiss(int time,int minute,String nameOfTeacher){
        System.out.println("Student are leaving at"+time+minute+"With teacher"+nameOfTeacher);
    }
    public void dismiss(int hour,String nameOfTeacher){
        System.out.println("Student are leaving at"+hour+"With teacher"+nameOfTeacher);
    }

}
