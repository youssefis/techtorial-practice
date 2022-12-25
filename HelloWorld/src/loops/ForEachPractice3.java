package loops;

public class ForEachPractice3 {
    public static void main(String[] args) {

        double[] changes={2.34,4.5,1.25,3.40,1.2};

        //by using for each loop find the total of changes
        double totalOfChanges=0;
        for (double change:changes){
            totalOfChanges+=change;

        }
        System.out.println(totalOfChanges);

        int[] numbers={1,2,3,5,6,7};
        // find the missing number from the giving pattern
        for(int i=0;i<numbers.length-1;i++){

            if (numbers[i+1]-numbers[i]>1){
                System.out.println(numbers[i]+1);
            }

        }

        // {1,2,3,5,6,7}




    }
}
