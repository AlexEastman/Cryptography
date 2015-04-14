

public class Server
{
    private int privateKey;
    private int publicKey;
    private KeyGenerator keyGen;
    
    
    
    
    public Server(int seedSize)
    {
        keyGen = new KeyGenerator();
        
        privateKey = keyGen.generatePrivateKey(makeRandomSeed(seedSize)); // makes a unique private key
        publicKey = keyGen.generatePublicKey(privateKey);
        
    }
    
    private int makeRandomSeed(int seedSize)
    {
        return (int)(Math.random() * seedSize);
    }
    
    public int getPublicKey()
    {
        return publicKey;
    }
    
    public void recieveMessage(String encryptedMessage)
    {
        Encryper encrypt = new Encrypter(publicKey);
        
        String message = encrypt.decryptString(encryptedMessage,privateKey);
        System.out.println("served recieved the following message: " + message);
        
    }
}
