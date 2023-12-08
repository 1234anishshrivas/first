package seconddd;

public class june10
 {
    public static void main(String[] arg)
    {
        int n = 0b00010110;
        int lb = 3;
        int ub = 5;
        int mask=(-1<<(lb-1))^(-1<<ub);
        int result = mask & n;
        int mask1 = 0b100000000;

        for(int i = 0; i<8; i++)
        {
            int x1 = (result & mask1)==0 ? 0:1;
            System.out.print(x1);
            mask1=mask1>>1;
        }
    }
}
