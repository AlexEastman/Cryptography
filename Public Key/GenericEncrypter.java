import java.math.BigInteger;
/**
 * this generic encrypter will behave like a message system where nothing is encrypted
 * 
 * @author alex eastman
 * @version 2
 */
public class GenericEncrypter extends Encrypter
{
    
    /**
     * Default constructor for objects of class GenericEncrypter
     */
    public GenericEncrypter(long[] publicKey)
    {
        super(publicKey);
    }
  
    public BigInteger encryptString(String message) //encrypts a string
    {
        byte[] bytes = message.getBytes();
        BigInteger integer = new BigInteger(bytes);
        return integer;
    }
       
    public BigInteger encryptNumber( BigInteger message) //encrypts an int
    {
        return message;
    }
    
    public long[] getPrivateKey()//determines private key value
    {
        return super.getPublicKey();
    }
   
    public String decryptString(BigInteger message, long[] privateKey)
    {
        byte[] bytes2 = message.toByteArray();
        
        String message2 = new String(bytes2);
        return message2;
    }
   
    public BigInteger decryptNumber(BigInteger message)
    {
        return message;
    }
   
    public BigInteger decryptNumber(BigInteger message, long[] privateKey)
    {
        return message;
    }

}
