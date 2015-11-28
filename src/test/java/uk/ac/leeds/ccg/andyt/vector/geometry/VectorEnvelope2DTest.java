/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.leeds.ccg.andyt.vector.geometry;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author geoagdt
 */
public class VectorEnvelope2DTest {

    public VectorEnvelope2DTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Vector_Envelope2D.
     */
    @Test
    public void testToString() {
//        System.out.println("toString");
//        Vector_Envelope2D instance = new Vector_Envelope2D();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of envelope method, of class Vector_Envelope2D.
     */
    @Test
    public void testEnvelope_VectorEnvelope2D_VectorEnvelope2D() {
//        System.out.println("envelope");
//        Vector_Envelope2D a_Envelope2D = null;
//        Vector_Envelope2D b_Envelope2D = null;
//        Vector_Envelope2D expResult = null;
//        Vector_Envelope2D result = Vector_Envelope2D.envelope(a_Envelope2D, b_Envelope2D);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of envelope method, of class Vector_Envelope2D.
     */
    @Test
    public void testEnvelope_VectorEnvelope2D() {
//        System.out.println("envelope");
//        Vector_Envelope2D a_Envelope2D = null;
//        Vector_Envelope2D instance = new Vector_Envelope2D();
//        Vector_Envelope2D expResult = null;
//        Vector_Envelope2D result = instance.envelope(a_Envelope2D);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntersects method, of class Vector_Envelope2D.
     */
    @Test
    public void testGetIntersects_Envelope2D() {
        System.out.println("getIntersects");
        boolean expResult;
        boolean result;

        Vector_Point2D a_VectorPoint2D;
        Vector_Point2D b_VectorPoint2D = new Vector_Point2D("1", "1");
        Vector_Envelope2D b_VectorPoint2D_Envelope2D = b_VectorPoint2D.getEnvelope2D();
        Vector_Envelope2D ab_VectorEnvelope2D;
        BigDecimal a_x = new BigDecimal("1");
        BigDecimal a_y = new BigDecimal("1");
        BigDecimal ten_BigDecimal = new BigDecimal("10");
        for (int i = 0; i < 1000; i++) {
            a_x = a_x.divide(ten_BigDecimal);
            a_y = a_y.divide(ten_BigDecimal);
            a_VectorPoint2D = new Vector_Point2D(a_x, a_y);
            System.out.println("a_VectorPoint2D " + a_VectorPoint2D.toString());
            ab_VectorEnvelope2D = new Vector_Envelope2D(
                    a_VectorPoint2D,
                    b_VectorPoint2D);
            expResult = true;
            result = ab_VectorEnvelope2D.getIntersects(a_VectorPoint2D.getEnvelope2D());
            System.out.println("ab_VectorEnvelope2D.getIntersects(a_VectorPoint2D.getEnvelope2D()) " + result);
            assertEquals(expResult, result);
            result = ab_VectorEnvelope2D.getIntersects(b_VectorPoint2D_Envelope2D);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of getIntersects method, of class Vector_Envelope2D.
     */
    @Test
    public void testGetIntersects_VectorLineSegment2D() {
//        System.out.println("getIntersects");
//        VectorLineSegment2D a_LineSegment2D = null;
//        Vector_Envelope2D instance = new Vector_Envelope2D();
//        int expResult = 0;
//        int result = instance.getIntersects(a_LineSegment2D);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntersects method, of class Vector_Envelope2D.
     */
    @Test
    public void testGetIntersects_VectorPoint2D() {
//        System.out.println("getIntersects");
//        Vector_Point2D aPoint = null;
//        Vector_Envelope2D instance = new Vector_Envelope2D();
//        boolean expResult = false;
//        boolean result = instance.getIntersects(aPoint);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntersects method, of class Vector_Envelope2D.
     */
    @Test
    public void testGetIntersects_BigDecimal_BigDecimal() {
//        System.out.println("getIntersects");
//        BigDecimal x = null;
//        BigDecimal y = null;
//        Vector_Envelope2D instance = new Vector_Envelope2D();
//        boolean expResult = false;
//        boolean result = instance.getIntersects(x, y);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnvelope2D method, of class Vector_Envelope2D.
     */
    @Test
    public void testGetEnvelope2D() {
//        System.out.println("getEnvelope2D");
//        Vector_Envelope2D instance = new Vector_Envelope2D();
//        Vector_Envelope2D expResult = null;
//        Vector_Envelope2D result = instance.getEnvelope2D();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of applyDecimalPlacePrecision method, of class Vector_Envelope2D.
     */
    @Test
    public void testApplyDecimalPlacePrecision() {
//        System.out.println("applyDecimalPlacePrecision");
//        Vector_Envelope2D instance = new Vector_Envelope2D();
//        instance.applyDecimalPlacePrecision();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}