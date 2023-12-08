package seconddd;

public class decito2

{

    public static void main(String[] arg)
    {

        int Decimal = 8;
        int mask = 0b100000;
        int i ;
        int result;
        for(i = 0 ; i <=7 ; i++)
        {
            result = Decimal & mask ;
           // int x = result>0 ? 1:0;
           // System.out.print(x);
           if(result>0)
           {
            System.out.print(1);
           }
           else{
            System.out.print(0);
           }
           mask >>= 1;

      }
    }



    
}
