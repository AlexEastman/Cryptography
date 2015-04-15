

public class Server
{
    private int privateKey;
    private int publicKey;
    private KeyGenerator keyGen;
    private Encrypter encrypt;
    
    public Server(int seedSize)
    {
        //keyGen = new KeyGenerator();
        //encrypt = new Encrypter(publicKey);
        
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
                
        String message = encrypt.decryptString(encryptedMessage,privateKey);
        System.out.println("served recieved the following message: " + message);
        
    }
}
