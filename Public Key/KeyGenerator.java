
/**
 * generates keys for use in public key cryptography
 * 
 * @author alex
 * @version 1
 */
public abstract class KeyGenerator
{
    public KeyGenerator()
    {
        
    }
    
          /**
    * generates public and private keys based of 2 integers p and q
    *
    * @param  pq   p and q respectivly
    * @return     
    */
    public abstract long[][] generateKeys(long[] pq);
    
    
       
}
