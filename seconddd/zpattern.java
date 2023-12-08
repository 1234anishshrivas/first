package seconddd;

public class zpattern
 {
    public static void main(String[] args)
     {
        int n=5;
        int row, col;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=n; col++)
            {
                if(row == 1 ||  row == n || row+col == n+1 )
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
