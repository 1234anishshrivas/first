package seconddd;

import javax.lang.model.util.ElementScanner14;

public class hallowtraingle
 {
    public static void main(String[] args)
     {
        int row, col;
        for(row=1; row<=5; row++)
        {
            if(row==1 || row<5)
            {

                for(col=1;col<=5-row;col++)
                {
                    System.out.print(" ");
                }
            }
            if(row==1)
            {
                System.out.print("*");
            }
            else if(row>1 && row<5)
            {
                for(col=1; col<=row; col++)
                {
                    System.out.print("*");
                }
            }
            else
            {for(col=1; col<=5; col++)
                {
                    System.out.print("*");
                }

            }

            
            System.out.println();
        }
    }
    
}
