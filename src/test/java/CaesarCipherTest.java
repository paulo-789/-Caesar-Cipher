import junit.framework.TestCase;
import org.junit.Test;

public class CaesarCipherTest extends TestCase {
@Test
    public void  EncryptText_instantiatesCorrectly(){
    EncryptText testEncryptText = new EncryptText("attack",4);
     assertEquals(true,testEncryptText instanceof EncryptText );
    }
}