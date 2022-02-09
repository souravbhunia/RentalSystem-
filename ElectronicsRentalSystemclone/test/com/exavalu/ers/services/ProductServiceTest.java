/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.ers.services;

import com.exavalu.ers.pojos.Products;
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
public class ProductServiceTest {
    
    public ProductServiceTest() {
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
     * Test of showAllProducts method, of class ProductService.
     */
    @Test
    public void testShowAllProducts() throws Exception {
        System.out.println("showAllProducts");
        ProductService instance = new ProductService();
        List expResult = null;
        List result = instance.showAllProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchProductDetails method, of class ProductService.
     */
    @Test
    public void testFetchProductDetails() throws Exception {
        System.out.println("fetchProductDetails");
        int productId = 0;
        ProductService instance = new ProductService();
        Products expResult = null;
        Products result = instance.fetchProductDetails(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showLaptop method, of class ProductService.
     */
    @Test
    public void testShowLaptop() throws Exception {
        System.out.println("showLaptop");
        ProductService instance = new ProductService();
        List expResult = null;
        List result = instance.showLaptop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDesktop method, of class ProductService.
     */
    @Test
    public void testShowDesktop() throws Exception {
        System.out.println("showDesktop");
        ProductService instance = new ProductService();
        List expResult = null;
        List result = instance.showDesktop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTablet method, of class ProductService.
     */
    @Test
    public void testShowTablet() throws Exception {
        System.out.println("showTablet");
        ProductService instance = new ProductService();
        List expResult = null;
        List result = instance.showTablet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProduct method, of class ProductService.
     */
    @Test
    public void testUpdateProduct() throws Exception {
        System.out.println("updateProduct");
        int productId = 0;
        String productName = "";
        String productMake = "";
        String productSpecification = "";
        double productPrice = 0.0;
        int availability = 0;
        ProductService instance = new ProductService();
        int expResult = 0;
        int result = instance.updateProduct(productId, productName, productMake, productSpecification, productPrice, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProductDetails method, of class ProductService.
     */
    @Test
    public void testDeleteProductDetails() throws Exception {
        System.out.println("deleteProductDetails");
        int productId = 0;
        ProductService instance = new ProductService();
        int expResult = 0;
        int result = instance.deleteProductDetails(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of itemsInCart method, of class ProductService.
     */
    @Test
    public void testItemsInCart() {
        System.out.println("itemsInCart");
        int productId = 0;
        int quantity = 0;
        ProductService instance = new ProductService();
        int expResult = 0;
        int result = instance.itemsInCart(productId, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
