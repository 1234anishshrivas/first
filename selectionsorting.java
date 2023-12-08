import java.util.*;
public class selectionsorting 
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
        int arr[] = { 2, 1, 3, 8, 7};
        for( int i = 0; i<arr.length-1; i++)
        {
            int smallest = i;

            for( int j = 0; j<arr.length; j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j;

                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        printArray(arr);
        
        
    }
    
}
