public class constructor1 {
    
     int age;
     String name;
    
     public constructor1()
     {
         age = 18;
         name = "anish";
     }
    
        public static void main(String args[])
        {
        constructor1 obj1 = new constructor1();
        
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        }

}
