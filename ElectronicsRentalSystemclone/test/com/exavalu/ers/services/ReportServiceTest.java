/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.ers.services;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author indra
 */
public class ReportServiceTest {
    
    public ReportServiceTest() {
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
     * Test of outOfStock method, of class ReportService.
     */
    @Test
    public void testOutOfStock() throws Exception {
        System.out.println("outOfStock");
        ReportService instance = new ReportService();
        List expResult = null;
        List result = instance.outOfStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostOrderedProduct method, of class ReportService.
     */
    @Test
    public void testMostOrderedProduct() throws Exception {
        System.out.println("mostOrderedProduct");
        ReportService instance = new ReportService();
        List expResult = null;
        List result = instance.mostOrderedProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newAddedProducts method, of class ReportService.
     */
    @Test
    public void testNewAddedProducts() throws Exception {
        System.out.println("newAddedProducts");
        ReportService instance = new ReportService();
        List expResult = null;
        List result = instance.newAddedProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
