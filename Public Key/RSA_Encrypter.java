

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
    public RSA_Encrypter(int publicKey)
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
    private int modular_pow(int b, int e, int m)
    {
        int result = 1;
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

    public String encryptString(String message)
    {
        byte[] bytes = message.getBytes();
        
    }

}
