package wrapperClasses;

public class Practice1 {
    public static void main(String[] args) {
        Byte bt=4;
        Byte b1=new Byte((byte)bt);
        Byte b2=6; //Autoboxing
        Integer i1=11;  // Autoboxing
        System.out.println(i1); // 11
        System.out.println(i1+55);
        System.out.println(b2*i1);
        Character letter1 = new Character('t');
        Character letter2='r';
        String str=letter2.toString().concat("Testing");
        System.out.println(str);

        int a=i1; //Unboxing --> converting from wrapper to primitive data
        byte bt2=b1;// Unboxing
        byte bt3= (byte)(b1+i1);

        int i = new Integer(10);





    }

}
