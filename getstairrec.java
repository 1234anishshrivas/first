import java.util.ArrayList;

// public class getstairrec
// { 
//     public static void main(String[] args) 
//     {
//         int n = 4;
//         ArrayList<String> paths = getPath(n);
//         System.out.println(paths);
//     }
    // public static ArrayList<String> getPath(int n)      // First approach....
    // {
    //     if(n<=0)
    //     {
    //         ArrayList<String> base = new ArrayList<>();
    //         if(n==0)
    //         {
    //             base.add("");
    //         }
    //         return base; 
            
    //     }

    //     ArrayList<String> path1 = getPath(n-1);
    //  ArrayList<String> path2 = getPath(n-2);
    //  ArrayList<String> path3 = getPath(n-3);
    //  ArrayList<String> myPath = new ArrayList<>();
    //  for(String s : path1)
    //  {
    //     myPath.add("1"+s);

    //  }
    //  for(String s : path2)
    //  {
    //     myPath.add("2"+s);
    //  }
    //  for(String s : path3)
    //  {
    //     myPath.add("3"+s);
    //  }
    //  return myPath;

  
public class Solution {
    public static void setZeros(int matrix[][])
     {
         ArrayList<String> collect = new ArrayList<>();
         getSS(str , " " , collect);
         collect.remove(0);
         return collect;
     }

     public static void getSS(String str, String ans, ArrayList<String> collect)
     if(str.length()==0)
     {
         collect.add(ans);
         return;
     }
     char ch = str.charAt(0);
     String ros = str.substring(1);

     getSS(str, ans, collect);
     getSS(str, ans, collect);
}



    }  
    




     

