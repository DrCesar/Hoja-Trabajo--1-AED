/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadioPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wadeowen
 */
public class iBotonTest {
    
    public iBotonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Push method, of class iBoton.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        iBoton instance = new iBotonImpl();
        String expResult = "";
        String result = instance.Push();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hold method, of class iBoton.
     */
    @Test
    public void testHold() {
        System.out.println("Hold");
        iBoton instance = new iBotonImpl();
        instance.Hold();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class iBotonImpl implements iBoton {

        public String Push() {
            return "";
        }

        public void Hold() {
        }
    }
    
}
