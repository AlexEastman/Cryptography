import java.math.BigInteger;

/**
 * This class will simulate a message exchange between a server and a client with 
 * a malicious hacker attempting to intercept the message
 * 
 * @author Alex Eastman
 * @version (a version number or a date)
 */
public class MessageExchange
{
    public static void main(String[] args)
    {
        Server server = new Server(20); // creates the server 
        Client client = new Client(); // the client
        Hacker hacker = new Hacker(); // and the hacker
         
        KeyGenerator keygen = new RSA_KeyGenerator();
        server.setKeyGenerator(keygen);
        
        long[] publicKey = server.getPublicKey();
        Encrypter encrypt = new RSA_Encrypter(publicKey);
        
        client.setEncrypter(encrypt);
        hacker.setEncrypter(encrypt);
        server.setEncrypter(encrypt);
        
        client.makeNewMessage();
        BigInteger encryptedMessage = client.getEncryptedMessage();
        System.out.println("message encrypted as:" + encryptedMessage);
        
        server.recieveMessage(encryptedMessage);
        hacker.recieveMessage(encryptedMessage);
    }

    
}

