package com.evergent.corejava.gadgets.service;

import com.evergent.corejava.gadgets.bean.GadgetBean;
import com.evergent.corejava.gadgets.dao.GadgetDAO;
import java.util.List;
import java.util.List;

public class GadgetService {
    private GadgetDAO gadgetDAO = new GadgetDAO();

    public int addGadget(GadgetBean gadget) {
        return gadgetDAO.addGadget(gadget);
    }

    public int updateGadget(GadgetBean gadget) {
        return gadgetDAO.updateGadget(gadget);
    }

    public GadgetBean getGadget(int gadgetId) {
        return gadgetDAO.getGadget(gadgetId);
    }

    public List<GadgetBean> getAllGadgets() {
        return gadgetDAO.getAllGadgets();
    }

    public int deleteGadget(int gadgetId) {
        return gadgetDAO.deleteGadget(gadgetId);
    }
}
