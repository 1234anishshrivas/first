package seconddd;

import javax.lang.model.util.ElementScanner14;

public class allhallowpattern 
{
    public static void main(String[] args)
     {
        int n=5;
        int row, col;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=n; col++)

            if(col == n || col==1)
            {
                System.out.print("* ");
            }
            else 
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
    
}

