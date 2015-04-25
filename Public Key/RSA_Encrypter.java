import java.math.BigInteger;
/**
 * Write a description of class RSA_Encrypter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RSA_Encrypter extends Encrypter
{
    
    /**
     * Default constructor for objects of class RSA_Encrypter
     */
    public RSA_Encrypter(long[] publicKey)
    {
        super(publicKey);
    }

    /**
     * method written by Bruce Schneier
     *
     * @pre     (m-1)^2 does not overflow , b,e, and m are all positive integers
     * @post    will return c | c≡b^e(mod(m)) 
     * @param   b: base of an exponent, e: exponent, m: modulus
     * @return  description of the return value
     */
    private long modular_pow(long b, long e, long m)
    {
        long result = 1;
        b = (b%m);
        while (e>0)
        {
            if(e%2==1)
            {
                result = (result*b)%m;
            }
            e = e>>1;
            b = (b*b)%m;
            
        }
        return result;
    }

    public BigInteger encryptString(String message)
    {
        byte[] bytes = message.getBytes();
        BigInteger integer = new BigInteger(bytes);
        BigInteger encrypt = encryptNumber(integer);
        return encrypt;
    }

    public BigInteger encryptNumber(BigInteger message)
    {
        long modulus = getPublicKey()[0];
        long exponent = getPublicKey()[1];
        return message.modPow(BigInteger.valueOf(exponent),BigInteger.valueOf(modulus)); 
    }
    
    public long[] getPrivateKey()
    {
        // first make a key gen object then write a method to factor pq into p and q
        // given pq find p and q then call generate keys function on the keygenerator object you created:)
        
        KeyGenerator keyGen = new RSA_KeyGenerator();
        long pq = getPublicKey()[0];
        long p = (long) (Math.pow(pq,.5)); //start factoring about the sqrt. of pq and work our way down.
        p += (p+1)%2; // ensure that p is odd if it is even add 1 so that it becomes odd
        p+=2; // since our loop starts by subtracting 2 this accounts for first guess correct situations
        double q = (double).5;
        
        
        while (Math.abs(q - Math.round(q))>.0000000001)
        {
            p-=2; // check next possible p down
            q = ((double)pq)/p;
        }
        long[] PQ = {p, Math.round(q)};
        return keyGen.generateKeys(PQ)[1];
        
    }
    
    public String decryptString(BigInteger message, long[] privateKey)
    {
        BigInteger decrypt = decryptNumber(message,privateKey);
        byte[] decryptedBytes = decrypt.toByteArray();
        String decryptedMessage = new String(decryptedBytes);
        return decryptedMessage;
    }
    
    public BigInteger decryptNumber(BigInteger message, long[] privateKey)
    {
        long modulus = privateKey[0];
        long exponent = privateKey[1];
        return message.modPow(BigInteger.valueOf(exponent),BigInteger.valueOf(modulus)); 
    }
    
}
