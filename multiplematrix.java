import java.util.Scanner;
public class multiplematrix 
{
    public static void main(String[] args)
     {
        Scanner src = new Scanner(System.in);
        int r1 = src.nextInt();
        int c1 = src.nextInt();

        int a[][] = new int [r1][c1];
        
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a[0].length; j++)
            {
                a[i][j] = src.nextInt();

            }

        }

        Scanner src1 = new Scanner(System.in);
        int r2 = src.nextInt();
        int c2 = src.nextInt();

        int b[][] = new int [r1][c1];
        
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<b[0].length; j++)
            {
                a[i][j] = src.nextInt();

            }

        }

        Scanner src2 = new Scanner(System.in);
        int r3 = src.nextInt();
        int c3 = src.nextInt();

        int c[][] = new int [r1][c2];
        
        for(int i = 0; i<c.length; i++)
        {
            for(int j = 0; j<c[0].length; j++)
            {
                for(int k = 0; k<c1; k++)
                {
                   c[i][j]+= a[i][k]*b[k][j];
                }
            }

            System.out.println(c[i][j]+" ");

        }
        System.out.println();
      
    }
    
}
