package seconddd;

import java.util.Scanner;

public class multiplication 
{public static void main(String[] arg)
    {

        Scanner sc=new Scanner(System.in);
        int x , y, sum = 0;
        System.out.println(12);
        x=sc.nextInt(); 
        System.out.println(13);
        y=sc.nextInt();

        for( int i=1;i<=x;i++ );
        {
            sum = sum + y;
        }
        System.out.println("The multiplication of "+x+" and "+y+" is: "+sum);

    }

    
}
