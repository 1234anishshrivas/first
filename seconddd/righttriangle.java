package seconddd;

public class righttriangle
 {
    public static void main(String[] args)
     {
        int row,col;
        int n=5;
    
        int  i = 1;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=row; col++)
            {
                System.out.print(i);
                i++;
                

            }
            System.out.println();
        }

    }
    
}
