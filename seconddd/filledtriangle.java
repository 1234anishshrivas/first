package seconddd;

import javax.lang.model.util.ElementScanner14;

public class filledtriangle 
{
    public static void main(String[] args) // reverse filledtriangle & hallowtriangle
     {
        int n=5; //n=0
        int row, col;
        int m = n; 
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=n; col++)
            {

                if(col<m) //if(col<=m)
                {
                    System.out.print(" ");
                }
                else
                {
                    if(row>2 && row<n && col>m && col<n) //row>1 row<n-1 col>m+1
                    {
                        System.out.print("  ");

                    }
                    else
                    {
                        System.out.print("* ");

                    }

                }
                
                
            }
            m = m-1; // m+1
            System.out.println();

        }
        
    }
    
}
