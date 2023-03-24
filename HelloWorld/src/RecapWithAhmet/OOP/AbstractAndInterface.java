package RecapWithAhmet.OOP;

public class AbstractAndInterface {

    /*
    Possible interview questions:

    1-what is abstract ? and can you clarify with little bite details?
        --> abstraction in java is the process of hiding details, and showing only essential
        information which keeps the user from viewing complex implementation which help for
        simplicity, we can not instantiate an abstract class in java instead we can subClass
         the abstract class, and we call an abstract class any class has one abstract method or more

    2-why do you need to have abstract class in your project?
        --> as I mentioned before abstraction helps for simplicity,developers

    3-where do you use abstract class in your project?

    4-can you create an object from abstract class? if no, how are you going to access
    all the methods and variables from that class

    No, you can not create an object from abstract class. to be able to access these methods
    and variables you need to override them.

    5- can you have a normal and abstract method on an abstract class.
        yes, by definition an abstract class is a class which contain one or more abstract methods


    ======== Interface ============
    1-What is interface
        --> Interface is a collection of abstract methods that can be overridden to make implementation
        we use implements in the subClass to connect it
    2-Why do you need interface if you have abstract?
    --> because interface have more features in terms of accessing the multiple parents at the same time
    by overriding

    3-What is the difference between interface and abstract? (*** The most Common ***)

        INTERFACE:
            ✔-->1- interface is declared by Interface keyword
            ✔-->2-interface can have only public abstract methods
            ✔-->3-To make a connection, we use "Implements" keyword
            -->4-in interface you can implement that class as many as you want parents, and you can
            ✔use "extends" keyword, but it should come before implements
            ✔-->5-when you initialize a variable in interface as default it is "Final Static";
            ✔-->6-Methods must be as default "Public Abstract"
            ✔-->7-can not have constructor

        ABSTRACT:
            -->1-abstract is declared by abstract keyword
            -->2-abstract may or may not have regular methods.
            -->3-to make a connection, we use "Extends" keyword
         ***-->4 in abstract you can extend the class once.(one extends keyword per class)
            -->5 when you declare a variable in abstract there is no default key word
            -->6 you can have any access modifiers for this (no default keyword)
            -->7 can have constructor


     */
}
