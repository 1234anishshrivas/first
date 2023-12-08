package seconddd;

public class binarystring
 {
    public static void main(String[] arg)
    {
        int n =54;
        int k =7;
        int mask=~(1<<k-1);
        
        int value1= -1<<k;
        int value2= (1<<(k-1))-1;
        mask = ~(value1 | value2);
        int result = (mask | n);
        System.out.println(Integer.toBinaryString(result));

    }
    
}
