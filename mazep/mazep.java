
package mazep;

import java.util.ArrayList;

public class mazep
 {
    public static void main(String[] args) 
    {
        int n = 3; 
        int m = 3;
        ArrayList<String> ans = mazePath(0,0,n-1,m-1);
        System.out.println(ans);
        
    }
    public static ArrayList<String> mazePath(int sr, int sc, int dr, int dc)
    { //invalid case

        if(sr>dr || sc>dc)
        {
            return new ArrayList<>();
        }
        if(sr == dr && sc == dc)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }

        ArrayList<String> hor = mazePath(sr, sc+1, dr, dc);
        ArrayList<String> ver = mazePath(sr+1, sc, dr, dc);
        ArrayList<String> ans = new ArrayList<>();

        for(String s : hor)
        {
            ans.add("h"+s);
        }
        for(String s : ver)
        {
            ans.add("v"+s);
        }

        return ans;
        


    }

    
}
