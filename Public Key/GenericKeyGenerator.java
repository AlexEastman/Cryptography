

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

    public long[][] generateKeys(long[] pq)
    {
        long[][] keys = {{pq[0]},{pq[1]}};
        return keys;
    }
    
  
}
