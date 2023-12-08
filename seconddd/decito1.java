package seconddd;

public class decito1 
{
    public static void main(String[] arg)
    {
        int Decimal = 12;
        int Binary;
        while(Decimal!=0)
        {

           Binary =  Decimal%2;
           Decimal = Decimal/2;
           System.out.print(Binary);
        }
    }
    
}
