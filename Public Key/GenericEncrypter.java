import java.math.BigInteger;
/**
 * Write a description of class GenericEncrypter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenericEncrypter extends Encrypter
{
    
    /**
     * Default constructor for objects of class GenericEncrypter
     */
    public GenericEncrypter(int[] publicKey)
    {
        super(publicKey);
    }
  
    public String encryptString(String message) //encrypts a string
    {
        return message;
    }
       
    public BigInteger encryptNumber( BigInteger message) //encrypts an int
    {
        return message;
    }
    
    public int[] getPrivateKey()//determines private key value
    {
        return super.getPublicKey();
    }
   
    public String decryptString(String message, int[] privateKey)
    {
        return message;
    }
   
    public BigInteger decryptNumber(BigInteger message)
    {
        return message;
    }
   
    public BigInteger decryptNumber(BigInteger message, int[] privateKey)
    {
        return message;
    }

}
