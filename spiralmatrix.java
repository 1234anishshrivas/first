import java.util.Scanner;
public class spiralmatrix
 {
    public static void main(String[] args) 
    {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        int a[][] = new int [n][m]; 

        int maxR = a.length-1;
        int minR = 0;
        int maxC = a[0].length-1;
        int minC = 0;
        int tn = a.length * a[0].length;
        int c = 0;


        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a.length; j++)
            {
                System.out.println(a[i][j]);
            }
        }

        while(c<tn)
        {

        //left border

        for(int i = minR,j = minC; i<=maxR; i++)
        {
            System.out.println(a[i][j]);
            c++;

        }
        minC++;
        

        //bottom border

        for(int j = minC,i=maxR; j<=maxC; j++)
        {
            System.out.println(a[i][j]);
            c++;
        }
        maxR--;

        
        //right border

        for(int i = maxR,j=maxC; i>=minR; i--)
        {
            System.out.println(a[i][j]);
            c++;

        }
        maxC--;

        //up border

        for(int i = minR,j=maxC; i<=minC; j--)
        {
            System.out.println(a[i][j]);
            c++;
        }
        minR++;

        
    }

}
    
       
    
}
