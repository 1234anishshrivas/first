public class classwork2
 {
    public static void main(String[] arg)
    {
        int decimal = 12;
        int Binary;
        for(int i =7 ; i>0; i--)
        {
            Binary = 1<<(-i) & decimal;
            Binary = Binary!=0?1:0;
            System.out.print(Binary);
        }

    }
    
}
