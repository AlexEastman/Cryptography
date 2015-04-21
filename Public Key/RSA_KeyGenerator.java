


public class RSA_KeyGenerator extends KeyGenerator
{
    public int[][] generateKeys(int seed)
    {
        int p = seed;
        int q = seed;
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
        int n = p*q;
        int t = (p-1)*(q-1);
        int e = 3;
        float dTemp = 1; // arbitrary such that its not an int also math class is weird and wont round doubles to ints
        int z = 0;
        int d = 0;
        while( Math.abs((dTemp - d)) > .00001)//check if dTemp is an int
        {
            z++;
            dTemp = (1+t*z)/e;
            d = Math.round(dTemp);
        }
        
        int[] publicKey = {n,e};
        int[] privateKey = {n,d};
        int[][] keys = {publicKey,privateKey};
        return keys;
        
    }
    
    private boolean checkPrime(int n) //simple helper method to check for primality
    {
        int rootN = (int)Math.pow(n,.5);
        for(int i = 3; i<rootN;i+=2) // iterates through odd numbers starting at 3 and up to N
        {
            if((n/i)*i==n) // checks if integer division was performed indicating not prime
            {
                return false;
            }
        }
        return true;
    }
    
 
}
