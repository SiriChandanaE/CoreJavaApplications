package com.evergent.corejava.gadgets.dao;
import java.sql.*;

public class PurchaseDAO {
    public int addPurchase(int customerId, int gadgetId, int quantity) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO purchases (customer_id, gadget_id, quantity) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, customerId);
                pstmt.setInt(2, gadgetId);
                pstmt.setInt(3, quantity);
                return pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
