

public class Server
{
    private int[] privateKey;
    private int[] publicKey;
    private KeyGenerator keyGen;
    private Encrypter encrypt;
    
    public Server(int seedSize)
    {
        //keyGen = new KeyGenerator();
        //encrypt = new Encrypter(publicKey);
        int[][] keys = keyGen.generateKeys(generatePQ(seedSize));
        privateKey = keys[0]; // makes a unique private key
        publicKey = keys[1];
        
    }
    
    private int[] generatePQ(int seedSize)
    {
        int base = 1<<(seedSize-1); // 2^(seedSize-1)
        int seed = base + (int)( base*Math.random()); // generates a random number with n bits 
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
        int[] pq = {p,q};
        return pq;
    }
    
    public int[] getPublicKey()
    {
        return publicKey;
    }
    
    public void recieveMessage(String encryptedMessage)
    {
                
        String message = encrypt.decryptString(encryptedMessage,privateKey);
        System.out.println("served recieved the following message: " + message);
        
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
