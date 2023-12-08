package seconddd;

public class stringcode 
{
    public static void main(String[] args)
     {
        String s = "ANISH";
        int n1 = s.length();
        p1(n1,s);
        
    }
    static void p1(int n, String s)
    {
        int row, col, k;
        for(row=1, k=0; row<=n; row++, k++)
        {
            for(col=1; col<=row; col++)
            {
                System.err.print(s.charAt(k));
            }
            System.out.println();
        }
    }
    
}
