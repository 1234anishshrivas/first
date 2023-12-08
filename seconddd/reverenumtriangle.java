package seconddd;

public class reverenumtriangle
 {
    public static void main(String[] args) 
    {
        int row, col;
        int n=4;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<row; col++)
            {
                System.out.print(" ");
            }
            for(col=row; col<=n; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
        for(row = n-1; row>=1; row--)
        {
            for(col=1; col<row; col++)
            {
                System.out.print(" ");
            }
            for(col=row; col<=n; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    
}
