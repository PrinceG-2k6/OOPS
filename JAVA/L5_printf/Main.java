package L5_printf;

public class Main {
    // %[flags][width][.precision][specifier cahracter]

    public static void main(String[] args) {
        double a =25.00;
        double b = -17.98;
        double c = 34.32;
        // //Precision
        // System.out.printf("%.1f\n",a);
        // System.out.printf("%.1f\n",b);
        // System.out.printf("%.1f\n",c);

        //flags
        /*
         * +  add '+' sign on positive number
         * ,  add ',' on group of number
         * (  add () on negative number
         * space add a space for positive number
         */
        
        // System.out.printf("%+.1f\n",a);
        // System.out.printf("%( .1f\n",b);
        // System.out.printf("%+.1f\n",c);

        //Width
        /*
         * 0 for 0 padding
         * number =right justfed padding
         * negative number = left justified padding
         */

         int v =1;
         int x =12;
         int y=123;
         int z =1234;
        //  System.out.printf("%04d\n",v);
        //  System.out.printf("%04d\n",x);
        //  System.out.printf("%04d\n",y);
        //  System.out.printf("%04d\n",z);

        
        //  System.out.printf("%4d\n",v);
        //  System.out.printf("%4d\n",x);
        //  System.out.printf("%4d\n",y);
        //  System.out.printf("%4d\n",z);

        
         System.out.printf("%-4d0\n",v);
         System.out.printf("%-4d0\n",x);
         System.out.printf("%-4d0\n",y);
         System.out.printf("%-4d0\n",z);
    }
}
