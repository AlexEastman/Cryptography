

public abstract class KeyGenerator
{
    public KeyGenerator()
    {
        
    }
    
    public abstract int generatePrivateKey(int seed);
    
    public abstract int generatePublicKey(int privateKey);
       
}
