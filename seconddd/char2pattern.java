package seconddd;

public class char2pattern
 {
    public static void main(String[] args)
     {
        int n=5;
        int row, col, k;
        
        for(row=1, k='A'; row<=n; row++, k++)
        {

            for(col=1; col<=row; col++)
            {
                System.out.print((char)k + " ");
            }
            System.out.println();

        }

        
    }
    
}
