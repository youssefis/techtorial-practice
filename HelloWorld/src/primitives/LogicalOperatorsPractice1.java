package primitives;

public class LogicalOperatorsPractice1 {
    public static void main(String[] args) {
        int test1=100, test2=80,test3=20,requiredAttendance=90,attendance=80;
        int testsAverage=(test1+test2+test3)/3;
        boolean result = testsAverage>=60 && attendance>=requiredAttendance;
        System.out.println(result);

    }
}
