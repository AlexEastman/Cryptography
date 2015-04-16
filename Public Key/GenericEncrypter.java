

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
    public GenericEncrypter(int publicKey)
    {
        super(publicKey);
    }
  
    public String encryptString(String message) //encrypts a string
    {
        return message;
    }
       
    public int encryptNumber(int message) //encrypts an int
    {
        return message;
    }
    
    public int getPrivateKey()//determines private key value
    {
        return super.getPublicKey();
    }
   
    public String decryptString(String message, int privateKey)
    {
        return message;
    }
   
    public int decryptNumber(int message)
    {
        return message;
    }
   
    public int decryptNumber(int message, int privateKey)
    {
        return message;
    }

}
