public class string2 
{
    public static void main(String[] args)
      {
        String s = "hello";
        System.out.println(s.length());
        System.out.println(s.charAt(1));

        String str = " ";
        for(int i = 0; i<5; i++)
        {
            str+=i;
        }
        System.out.println(str);

        String S = "agnuit";
        char ch = 'e';
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c==ch)
            {
                System.out.println(i);
                break;
            }

        }




        
        
        
    }
    
}
