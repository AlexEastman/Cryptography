import java.math.BigInteger;

public class Hacker
{
    /** description of instance variable x (add comment for each instance variable) */
   
    private Encrypter encrypt;
    
    public Hacker()
    {
        
    }

    
         /**
    * simulates a hacker intercepting a message from a server
    *
    * @param  encryptedMessage      the message the hacker wishes to crack
    * @return     void
    */

    public void recieveMessage(BigInteger encryptedMessage)
    {
        System.out.println("beggining hacker decryption");
        String message = encrypt.decryptString(encryptedMessage);
        System.out.println("hacker cracked the following message: " + message);
        
    }
    
         /**
    * sets an encrypter to an instance variable
    *
    * @param  encrypt      the encrypter to set
    */

    public void setEncrypter( Encrypter encrypt)
    {
        this.encrypt = encrypt;
    }

}
 