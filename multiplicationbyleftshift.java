public class multiplicationbyleftshift
 {  
    public static void main(String[] arg)
    {
        int m = 17;
        int n = 20;
        int count = 0;
        int result = 0;
while (m>0)
 {    if ((m%2) == 1)
    {
        result = n<<count * result;
    }
    m = m/2;
    count++;
    System.out.println(result);
    }
    
}

    
}
