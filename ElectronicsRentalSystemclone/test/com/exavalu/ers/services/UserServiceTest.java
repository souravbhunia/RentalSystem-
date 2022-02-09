/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.ers.services;

import com.exavalu.ers.pojos.User;
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
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of validateLoginCredentials method, of class UserService.
     */
    @Test
    public void testValidateLoginCredentials() throws Exception {
        System.out.println("validateLoginCredentials");
        User user = null;
        User expResult = null;
        User result = UserService.validateLoginCredentials(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productNameType method, of class UserService.
     */
    @Test
    public void testProductNameType() {
        System.out.println("productNameType");
        List<Integer> expResult = null;
        List<Integer> result = UserService.productNameType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserService.
     */
    @Test
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        String userName = "";
        String userMobileNo = "";
        String userEmail = "";
        String password = "";
        String city = "";
        String country = "";
        UserService instance = new UserService();
        int expResult = 0;
        int result = instance.addUser(userName, userMobileNo, userEmail, password, city, country);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of report method, of class UserService.
     */
    @Test
    public void testReport() throws Exception {
        System.out.println("report");
        List expResult = null;
        List result = UserService.report();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchUserDetails method, of class UserService.
     */
    @Test
    public void testFetchUserDetails() throws Exception {
        System.out.println("fetchUserDetails");
        int userId = 0;
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.fetchUserDetails(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserDetails method, of class UserService.
     */
    @Test
    public void testUpdateUserDetails() throws Exception {
        System.out.println("updateUserDetails");
        int userId = 0;
        String userName = "";
        String password = "";
        String userMobileNo = "";
        String userEmail = "";
        String city = "";
        String country = "";
        int status = 0;
        int roleId = 0;
        UserService instance = new UserService();
        int expResult = 0;
        int result = instance.updateUserDetails(userId, userName, password, userMobileNo, userEmail, city, country, status, roleId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserDetails method, of class UserService.
     */
    @Test
    public void testDeleteUserDetails() throws Exception {
        System.out.println("deleteUserDetails");
        int userId = 0;
        UserService instance = new UserService();
        int expResult = 0;
        int result = instance.deleteUserDetails(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showType method, of class UserService.
     */
    @Test
    public void testShowType() throws Exception {
        System.out.println("showType");
        List expResult = null;
        List result = UserService.showType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
