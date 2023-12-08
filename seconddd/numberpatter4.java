package seconddd;

public class numberpatter4
 {
    public static void main(String[] args)
     {
        int n=5; 
        int row, col, k;
        for(row=1; row<=n; row++)
        {
             k = 1;
            for(col=1; col<row; col++)
            {
                System.out.print( "");
            }
            for(col=1; col<=row; col++)
            {
                System.out.print(k++ + "");
            }
            for(col=1; col<row; col++)
            {
                System.out.print(k-- + "");
            }
            System.out.println();
        

        }   
        
    }
    
}

