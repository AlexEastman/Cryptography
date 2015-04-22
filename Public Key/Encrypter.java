import java.math.BigInteger;
public abstract class Encrypter
{
    
    private int[] key; //public key
    
    public Encrypter(int[] publicKey) // sets the public key of the encrypter
    {
        key = publicKey;
    }
    
    public abstract String encryptString(String message); //encrypts a string
       
    public abstract BigInteger encryptNumber(BigInteger message); //encrypts an int
    
    public abstract int[] getPrivateKey();//determines private key value
   
    public String decryptString(String message) //calculates private key then decrypts
    {
        return decryptString(message,getPrivateKey());
    }
    
    public int[] getPublicKey()
    {
        return key;
    }
       
    public abstract String decryptString(String message, int[] privateKey); 
    //decrypts based off given private key 
      
    public BigInteger decryptNumber(BigInteger message)
    {
        return decryptNumber(message, getPrivateKey());
    }
   
    public abstract BigInteger decryptNumber(BigInteger message, int[] privateKey);
    
    
    
    
}
