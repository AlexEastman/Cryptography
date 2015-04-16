
public abstract class Encrypter
{
    
    private int key; //public key
    
    public Encrypter(int publicKey) // sets the public key of the encrypter
    {
        key = publicKey;
    }
    
    public abstract String encryptString(String message); //encrypts a string
       
    public abstract int encryptNumber(int message); //encrypts an int
    
    public abstract int getPrivateKey();//determines private key value
   
    public String decryptString(String message) //calculates private key then decrypts
    {
        return decryptString(message,getPrivateKey());
    }
    
    public int getPublicKey()
    {
        return key;
    }
       
    public abstract String decryptString(String message, int privateKey); 
    //decrypts based off given private key 
      
    public abstract int decryptNumber(int message);
   
    public abstract int decryptNumber(int message, int privateKey);
    
    
    
}
