package seconddd;

public class numberchangingpyramid 
{
    public static void main(String[] args)
     {
        int row, col;
        int n=5;

        for(row=n; row>=1; row--) //row=1; row<=n; row++ main pattern
        {
            for(col=row; col<2*row;col++)
            {
                System.out.print(col+" "  );
            }
            System.out.println();
        }        
    }
}
