import java.util.Scanner;
public class printwave 
{
    public static int R = 5;
    public static int C = 4;
    public static void printwave(int n, int m, int arr [][])
    {
        for(int j = 0; j<n; j++)
        {
            if(j%2==0)
            {
               for(int i = 0; i<m; i++)
               {
                 System.out.print(arr[i][j]+ " ");
               }
            }

            else 
            {
                for(int i = m-1; i>0; i--)
                {
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }

    }
    public static void main(String[] args)
     {
        int [][]arr = {{5,4,3,2},
         {1,2,3,4},
         {9,8,7,6},
         {9,6,7,5},
         {5,6,4,3},
        };
         
        printwave(R, C, arr);
        
    }

    
}
