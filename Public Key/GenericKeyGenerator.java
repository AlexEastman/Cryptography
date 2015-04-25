

/**
 *generates 2 non functional keys
 * 
 * @author alex eastman 
 * @version 1
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
