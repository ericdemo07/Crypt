package aesUsingCipherclass;

public class EncryptionMain 
{	
	public static void main(String...args)
	{
		AESEncryptDecrypt encryption = new AESEncryptDecrypt();
		
		String data = new String("James Bond 007");		//Data can be of any length
		String keyvalue = new String("bestkey");				
	
		/*Key has to be a string of length 7, it will give 128 bit encryption
		 *  (16*8)
		 */
		System.out.println("Str len : "+keyvalue.length());
		try
		{
			String encryptedData = encryption.encrypt(data,keyvalue);
			System.out.println("Encrypted Data : "+encryptedData);

			String decryptedData = encryption.decrypt(encryptedData,keyvalue);
			System.out.println("Derypted Data : "+decryptedData);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
