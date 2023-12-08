package seconddd;

public class pluspattern
 {
    public static void main(String[] args)
     {
        int n=5;
        int row, col;
        for(row=1; row<=n; row++)
        {
            for(col=1; col<=n; col++)
            {
                if(row == n/2+1 || col== n/2+1)
                {
                    System.out.print("* ");
              
                }
                else 
                {
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        } 
      }  
}
