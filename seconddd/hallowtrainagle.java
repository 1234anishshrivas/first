package seconddd;

import javax.lang.model.util.ElementScanner14;

public class hallowtrainagle
 {
    public static void main(String[] args)
     {
        int n=5;
        hollowTriangle(n);
        
    }

    static void hollowTriangle(int n)
    {
        int row, col;
        int sp=1;
        for(row=1; row<=n; row++)
        {
            if(row == 1 || row<n)
            {
                for(col=1; col<=n; col++)
                {
                    System.out.print(" ");
                }

            }
            if(row == 1)
            {
                System.out.print("*");
            }

            else if( row>1&&row<n)
            {
                for(int k=1; k<=2; k++)
                {
                    System.out.print("* ");
                    for(int j=1; j<=sp; j++)
                    {
                        System.out.print(" ");

                    }

                }
                sp+=2;
            }

            else
            {
                for(int k=1; k<=n; k++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
