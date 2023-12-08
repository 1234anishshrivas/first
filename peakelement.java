public class peakelement
 {
    public static void main(String[] args)
     {
        int s[] = {16,28,21,15,17,14};
        int n = s.length;
        int x = 0;
        peak(s,n);
       
    }
     static int peak(int s[], int n)
     {
        if(n == 1)
        {
            return 0;
        }

        if(s[0]>=s[1])
        {
            System.out.print(0);
        }
        if(s[n-1]>=s[n-2])
        {
            System.out.print(n-1 + " ");
        }

        for(int i = 1; i<n-1; i++)
        {
            if(s[i]>=s[i-1] && s[i]>=s[i+1])
            {
                System.out.print(i + " ");
            }
        }

        return 0;


     }
    
}
