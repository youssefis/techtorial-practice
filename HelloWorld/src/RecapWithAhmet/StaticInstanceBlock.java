package RecapWithAhmet;

public class StaticInstanceBlock {
    /*
    Possible interview Questions:
        1-What is static as a keyword and why do you use it?
          --> Static (as a keyword) is a way to make the methods accessible,without creating an Object
          from that class.
          --> the disadvantage of using static keyword is that you can not override the static methods
          side note: you can not override "Private, static, final methods"

          2-What is static block
          -->it is the block that can be called once
          -->It always executes first

          3-What is static as a variable keyword?

          -->It makes the variable belong to the class
          -->it is sharable (common)==> common for all objects
          -->It can be accessed by other classes without creating an object. just with the name of
          the class
          4-What is an instance block?
            -->It is a block that can be called as many as you have objects
     */
    public static void main(String[] args) {

        StaticExample staticExample=new StaticExample();
        staticExample.run();
        StaticExample.speak();
        //staticExample.speak(); not suggested
        //To be able to call static method.
        //I can use just className(System Suggestion)

        StaticExample ahmet=new StaticExample();
        System.out.println(ahmet.money); //1000
        ahmet.widrawlMoney();
        System.out.println(ahmet.money); //900

        StaticExample Mehmet=new StaticExample();
        Mehmet.widrawlMoney();//900 -->800
        Mehmet.widrawlMoney();//800 -->700
        System.out.println(Mehmet.money);

        //we have 3 objects: we will see
        // 3 S-out of the instance block
        // and 1 S-out for the Static block


    }




}







