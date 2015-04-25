import java.math.BigInteger;

public class Server
{
    private long[] privateKey;
    private long[] publicKey;
    private KeyGenerator keyGen;
    private Encrypter encrypt;
    private long seedSize;
    
         /**
    * constructor that sets the seed size for the random key generated
    *
    * @param  seedSize the number of bits in both of the factors of the public and private key modulus
    * 
    */

    public Server(long seedSize)
    {
        this.seedSize = seedSize;
        
    }
    
         /**
    * sets the keyGenerator to an instance variable
    *
    * @param  keygen    the key generator object, this is just for a data type not an actual object
    * @return     void
    */

    public void setKeyGenerator(KeyGenerator keygen)
    {
        this.keyGen = keygen;
        long[][] keys = keyGen.generateKeys(generatePQ(seedSize));
        publicKey = keys[0]; // makes a unique private key
        privateKey = keys[1];
        
    }
    
         /**
    * sets the encrypter object
    *
    * @param  encrypt   an encrypter object
    * @return     void
    */

    public void setEncrypter(Encrypter encrypt)
    {
        this.encrypt = encrypt;
    }
    
         /**
    * randomly generates 2 primes that are near a given key length 
    *
    * @param  seedSize the lenght (in bits) of p and q
    * @return    p and q such that they are prime and have bit length seedSize
    */

    private long[] generatePQ(long seedSize)
    {
        long base = 1<<(seedSize-1); // 2^(seedSize-1)
        long seed = base + (long)( base*Math.random()); // generates a random number with n bits 
        long p = seed;
        long q = seed;
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
        long[] pq = {p,q};
        return pq;
    }
    
         /**
    * simple accessor method
    *
    * @param  void
    * @return   the public key of the server
    */

    public long[] getPublicKey()
    {
        return publicKey;
    }
    
         /**
    * A method that simulates recieving a message from a client
    *
    * @param  encryptedMessage     an encrypted message from the server
    * @return     void
    */

    public void recieveMessage(BigInteger encryptedMessage)
    {
                
        String message = encrypt.decryptString(encryptedMessage,privateKey);
        System.out.println("server recieved the following message: " + message);
        
    }
    
         /**
    * helper method for checking primality of a number
    *
    * @param n   number to check primality
    * @return  whether or not it is prime 
    */

    private boolean checkPrime(long n) //simple helper method to check for primality
    {
        long rootN = (long)Math.pow(n,.5);
        for(long i = 3; i<rootN;i+=2) // iterates through odd numbers starting at 3 and up to N
        {
            if((n/i)*i==n) // checks if integer division was performed indicating not prime
            {
                return false;
            }
        }
        return true;
    }
    
}
