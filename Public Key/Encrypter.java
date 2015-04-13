
public class Encrypter
{
    
    private int key;
    
    public Encrypter(int publicKey)
    {
        key = publicKey;
    }
    
    public String EncryptString(String message)
    {
        return message;
    }
    
    public int EncryptNumber(int message)
    {
        return message;
    }

    public int getPrivateKey()//determines private key value
    {
        return key;
    }
    
    public String DecryptString(String message)
    {
        return message;
    }
    
    public String DecryptString(String message, int privateKey)
    {
        return message;
    }
    
    public int DecryptNumber(int message)
    {
        return message;
    }
    
    public int DecryptNumber(int message, int privateKey)
    {
        return message;
    }
    
    
}
