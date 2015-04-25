import java.math.BigInteger;
import java.util.Scanner;
public class Client
{
    /** description of instance variable x (add comment for each instance variable) */
    private Encrypter encrypt;
    private String message;
    
     
    
    public Client()
    {
        
    }
    
     /**
    * sets the encrypter object, that contains the public key, to an instance variable
    * 
    * @param  the encrypter object made in the message exchange class
    * @return     void
    */
    public void setEncrypter( Encrypter encrypt)
    {
        this.encrypt = encrypt;
    }

    /**
    * prompts the user for a message to be encrypted
    *
    * @param  void
    * @return     void
    */

    public void makeNewMessage()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter message for server");
        message = in.next();
    }
    
         /**
    * encrypts the message 
    *
    * @pre makeNewMessage() has been called, setEncrypter() has been called
    * @return     a message encrypted based off the public key in the encrypter object
    */

    public BigInteger getEncryptedMessage()
    {
        return encrypt.encryptString(message);
    }

}

  