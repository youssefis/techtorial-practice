package stringBasics;

public class String4Substring {
    public static void main(String[] args) {
        String season= "winter";
        //              012345
        // substring();---> returns String
        String part= season.substring(1);
        System.out.println(part);
        String part2=season.substring(1,4);
        System.out.println(part2);
        // System.out.println(season.substring(9)); //StringIndexOutOfBoundsException

        String task="lets do it";
        //take and print out the word 'do' only from above string

        System.out.println( task.substring(5,7));

        //make above task solution dynamic
        System.out.println(task.substring(task.indexOf('d'),task.indexOf('o')+1));
        int firstSpaceIndex = task.indexOf(' ');
        int secondSpaceIndex= task.indexOf(' ',firstSpaceIndex+1);
        String secondWordOfSentence =task.substring(firstSpaceIndex,secondSpaceIndex);

        System.out.println(secondWordOfSentence);


    }
}
