package seconddd;

public class Logical
 {
    public static void main(String[] arg)
    {

        int  a = 10, b = 11, c = 11, d = 0;

        System.out.println("var1 = " + (a));
        System.out.println("var2 = " + (b));
        System.out.println(("var3 = " + (c)));

        if((a < b) && (b == c))
        {

            d = a + b + c;
            System.out.println("the sum is: = " + d);
        }
        else
        System.out.println("false condition");



    }
    
}
