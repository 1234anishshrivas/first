package seconddd;

public class hallowtriangle3
 {
    public static void main(String[] args)
     {
        int row, col;
        int n =5;
        int m=n;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=n; col++)
            {
                if (col<m)
                {
                    System.out.print("");  // one code three triangle right angle left angle and hallowtriangle // one space hallowtriangle two space right angled troiangle and two-one space left angled triangle


                }
                else
                {
                    System.out.print("* ");

                }
                
            }
            m=m-1;
                System.out.println();
        }
        
    }
    
}
