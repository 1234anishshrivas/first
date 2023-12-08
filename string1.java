import java.util.*;
public class string1
 {
    public static void main(String[] args)
     {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        if(str1==str2)
        {
            System.out.println(" s1 and s2 are equal");
        }
        else
        {
            System.out.println(" s1 and s2 are unequal");
        }

        if(str1==str3)
        {
            System.out.println("s1 and s3 are equal");
        }
        else
        {
            System.out.println("s1 and s3 are unequal");
        }


        
    }
    
}
