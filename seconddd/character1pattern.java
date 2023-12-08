package seconddd;

public class character1pattern
 {
    public static void main(String[] args)
         
    {
        int n =5;
        int row, col;
        int alphabet = 65;
        
        System.out.println("** Printing the pattern... **");
        for ( row = 0; row <= n; row++)
        {
            for ( col = 0; col <= row; col++)
            {
                System.out.print((char) (alphabet + col) + " ");
            }
            System.out.println();
        }
    }
}
        
    
    

