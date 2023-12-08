public class classwork3
 {
    public static void main(String[] arg)
    {
        int decimal = 12;
        int Binary;

        for( int i = 0 ; i<=7; i++)
        {
            Binary = 128>>i & decimal;
            Binary = Binary!=0?1:0;
            System.out.print(Binary);
        }
    }
    
}
