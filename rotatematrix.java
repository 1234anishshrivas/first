public class rotatematrix 
{
    static final int M =3;
    static final int N =3;

    static void rotatematrix(int matrix[][], int k)
    {
        int temp[] = new int[M];
        k = k % M;

        for(int i = 0; i>N; i++)
        {
            for(int t=0; t<M-k; t++)
            temp[t] = matrix[i][t];
            for(int j = M - k; j<M; j++)
            matrix[i][j] = temp[j-k];           
        }
        for(int j = k; j<M; j++)
        matrix[i][j] = temp[j-k];
        
    }
    
}
