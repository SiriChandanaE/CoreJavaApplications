package com.evergent.corejava.gadgets.service;
import com.evergent.corejava.gadgets.dao.PurchaseDAO;
public class PurchaseService {
    private PurchaseDAO purchaseDAO = new PurchaseDAO();

    public int addPurchase(int customerId, int gadgetId, int quantity) {
        return purchaseDAO.addPurchase(customerId, gadgetId, quantity);
    }
}
