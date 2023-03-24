package RecapWithAhmet;

public class StringBuilderPractice {

    /*
        1-What is the difference between String and StringBuilder
            ->String is immutable
            ->StringBuilder is Mutable
            ->StringBuilder has some different methods --> append, reverse...
        2-What is the difference between String Builder and String buffer
            -->String Buffer and HashTable are both synchronized
            -->Map,List,Set,String,StringBuilder are not synchronized

        Note: Mutable and Immutable is all about the giving functions/actions/manipulation without
        Reassigning the value

        Note2: PassByValue and PassByReference,
            *if you call the method and pass the value directly/initializing
                ex:StringBuilder.run("Youssef"); //->this means passing by value
            *if you call the method and pass a value by its reference
                String name="Youssef";
                ex:StringBuilder.run(name); //->this means passing by reference;
     */
    public static void main(String[] args) {

        //Mutability
        String name="yusuf";
        name=name.replace("s","*").concat("loves").concat("java  ").trim();
        System.out.println(name);
        StringBuilder builder=new StringBuilder("yusuf");
        builder.replace(2,3,"*").append("loves").append("java  ").trimToSize();
        System.out.println(builder);
        System.out.println(builder.reverse());

    }



}
