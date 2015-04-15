

public class Hacker
{
    /** description of instance variable x (add comment for each instance variable) */
    private int publicKey;
    private Encrypter encrypt;
    
    public Hacker()
    {
        
    }

    public void recieveMessage(String encryptedMessage)
    {
        System.out.println("beggining hacker decryption");
        String message = encrypt.decryptString(encryptedMessage);
        System.out.println("hacker cracked the following message: " + message);
        
    }
    
    public void setPublicKey(int key)
    {
        publicKey = key;
        //encrypt = new Encrypter(key);
    }

}
