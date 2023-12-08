package seconddd;

public class mask
 {
    public static void main(String[] arg)
    {
        int x = 5;
        int mask = 0b00000010<<1;
        int result = x|mask;
        System.out.println(result);
        for(int i = 0; i<=7; i++);
        {
        
           // int binary = 128>>i & result;
           // int a  = binary!=0?1:0;
           // System.out.println(a);

        }
    }
}
