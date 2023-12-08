public class recursion2
 {
    public static void main(String[] args)
    //  {
    //     int arr[] = {1,2,3,4,5};  //print te element.. to recursion..
    //     printA(arr,0);
        
    // }
    // public static void printA(int [] arr, int idx)
    // {
    //     if(idx == arr.length)
    //     {
    //         return;
    //     }
    
    // System.out.println(arr[idx]+" ");
    // printA(arr , idx+1);
    {
        int arr[] = {1,3,4,5};
        int faith = sum(arr,idx+1);
        printA(arr,0);
    }
    public static void printA(int arr[], int idx)
    {
        if(idx == arr.length)
        {
            return 0;
        }
    }

    }

