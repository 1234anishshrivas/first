package seconddd;

public class infiniteforloop
 {
    public static void main(String[] args)
     {
        int i ;

        for( i=0; i<9; i++) //single line *

       // for( i=9; i>0; i++) // infinite forloop
        {

            if(i==4)
            {
                break;
            }
            System.out.print("*");
        }

        System.out.println("for loop exit");
        
        
    }
    
    //for(int j = 0; j<9; j++)
   // {
   // if(j==4)
   // {
     //   break; // break aa; //levelling..  //stopping...
   // }

   // system.out.print("*")

   // }
  // System.out.println();
}
