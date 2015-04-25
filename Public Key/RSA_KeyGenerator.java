
public class RSA_KeyGenerator extends KeyGenerator
{
    public int[][] generateKeys(int[] pq)
    {
        int p = pq[0];
        int q = pq[1];
        int n = p*q;
        int t = (p-1)*(q-1);
        int e = 17;
        float dTemp = 1; // arbitrary such that its not an int also math class is weird and won't round doubles to ints
        float z = 0;
        int d = 0;
        while( Math.abs((dTemp - d)) > .00001)//check if dTemp is an int
        {
            z++;
            dTemp = (1+t*z)/e;
            d = Math.round(dTemp);
        }
        
        int[] publicKey = {n,e};
        int[] privateKey = {n,d};
        int[][] keys = {publicKey,privateKey};
        return keys;
    }
}
