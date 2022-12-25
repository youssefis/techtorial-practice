package arrays;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {

        String[] brands= {"Nike", "Adidas", "puma", "New Balance", "Reebok"};
        // Print every brand in revers version
        // ex: ekiN, sadidA,...
        // store the Reversed brands into a new array
        String [] reversedArray=new String[brands.length];
        for (int i=0;i<brands.length;i++) {
            //System.out.println(brands[i]);
            String rev="";
            for (int k = brands[i].length() - 1; k >= 0; k--) {

                rev+=brands[i].charAt(k);

            }

            reversedArray[i]=rev;
            System.out.println("Reversed of "+brands[i]+" is "+rev);
            //System.out.println(Arrays.toString(reversedArray));
        }



    }
}
