
public class RSA_KeyGenerator extends KeyGenerator
{
    public long[][] generateKeys(long[] pq)
    {
        long p = pq[0];
        long q = pq[1];
        long n = p*q;
        long t = (p-1)*(q-1);
        long e = 17;
        double dTemp = 1; // arbitrary such that its not an int also math class is weird and won't round doubles to ints
        double z = 0;
        long d = 0;
        while( Math.abs((dTemp - d)) > .00001)//check if dTemp is an int
        {
            z++;
            dTemp = (1+t*z)/e;
            d = Math.round(dTemp);
        }
        
        long[] publicKey = {n,e};
        long[] privateKey = {n,d};
        long[][] keys = {publicKey,privateKey};
        return keys;
    }
}
