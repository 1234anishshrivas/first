package seconddd;

public class allapatern2
 {
    public static void main(String[] args)
     {
        int n=5;
        int row, col;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=n; col++)

            if(row == 1 || row==5)
            {
                System.out.print("* ");
            }
            else 
            {
                System.out.print("    ");
            }
            
            System.out.println();
        }
        
    }
    
}


        
    
    

