import java.math.BigInteger;
/**
 * this class shows hows byte conversion between bigint and strings may result in different bytes but still have the same value when reverse translated
 * 
 * @author alex
 * @version 1
 */
public class test
{
    public static void main(String[] args)
    {
        String message = "hi there my name is alex and i like applesauce if you like applesauce as well i suggest you wait in line, there are about 13 other people in the line so it might take a while!";
        byte[] bytes = message.getBytes();
        System.out.println("bytes: " + bytes);
        BigInteger integer = new BigInteger(bytes);
        System.out.println("bigInt: " + integer);
        byte[] bytes2 = integer.toByteArray();
        System.out.println("bytes2: " + bytes2);
        String message2 = new String(bytes2);
        System.out.println("message2: " + message2);
    }
}
