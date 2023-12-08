import seconddd.multiplication;

public class recursionsum 
{
    
    public static void main(String[] args) 
    // {
    //     int n = 3; // all number int 
    //     int ans = sum(n);
    //     System.out.println(ans);
        
    // }
    // public static int sum(int n)
    // {
    //     if(n==0)
    //     {
    //         return 0;
    //     }
    //     int faith = sum(n-1);
    //     return faith+n;
    // }




    // factorail use..
    // // public static void main(String[] args) 
    //  {
    //     int n = 5; // all number int 
    //     int ans = fact(n); //factorial(n)
    //     System.out.println(ans);
        
    // }
    // public static int fact(int n)
    // {
    //     if(n==1)
    //     {
    //         return 1;
    //     }
    //     int faith = fact(n-1);
    //     return faith*n;
    // }

    //power...
        //// public static void main(String[] args) 
    //   {
    //     int x = 2;
    //      int n = 5; // all number int 
    //      int ans = recursionsum(x,n); //factorial(n)
    //     System.out.println(ans);
        
    //  }
    //  public static int recursionsum(int x, int n)
    //  {
     
    //      if(n==0)
    //      {
    //         return 1;
    //     }
    //   int faith = recursionsum(x,n-1);
    //     return faith*x;
    //  }


    //powerlog..
     {
    //     int x = 2;
    //      int n = 5; // all number int 
    //      int ans = recursionsum(x,n);
    //     System.out.println(ans);
        
    //  }
    //  public static int recursionsum(int x, int n)
    //  {
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //   int faith = recursionsum(x,n/2); //2,5
    //   int ans = faith*faith;
      
    //      if(n%2 !=0)
    //      {
    //         ans = x;
    //     }

    //     return ans;
    //  }

    
    int arr[] = {1,12,3,4,5,};
    printA(arr,idx:0);

    public static void printA(int[] arr, int idx)
    {
        if(idx  == arr.length)
        {
            return;
        }
        System.out.println(arr[idx]+" ");
        printA(arr,idx+1);
    }

    }
}
