public class may11

{
    // declaring instance variable
    int a;
    int b;
    char c;

    may11()
    {

        a = 2;
        b = 45;
        c = 'a';


    }

    public static void main(String a[])
    {

        int b = 34;
        char c = 'S';
        System.out.println(b);
        
       may11 obj = new may11();
       obj.a = obj.a + obj.b;
       System.out.println(obj.a);
    }
}
