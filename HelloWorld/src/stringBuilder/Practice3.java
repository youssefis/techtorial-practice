package stringBuilder;

public class Practice3 {
    public static void main(String[] args) {

        StringBuilder success = new StringBuilder("Tech");
        System.out.println(success.length());

        success.append("nology");
        System.out.println(success); //Technology
        System.out.println(success.substring(5));

        System.out.println(success);
        String str=success.substring(5);

        //StringBuilder bl1=success.substring(5); substring return a String

        StringBuilder bl2=new StringBuilder(success.substring(5));
        System.out.println(bl2); // ology

        System.out.println(bl2.equals(str)); //false because they are different object
        System.out.println(str.equals(bl2));        // =

        str.concat("is not a word");
        System.out.println(str); //

        System.out.println("=======================");

        bl2.append(" is not a word");
        System.out.println(bl2);

        System.out.println(success);
        success.insert(5,"TRUE");
        System.out.println(success);
        success.insert(4,true);
        System.out.println(success);

        // delete() - deleteChrAt()
        success.delete(4,8);
        System.out.println(success);

        success.delete(success.indexOf("T",1),9);
        System.out.println(success);
        success.insert(5,"TRUE");
        System.out.println(success);
        success.delete(success.lastIndexOf("T"),success.indexOf("E")+1);
        System.out.println(success);
        success.deleteCharAt(1);
        System.out.println(success);





    }
}
