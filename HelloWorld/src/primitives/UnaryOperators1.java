package primitives;

public class UnaryOperators1 {

    public static void main(String[] args) {
        int studentNumber=23;

        System.out.println(studentNumber);//23
        studentNumber++;
        System.out.println(studentNumber);//24
        ++studentNumber;
        System.out.println(studentNumber);
        ///=========
        System.out.println("======");
        System.out.println(studentNumber++);//25
        System.out.println(studentNumber);//26
        System.out.println("======");
        System.out.println(++studentNumber);//27
        System.out.println(studentNumber);
        //================
        studentNumber++;
        System.out.println(studentNumber);//28
        System.out.println(studentNumber++);//28
        System.out.println(studentNumber);//29

        ///=======
        System.out.println("========Decrement=========");
        int number=12;

        // PreDecrement
        --number;
        System.out.println(number);//11

        //postDecrement
        number--;
        System.out.println(number);//10

        // difference btw PreDecrement and postDecrement

        System.out.println(--number); //  PreDecrement: value is 9 and shows 9
        System.out.println(number--); // postDecrement: value is 8 and shows 9
        System.out.println(number); // it will shows 8 of the last PostDecrement

















    }
}
