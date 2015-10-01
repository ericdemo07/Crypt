package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncryptionMainTest 
{
	@Test
	public void testAESEncryption1() throws Exception {
		AESEncryptDecrypt encryption = new AESEncryptDecrypt();
		
		String data = "James Bond 007";
		String keyValue = "bestkey";
        
		String encoded = encryption.encrypt(data, keyValue);
        String decoded = encryption.decrypt(encoded, keyValue);
        
        assertEquals(decoded, "James Bond 007");
    }
}
