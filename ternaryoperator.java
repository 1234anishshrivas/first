public class ternaryoperator
 {
    public static void main(String[] arg)
    {
        int x = 11;
        int y = 61;
        int z = 11;

        if (x>y && x>z)
        {
            System.out.println(x + " is the largest number ");
        }

        else
        {
            if(y>x && y >z)
            {
                System.out.println(y + " is the largest number");
            }
            else
            {
                System.out.println(z + " is the largest number");
            }

        }



        


        

        

    }
    
}
