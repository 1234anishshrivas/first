package seconddd;

public class lefttriangle 
{
    public static void main(String[] args)
     {
        int row, col;
        int n=5;
        int i;
        int m=n;
        for(row=1; row<=n; row++)
        {
            i=row;
            for(col=1; col<=n; col++)
            {
                if(col<m)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(i+"");
                    i=i-1;
                }
            }
            m=m-1;
            System.out.println();
        }
        
    }
    
}
