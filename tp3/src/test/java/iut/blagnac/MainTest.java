package iut.blagnac;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainTest extends TestCase {
    public MainTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(MainTest.class);
    }

    public void testParametreVide() {
        assertEquals("Hello World!", Main.hello(null));
    }

    public void testParametreNonVide() {
        assertEquals("un paramètre", Main.hello("un paramètre"));
    }
}
