/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.ers.services;

import com.exavalu.ers.pojos.Orders;
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
public class OrderServiceTest {
    
    public OrderServiceTest() {
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
     * Test of reportOrder method, of class OrderService.
     */
    @Test
    public void testReportOrder() throws Exception {
        System.out.println("reportOrder");
        OrderService instance = new OrderService();
        List expResult = null;
        List result = instance.reportOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchOrderDetails method, of class OrderService.
     */
    @Test
    public void testFetchOrderDetails() throws Exception {
        System.out.println("fetchOrderDetails");
        int orderId = 0;
        OrderService instance = new OrderService();
        Orders expResult = null;
        Orders result = instance.fetchOrderDetails(orderId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateOrderDetails method, of class OrderService.
     */
    @Test
    public void testUpdateOrderDetails() throws Exception {
        System.out.println("updateOrderDetails");
        int orderId = 0;
        int productId = 0;
        int userId = 0;
        String startDate = "";
        String endDate = "";
        int quantity = 0;
        OrderService instance = new OrderService();
        int expResult = 0;
        int result = instance.updateOrderDetails(orderId, productId, userId, startDate, endDate, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteOrderDetails method, of class OrderService.
     */
    @Test
    public void testDeleteOrderDetails() throws Exception {
        System.out.println("deleteOrderDetails");
        int orderId = 0;
        OrderService instance = new OrderService();
        int expResult = 0;
        int result = instance.deleteOrderDetails(orderId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CustomerOrderList method, of class OrderService.
     */
    @Test
    public void testCustomerOrderList() throws Exception {
        System.out.println("CustomerOrderList");
        OrderService instance = new OrderService();
        List expResult = null;
        List result = instance.CustomerOrderList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reportOrderCustomer method, of class OrderService.
     */
    @Test
    public void testReportOrderCustomer() throws Exception {
        System.out.println("reportOrderCustomer");
        int userId = 0;
        OrderService instance = new OrderService();
        List expResult = null;
        List result = instance.reportOrderCustomer(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
