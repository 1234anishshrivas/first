package seconddd;

public class butterfly
 {
    public static void main(String[] args)
     {
        int row, col;
        int n=5;
        int num = 1;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<row; col++)
            {
                System.out.print("*");
            }

            int spaces = 2*(n-row);
            for(col=1; col<=spaces; col++)
            {
                System.out.print(" ");
            }
            for(col=1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(row=n; row>=1; row--)
        {
            for(col=1; col<row; col++)
            {
                System.out.print("*");
            }

            int spaces = 2*(n-row);
            for(col=1; col<=spaces; col++)
            {
                System.out.print(" ");
            }
            for(col=1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
        
       
    }
    
}

        
    
    

