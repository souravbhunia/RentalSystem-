/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.ers.services;

import com.exavalu.ers.core.ConnectionManager;
import com.exavalu.ers.pojos.Products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author indra
 */
public class ProductService {

    public List showAllProducts() throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        List<Products> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM electronic_rental_system.products";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Products product = new Products();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductSpecification(rs.getString("productSpecification"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setAvailability(rs.getInt("availability"));
                product.setStatus(rs.getInt("status"));
                //Products.setProductImage(rs.getString("productImage"));

                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    public List showTopProducts() throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        List<Products> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM electronic_rental_system.products WHERE status=1 limit 12";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Products product = new Products();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductSpecification(rs.getString("productSpecification"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setAvailability(rs.getInt("availability"));
                product.setProductImage(rs.getString("productImage"));
               

                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }
    
    public Products fetchProductDetails(int productId) throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        Products product = new Products();
        try {
            con = ConnectionManager.getConnection();
            String sql = "SELECT * FROM electronic_rental_system.products WHERE productId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("productId = " + productId);
            ps.setInt(1, productId);
            System.out.println("Select SQL = " + ps);

            rs = ps.executeQuery();
            if (rs.next()) {

                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductSpecification(rs.getString("productSpecification"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setAvailability(rs.getInt("availability"));

            }
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public List showLaptop() throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        List<Products> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM electronic_rental_system.products WHERE productName='Laptop'";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Products product = new Products();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductSpecification(rs.getString("productSpecification"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setAvailability(rs.getInt("availability"));
                product.setProductImage(rs.getString("productImage"));

                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    public List showDesktop() throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        List<Products> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM electronic_rental_system.products WHERE productName='Desktop'";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Products product = new Products();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductSpecification(rs.getString("productSpecification"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setAvailability(rs.getInt("availability"));
                product.setProductImage(rs.getString("productImage"));

                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    public List showTablet() throws SQLException, Exception {
        ResultSet rs = null;
        Connection con = null;
        List<Products> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM electronic_rental_system.products WHERE productName='Tablet'";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Products product = new Products();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setProductMake(rs.getString("productMake"));
                product.setProductSpecification(rs.getString("productSpecification"));
                product.setProductPrice(rs.getDouble("productPrice"));
                product.setAvailability(rs.getInt("availability"));
                product.setProductImage(rs.getString("productImage"));

                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }

    }

    public int updateProduct(int productId, String productName, String productMake,String productSpecification, double productPrice,
            int availability) throws SQLException, Exception {

        Connection con = ConnectionManager.getConnection();
        int i = 0;
        try {
            String sql = "UPDATE products SET productId =?, productName = ?, productMake = ?,  productPrice = ?, availability = ?, productSpecification=? WHERE productId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
            ps.setString(2, productName);
            ps.setString(3, productMake);
            ps.setString(6, productSpecification);
            ps.setDouble(4, productPrice);
            ps.setInt(5, availability);
            ps.setInt(7, productId);

            System.out.println("Select SQL = " + ps);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int deleteProductDetails(int productId,int status) throws SQLException, Exception {
        Connection con = ConnectionManager.getConnection();
        int i = 0;
        if(status==1){
            status=0;
        }else{
            status=1;
        }
        try {
            String sql = "UPDATE electronic_rental_system.products SET status = ? WHERE productId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, status);
            ps.setInt(2, productId);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int itemsInCart(int productId,int quantity) {
        Connection con = ConnectionManager.getConnection();
        int i = 0;
        try {
            String sql = "INSERT INTO quantity(productId, quantity) VALUES(?,?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
           
            ps.setInt(2, quantity);

            System.out.println("Select SQL = " + ps);
            i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
