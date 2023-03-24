public class Interview {

    public static void main(String[] args) {

        int a=12345;//15
        int sum=0;
        while (a>0){
            sum+=a%10;
            System.out.print(a%10);
            if (a>10) {
                System.out.print("+");
            }
            a/=10;

        }
        System.out.print("="+sum);
















//        int total=0;
//
//        while (a>0){
//            total+=a%10;
//            a/=10;
//        }
//        System.out.println(total);


    }

}
