/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg8;

import hoja.de.trabajo4.Nodo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Temp
 */
public class NodoTest {
    
    public NodoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getValue method, of class Nodo.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Nodo instance = new Nodo();
        //int expResult = 0;
        int result = instance.getValue();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Nodo.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int _value = 0;
        Nodo instance = new Nodo();
        instance.setValue(_value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPadre method, of class Nodo.
     */
    @Test
    public void testGetPadre() {
        System.out.println("getPadre");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getPadre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPadre method, of class Nodo.
     */
    @Test
    public void testSetPadre() {
        System.out.println("setPadre");
        Nodo Padre = null;
        Nodo instance = new Nodo();
        instance.setPadre(Padre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoD method, of class Nodo.
     */
    @Test
    public void testGetHijoD() {
        System.out.println("getHijoD");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getHijoD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoD method, of class Nodo.
     */
    @Test
    public void testSetHijoD() {
        System.out.println("setHijoD");
        Nodo HijoD = null;
        Nodo instance = new Nodo();
        instance.setHijoD(HijoD);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoI method, of class Nodo.
     */
    @Test
    public void testGetHijoI() {
        System.out.println("getHijoI");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getHijoI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoI method, of class Nodo.
     */
    @Test
    public void testSetHijoI() {
        System.out.println("setHijoI");
        Nodo HijoI = null;
        Nodo instance = new Nodo();
        instance.setHijoI(HijoI);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Nodo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
//        Object other = null;
        Nodo instance = new Nodo();
        int expResult = 0;
  //      int result = instance.compareTo(other);
    //    assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Nodo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Nodo instance = new Nodo();
        //String expResult = "";
        String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Nodo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        //Object other = null;
        Nodo instance = new Nodo();
        boolean expResult = false;
        //boolean result = instance.equals(other);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}