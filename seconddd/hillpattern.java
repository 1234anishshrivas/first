package seconddd;

public class hillpattern 
{
    public static void main(String[] args) 
    {
        int n=5;
        int row, col;
        for(row=1; row<=n; row++)
        {
            for(col=row; col<=n; col++)
            {
                if(row == row ||  col == 1 || col == 1)
                {

                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
           
        }
        
       
    }
}