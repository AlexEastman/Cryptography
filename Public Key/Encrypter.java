import java.math.BigInteger;
public abstract class Encrypter
{
    
    private long[] key; //public key
    
    
         /**
    * constructor, sets the public key
    *
    * @param public key   the public key of the public key cryptosystem
    * @return     the sum of x and y
    */

    public Encrypter(long[] publicKey) // sets the public key of the encrypter
    {
        key = publicKey;
    }
    
         /**
    * takes a string and encrypts it as a BigInteger
    *
    * @param  message   a string message to be encrypted
    * @return    a bigInteger representing the encrypted message
    */

    public abstract BigInteger encryptString(String message); //encrypts a string
       
         /**
    *  takes a big int and encrypts it
    *  
    * @param message   the number to be encrypted
    * @return     a big integer representing the encrypted message
    */

    public abstract BigInteger encryptNumber(BigInteger message); //encrypts an int
    
         /**
    * calculates private key based off public key
    *
    * 
    * @return      private key based of public key
    */

    public abstract long[] getPrivateKey();//determines private key value
   
    public String decryptString(BigInteger message) //calculates private key then decrypts
    {
        return decryptString(message,getPrivateKey());
    }
    
    public long[] getPublicKey()
    {
        return key;
    }
       
    public abstract String decryptString(BigInteger message, long[] privateKey); 
    //decrypts based off given private key 
      
    public BigInteger decryptNumber(BigInteger message)
    {
        return decryptNumber(message, getPrivateKey());
    }
   
    public abstract BigInteger decryptNumber(BigInteger message, long[] privateKey);
    
    
    
    
}
