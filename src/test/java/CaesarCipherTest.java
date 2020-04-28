import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest  {
@Test
    public void  encryptText_instantiatesCorrectly_String(){
    CaesarCipher testEncryptText = new CaesarCipher("attack",4);
     assertEquals("attack",testEncryptText.getPlainText());
    }

    @Test
    public void encryptText_key_Integer(){
    CaesarCipher testEncryptText = new CaesarCipher("attack",4);
    assertEquals(4,testEncryptText.getShiftKey());
    }
    @Test
    public  void encryptText_in_StringBuider(){
    CaesarCipher textEncryptText =new CaesarCipher("attack",4);
    assertEquals("exxego",textEncryptText.EncryptText());
    }
    @Test
    public  void  encryptText_decipher_String(){
    CaesarCipher testEncryptText = new CaesarCipher("exxego",4);
    assertEquals("attack",testEncryptText.DecryptText());
    }
}