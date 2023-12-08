public class fsd4 
{ 
    String name;
    int roll_no;
    int age;

    fsd4(String x, int y, int z)
    {
        name = x;
        roll_no = y;
        age = z;


    }
    public static void main(String a[])
    {
        fsd4 anish = new fsd4("anish",12,19);

        System.out.println(anish.name);
        System.out.println(anish.roll_no);
        System.out.println(anish.age);
    }
    
}
