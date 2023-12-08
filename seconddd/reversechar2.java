package seconddd;

public class reversechar2
 {
    public static void main(String[] args)
     {
        
    int n=5;
        int row, col, k;
        
        for(row=1, k='A'; row<=n; row++, k++)
        {

            for(col=row; col<=n; col++)
            {
                System.out.print((char)k + " ");
            }
            System.out.println();

        }
    
}

}

