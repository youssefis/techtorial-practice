package RecapWithAhmet;

public class Constructor {
    /*
    Possible interview question:
        1- what is constructor and what do you do with it?
            * it is a way to initialize instance variables
            *it is a way to assign value for object features
        2- can you tell me the difference between constructor and method?

            *Constructor                                 *Method:
            -constructor is a special method              -It must have return Type
            -no return Type                               - it may have any name
            -it must have the same name of the class

        3-can you make constructor static, final, and private?
        we can not make the constructor static, final, or private(Exception-Singleton Pattern Design)

        4- what is the difference between this, this(), super, super()?
        this : is keyword which refers to instance variables/methods or class
        this(): refers to constructor from same class
        super : is a keyword which refers to parent instance variable/methods of class
        super(): refers to the parent constructor from Different class

     */

    String brand="Porsche";
    int Wheel=4;
    int door=2;

    public Constructor(String brand){
        this.brand=brand;
    }
    public Constructor(int door){
        this.door=door;
    }
    public Constructor(String brand,int wheel){
        this(4);
        this.brand=brand;
        this.Wheel=wheel;
    }

    public static void main(String[] args) {

        Constructor porsche314=new Constructor("Porsche314");
        System.out.println(porsche314.brand);
        Constructor example=new Constructor("BMW",3);
        System.out.println(example.door);
        System.out.println(example.Wheel);

    }













}
