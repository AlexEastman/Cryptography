
/**
 *generaes 
 * 
 * @author alex eastman 
 * @version 1
 */
public class RSA_KeyGenerator extends KeyGenerator
{
    public long[][] generateKeys(long[] pq)
    {
        long p = pq[0];
        long q = pq[1];
        long n = p*q; // public and private modulus
        long t = (p-1)*(q-1); // this is eulers totient function of pq
        long e = 17; // public exponent
        double dTemp = 1; 
        double z = 0;
        long d = 0;
        
        //super sketch method of calculating modular multiplicative inverse
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
