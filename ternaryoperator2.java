public class ternaryoperator2 
{
    public static void main(String[] arg)
    {
        int x = 11;
        int y = 61;
        int z = 11;


         String result =  (x>y && x>z) ? x + (" is the largest number ") : (y>x && y >z) ? y + (" is the largest number"):
         System.out.println(result);
    }

    
    
}
