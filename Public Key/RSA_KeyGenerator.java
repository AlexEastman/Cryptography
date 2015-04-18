


public class RSA_KeyGenerator
{
    
    public int[][] generateKeys(int seed)
    {
        int p,q = seed;
        p+=(seed%2)+1;
        q-=(seed%2)+1;
        
        while(!checkPrime(p))
        {
            p+=2;
        }
        
        while(!checkPrime(q))
        {
            q-=2;
        }
        
        
    }
    
    private boolean checkPrime(int n)
    {
        int rootN = (int)Math.pow(n,.5);
        for(int i = 3; i<rootN;i+=2)
        {
            if((n/i)*i==n)
            {
                return true;
            }
        }
        return false;
    }
    
   

}
