import java.util.Scanner;
public class spiralpattern 
{
    public static void spiralpattern(int m,int n, int a[][])
    {
       int i, k=0, l=0;             // k - starting row index, m-ending row index, l- starting col index, n-ending col index, i-iterator, 

       
       while(k<m && l<n)
       { 
        for( i=l; i<n; i++)
        {
             System.out.print(a[k][i]+" ");

        }
        k++;

        for( i=k; i<m; i++)
        {
            System.out.print(a[i][n-1]+" ");
        }
        n--;

        if(k<m)
        {
            for( i=n-1; i>=1; i--)
            {
                System.out.print(a[m-1][i]+" ");
            }
            m--;
        }

        if(l<n)
        {
            for(i=m-1; i>=k; i--)
            {
                System.out.print(a[i][l]+" ");
            }
            l++;
        }

       }
    }

    public static void main(String[] args)
     {
        int row = 3;
        int col = 5;

        int arr[][] = {{2,3,4,5,6},{11,12,13,14,15},{98,97,96,95,94}};

        spiralpattern(row, col, arr);


        
    }

    
}
