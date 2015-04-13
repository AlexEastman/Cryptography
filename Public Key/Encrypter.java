
public abstract class Encrypter
{
    
    private int key;
    
    public Encrypter(int publicKey)
    {
        key = publicKey;
    }
    
    public abstract String EncryptString(String message);
       
    public abstract int EncryptNumber(int message);
    
    public abstract int getPrivateKey();//determines private key value
   
    public abstract String DecryptString(String message);
       
    public abstract String DecryptString(String message, int privateKey);
      
    public abstract int DecryptNumber(int message);
   
    public abstract int DecryptNumber(int message, int privateKey);
    
    
    
}
