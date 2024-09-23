package com.evergent.corejava.gadgets.service;
import java.util.List;

import com.evergent.corejava.gadgets.bean.CustomerBean;
import com.evergent.corejava.gadgets.dao.CustomerDAO;

public class CustomerService {
    private CustomerDAO customerDAO = new CustomerDAO();

    public int addCustomer(CustomerBean customer) {
        return customerDAO.addCustomer(customer);
    }

    public int updateCustomer(CustomerBean customer) {
        return customerDAO.updateCustomer(customer);
    }

    public CustomerBean getCustomer(int customerId) {
        return customerDAO.getCustomer(customerId);
    }

    public List<CustomerBean> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    public int deleteCustomer(int customerId) {
        return customerDAO.deleteCustomer(customerId);
    }
}
