package com.evergent.corejava.gadgets.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.evergent.corejava.gadgets.bean.GadgetBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GadgetDAO {
    public int addGadget(GadgetBean gadget) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO gadgets (type, quantity, cost) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, gadget.getType());
                pstmt.setInt(2, gadget.getQuantity());
                pstmt.setInt(3, gadget.getCost());
                int affectedRows = pstmt.executeUpdate();

                if (affectedRows > 0) {
                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            return generatedKeys.getInt(1); // Return the generated gadget ID
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateGadget(GadgetBean gadget) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "UPDATE gadgets SET quantity = ?, cost = ? WHERE gadget_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, gadget.getQuantity());
                pstmt.setInt(2, gadget.getCost());
                pstmt.setInt(3, gadget.getGadgetId());
                return pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public GadgetBean getGadget(int gadgetId) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM gadgets WHERE gadget_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, gadgetId);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        GadgetBean gadget = new GadgetBean();
                        gadget.setGadgetId(rs.getInt("gadget_id"));
                        gadget.setType(rs.getString("type"));
                        gadget.setQuantity(rs.getInt("quantity"));
                        gadget.setCost(rs.getInt("cost"));
                        return gadget;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<GadgetBean> getAllGadgets() {
        List<GadgetBean> gadgets = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM gadgets";
            try (PreparedStatement pstmt = con.prepareStatement(query);
                 ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    GadgetBean gadget = new GadgetBean();
                    gadget.setGadgetId(rs.getInt("gadget_id"));
                    gadget.setType(rs.getString("type"));
                    gadget.setQuantity(rs.getInt("quantity"));
                    gadget.setCost(rs.getInt("cost"));
                    gadgets.add(gadget);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gadgets;
    }

    public int deleteGadget(int gadgetId) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "DELETE FROM gadgets WHERE gadget_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setInt(1, gadgetId);
                return pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
