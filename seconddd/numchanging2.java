package seconddd;

public class numchanging2
 {
    public static void main(String[] args)
     {
        int row, col;
        int i = 0;
        int n = 4;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=n-row+1; col++)
            {

                i =i+1;
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
    
}
