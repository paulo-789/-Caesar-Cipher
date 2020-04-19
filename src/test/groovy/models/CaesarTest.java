package models;

import junit.framework.TestCase;
import org.junit.Test;


public class CaesarTest extends TestCase {
    @Test
    public void newString_instantiatesCorectly() {
        String  testString = new String(boy,2);
        assertEquals(true, testString instanceof String);
    }
}