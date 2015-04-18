

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

    public int[][] generateKeys(int seed)
    {
        int[][] keys = {{seed},{seed}};
        return keys;
    }
    
  
}
