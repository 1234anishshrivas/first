package seconddd;

public class zeronetriangle 
{public static void main(String[] args)
     {
        int n=5;
        int row, col;
        for(row=1; row<=n; row++)
        {
            for(col=row; col<2*row; col++)
            {
                System.out.print((col%2+ " "));
            }
            System.out.println();
        }
    
}
    
}
