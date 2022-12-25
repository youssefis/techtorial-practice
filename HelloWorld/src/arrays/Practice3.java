package arrays;

import java.sql.Array;
import java.util.Arrays;

public class Practice3 {
    public static void main (String[] args){

        String[] studentNames=new String[9];

        studentNames[0]="Alex";
        studentNames[1]="Ana";
        studentNames[2]="Dilyana";
        studentNames[3]="A 0";
        studentNames[4]="Stan";
        studentNames[5]="Diana";

        System.out.println(Arrays.toString(studentNames));

        // print out the name if the name has letter 'l' into it
        // [Alex, Ana, Dyana, A 0, Stan, Diana, null, null, null]

        for (int i=0;i<studentNames.length;i++){
            if(studentNames[i]==null){
                continue;
            }

            if (studentNames[i].contains("l")) {
                System.out.println(studentNames[i]);
            }

        }
        System.out.println("===================");

        for (int i=0;i<studentNames.length;i++){
            if(studentNames[i]!=null) {
                if (studentNames[i].contains("l")) {
                    System.out.println(studentNames[i]);
                }
            }

        }







    }
}
