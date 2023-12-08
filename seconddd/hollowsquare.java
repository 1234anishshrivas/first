package seconddd;

public class hollowsquare 
{
    public static void main(String[] args) 
    {
        int row,col;
        for(row=1;row<=5;row++)
        {
            if(row == 1 || row == 5)
            {
                for(col=1; col<=5; col++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("*       * ");

            }
            System.out.println();
           
 
            
        }
        
    }
    
}
