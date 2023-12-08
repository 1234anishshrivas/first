package seconddd;

public class capture 

// FIRST APPROACH

{
    public static void main(String[] arg)
    {
        int n = 137; //10001001
        int m = 19; //00010011
        int i = 2;
        int j = 6;
        int capturemask = (1<<i)-1;
        int clearmask = (-1<<(j+1)); 
        int capture = n&capturemask;

        n&=clearmask;
        m<<=i;
        n|=m;
        n|=capture;
        System.out.println(n);

    }
    
}
// SECOND APPROACH
// int n = 137;
// int m = 19;
// int i =3;
// int j = 7;
// int result = n|m<<(i-1);
// System.out.println(result);


