

/**
 * Write a description of class GenericKeyGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenericKeyGenerator extends KeyGenerator
{
    
    public GenericKeyGenerator()
    {
        
    }

    public int generatePrivateKey(int seed)
    {
        return seed;
    }
    
    public int generatePublicKey(int privateKey)
    {
        return privateKey;
    }
}
