/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg8;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Temp
 */
public class ClasificarTest {
    
    public ClasificarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of clasificarCadena method, of class Clasificar.
     */
    @Test
    public void testClasificarCadena() {
        System.out.println("clasificarCadena");
        String cadena = "asdfg";
        Clasificar instance = new Clasificar("asdfg");
        instance.clasificarCadena(cadena);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ordenar method, of class Clasificar.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        Clasificar instance = new Clasificar("asfaads");
        instance.ordenar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of codificar method, of class Clasificar.
     */
    @Test
    public void testCodificar() {
        System.out.println("codificar");
        Clasificar instance = new Clasificar("asfaads");
        instance.codificar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Clasificar.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Clasificar instance = new Clasificar("aaasdfasdf");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}