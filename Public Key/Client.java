import java.util.Scanner;
public class Client
{
    /** description of instance variable x (add comment for each instance variable) */
    private Encrypter encrypt;
    private String message;
    private int publicKey;
    
    
    public Client()
    {
        
    }
    
    public void setPublicKey(int key)
    {
        publicKey = key;
        //encrypt = new Encrypter(key);
    }

    public void makeNewMessage()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter message for server");
        message = in.next();
    }
    
    public String getEncryptedMessage()
    {
        return encrypt.encryptString(message);
    }

}
