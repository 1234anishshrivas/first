package seconddd;

public class hilltriangle 
{
    public static void main(String[] args) 
    {
    
        int n=5;
        int row, col;
        for(row=1; row<=n; row++)
        {
            
            for(col=row; col<=n; col++)
            {
                System.out.print(" ");
            }
            for(col=1; col<=row; col++)
            {
                System.out.print( "A ");
            }
            System.out.println();
     }
    }
        
    }
    

