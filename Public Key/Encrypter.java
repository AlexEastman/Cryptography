
public abstract class Encrypter
{
    
    private int key; //public key
    
    public Encrypter(int publicKey) // sets the public key of the encrypter
    {
        key = publicKey;
    }
    
    public abstract String EncryptString(String message); //encrypts a string
       
    public abstract int EncryptNumber(int message); //encrypts an int
    
    public abstract int getPrivateKey();//determines private key value
   
    public abstract String DecryptString(String message); 
    //calculates private key then decrypts
       
    public abstract String DecryptString(String message, int privateKey); 
    //decrypts based off given private key 
      
    public abstract int DecryptNumber(int message);
   
    public abstract int DecryptNumber(int message, int privateKey);
    
    
    
}
