package seconddd;

public class june08
 {
    public static void main(String[] arg)
    {
        int num  = 82 ;
        int k = (3);
        int mask = (0b00000001 << (k-1));

        int result = num ^mask;
        System.out.println(result);

        for( int i = 0; i<=7; i++);
        {

        
            int binary = 128 >> 1 & num;

            int x = binary!=0?1:0;

            if (x == 0)
            {
                System.out.println("ONN");
          }
            else
            {
               System.out.println("OFF");
          
        
        
        
        }
        }
    }
    
}
