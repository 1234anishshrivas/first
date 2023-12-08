import java.util.*;
public class selection2 
{

    public static void printArray( int arr[])
    {
        for( int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
     {
        int arr[] = {5,6,7,8,2,1};
        for( int i = 0; i<arr.length-1; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }

        printArray(arr);
        
        
    }
    
}
