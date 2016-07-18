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
public class iRadioTest {
    
    public iRadioTest() {
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
     * Test of OnOff method, of class iRadio.
     */
    @Test
    public void testOnOff() {
        System.out.println("OnOff");
        iRadio instance = new iRadioImpl();
        instance.OnOff();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOn method, of class iRadio.
     */
    @Test
    public void testIsOn() {
        System.out.println("isOn");
        iRadio instance = new iRadioImpl();
        boolean expResult = false;
        boolean result = instance.isOn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuency method, of class iRadio.
     */
    @Test
    public void testGetFrecuency() {
        System.out.println("getFrecuency");
        iRadio instance = new iRadioImpl();
        String expResult = "";
        String result = instance.getFrecuency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeFrecuency method, of class iRadio.
     */
    @Test
    public void testChangeFrecuency() {
        System.out.println("changeFrecuency");
        iRadio instance = new iRadioImpl();
        instance.changeFrecuency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStation method, of class iRadio.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        iRadio instance = new iRadioImpl();
        String expResult = "";
        String result = instance.getStation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Forward method, of class iRadio.
     */
    @Test
    public void testForward() {
        System.out.println("Forward");
        iRadio instance = new iRadioImpl();
        instance.Forward();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Backward method, of class iRadio.
     */
    @Test
    public void testBackward() {
        System.out.println("Backward");
        iRadio instance = new iRadioImpl();
        instance.Backward();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemory method, of class iRadio.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        int Position = 0;
        iRadio instance = new iRadioImpl();
        instance.setMemory(Position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ToString method, of class iRadio.
     */
    @Test
    public void testToString() {
        System.out.println("ToString");
        iRadio instance = new iRadioImpl();
        String expResult = "";
        String result = instance.ToString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class iRadioImpl implements iRadio {

        public void OnOff() {
        }

        public boolean isOn() {
            return false;
        }

        public String getFrecuency() {
            return "";
        }

        public void changeFrecuency() {
        }

        public String getStation() {
            return "";
        }

        public void Forward() {
        }

        public void Backward() {
        }

        public void setMemory(int Position) {
        }

        public String ToString() {
            return "";
        }
    }
    
}
