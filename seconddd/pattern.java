package seconddd;

public class pattern
 {
    static void pattern(int n) 
    {
        
        int row, col;
        for(row=1;row<=n;row++);
        {

            for(col=1;col<=n-(row-1);col++);
            {
                System.out.println("* ");
            }

        }
        System.out.print(n);

    }

    
}
