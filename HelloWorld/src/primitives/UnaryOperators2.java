package primitives;

public class UnaryOperators2 {
    public static void main(String[] args) {
        double d=8.7;
        d++;
        System.out.println(d);
        int a=5;
        int b= ++a;
        int c= a + ++b;
        System.out.println();
        //
        System.out.println("c is >>"+ c);
        c= c++ + --a -2;
        System.out.println(c);

        int k=8, t=++k, m=k+t,x=++m;
        System.out.println(--x - --k);
        //======= deal on DD ======

        /*
        get one dozen of donuts for 15$ you get one dollar discount on your next purchase
        show your next purchase payment amount

         */
        int payment=15;
        System.out.println(payment--); //today $15(shows15, value14)
        System.out.println("next payment "+ payment);

    }
}
