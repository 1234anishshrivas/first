public class may18bitwise
 {
    public static void main (String[] args)

 {

  int x = 0b1010;
    int y = 0b1101;
    int z = 13;

    System.out.println(x&y);
    System.out.println(x^y);
    System.out.println(~x);
    System.out.println(~y);
    System.out.println(~z);
    System.out.println(Integer.toBinaryString(x&y));
    System.out.println(Integer.toBinaryString(x^y));
    System.out.println(Integer.toBinaryString(~x));
    System.out.println(Integer.toBinaryString(~y));
}

 }





