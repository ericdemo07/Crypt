package aesUsingCipherclass;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


class AESEncryptDecrypt
{
	private static final String EncryptionAlgo = "AES";   //Algorithm for Encryption i.e. AES, Blowfish

	public  String encrypt(String Data, String keyValue) throws Exception 
    {
        Key key = generateKey(keyValue);
        System.out.println("Key :"+key);
        Cipher c = Cipher.getInstance(EncryptionAlgo);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        final String encoded = Base64.getEncoder().encodeToString(encVal);
        return encoded;
    }
    public  String decrypt(String encryptedData, String keyValue) throws Exception
    {
        Key key = generateKey(keyValue);
        System.out.println("Key :"+key);
        Cipher c = Cipher.getInstance(EncryptionAlgo);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = Base64.getDecoder().decode(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
    private static Key generateKey(String keyValueAsString) throws Exception 
    {
    	byte[] keyValue = keyValueAsString.getBytes("UTF_16");
    	System.out.println(keyValue.length);
        Key key = new SecretKeySpec(keyValue, EncryptionAlgo);
        return key;
    }
}
