package com.evergent.corejava.gadgets.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.evergent.corejava.gadgets.bean.CustomerBean;

public class CustomerDAO {
    public int addCustomer(CustomerBean customer) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO customers (name, email, phone) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, customer.getName());
                pstmt.setString(2, customer.getEmail());
                pstmt.setString(3, customer.getPhone());
                int affectedRows = pstmt.executeUpdate();

                if (affectedRows > 0) {
                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            return generatedKeys.getInt(1); // Return the generated customer ID
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateCustomer(CustomerBean customer) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "UPDATE customers SET name = ?, email = ?, phone = ? WHERE customer_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setString(1, customer.getName());
                pstmt.setString(2, customer.getEmail());
                pstmt.setString(3, customer.getPhone());
                pstmt.setInt(4, customer.getCustomerId());
                return pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public CustomerBean getCustomer(int customerId) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM customers WHERE customer_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, customerId);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        CustomerBean customer = new CustomerBean();
                        customer.setCustomerId(rs.getInt("customer_id"));
                        customer.setName(rs.getString("name"));
                        customer.setEmail(rs.getString("email"));
                        customer.setPhone(rs.getString("phone"));
                        return customer;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CustomerBean> getAllCustomers() {
        List<CustomerBean> customers = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM customers";
            try (PreparedStatement pstmt = con.prepareStatement(query);
                 ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    CustomerBean customer = new CustomerBean();
                    customer.setCustomerId(rs.getInt("customer_id"));
                    customer.setName(rs.getString("name"));
                    customer.setEmail(rs.getString("email"));
                    customer.setPhone(rs.getString("phone"));
                    customers.add(customer);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

    public int deleteCustomer(int customerId) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "DELETE FROM customers WHERE customer_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, customerId);
                return pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
