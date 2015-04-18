

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
        int[] keys = keyGen.generateKeys(makeRandomSeed(seedSize));
        privateKey = keys[0]; // makes a unique private key
        publicKey = keys[1];
        
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
