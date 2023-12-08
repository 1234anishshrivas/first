public class multiplicationbyleftdhift2
 {
    int m = 17;
    int n = 20;
    int count = 0;
    int result = 0;

    public static void main(String[] arg)
{
    multiplicationbyleftdhift2 obj = new multiplicationbyleftdhift2();
    obj.m = obj.m + obj.n;
    int m = 17;
    int n = 20;
    int count = 0;
    int result = 0;
    while (m>0) 
    {
        result = n<<count + result;
        
    }
    m = m/2;
    count++;
    System.out.println(result);
}
   
}
