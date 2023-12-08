import java.io.*;
import java.util.*;
public class arraylist
 {
    public static void main(String[] args)
     {
        // intialise the value aof arraylist
        ArrayList<Integer> a = new ArrayList<>();
        // a.add(10);
        // a.add(20);
        // a.add(30);
        // a.add(40);
        // a.add(50);
        // System.out.println(a);
        // System.out.println(a.size());
        // a.add(2,100);
        // System.out.println(a);
        // a.get(3);
        // System.out.println(a.get(2)); // element show in single element..
        // System.out.println(a.get(3));
        // a.set(4,200); // set and replace the value in element...
        // a.set(3,800);
        // System.out.println(a);
        // a.remove(1); // removing a element.
        // a.remove(2);
        // System.out.println(a);

        // a.add(10); // removing odd elements...
        // a.add(20);
        // a.add(6);
        // a.add(1);
        // a.add(9);
        // a.add(80);
        // a.add(90);
        // a.add(101);
        // a.add(102);
        // a.add(103);
        // for(int i = 0; i<a.size(); i++)
        // {
        //     if(a.get(i)%2 == 1)
        //     {
        //         a.remove(i);
        //         i--;
        //     }
        // }
        // System.out.println(a);

        a.add(1); // arraylist reverse elements...
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
       
        int i = 0;
        int j = a.size()-1;
        while(i<j)
        {
            int ele1 = a.get(i);
            int ele2 = a.get(j);
            a.set(i, ele2);
            a.set(j, ele1);
            i++;
            j--;

        }
        System.out.println(a);
        
       
    }
    
}
