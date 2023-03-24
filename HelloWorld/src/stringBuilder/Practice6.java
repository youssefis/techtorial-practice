package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice6 {

    public static void main(String[] args) {


    //revers()

    StringBuilder builder=new StringBuilder("welcome");

        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        //toString

        String str=builder.toString();
        System.out.println(str.toUpperCase());


        String[] array={"code", "fish", "interview","mock","is","coming","soon"};
        reversEveryWord(array);


    }

    public static List<String> reversEveryWord(String[] array){

        List<String> list=new ArrayList();

        for (String str:array){

            StringBuilder builder=new StringBuilder(str);
            builder.reverse();
            String revStr =builder.toString();
            list.add(revStr);
            }

        System.out.println(list);
        return list;
        }

    }



