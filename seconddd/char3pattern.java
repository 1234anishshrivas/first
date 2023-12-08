package seconddd;

public class char3pattern
 {
    public static void main(String[] args)
     {
     
        int n=5;
        int row, col, k;
        for(row=1, k='z'; row<=n; row++, k++)
        {
            for(col=row; col<=n; col++)
            {
                System.out.print( " ");
            }
            for(col=1; col<=row; col++)
            {
                 System.out.print((char)k++ + " ");

            }
            for(col=1; col<=row; col++)
            {
                System.out.print((char)k + " ");
            }
            System.out.println();
           
        }
    
}

 }
