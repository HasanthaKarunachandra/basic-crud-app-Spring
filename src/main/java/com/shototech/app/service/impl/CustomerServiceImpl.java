package com.shototech.app.service.impl;

import com.shototech.app.dao.CustomerDao;
import com.shototech.app.entity.Customer;
import com.shototech.app.service.CustomerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;
    @Override
    @Transactional
    public List<Customer> findAllCustomers() {
        return customerDao.findAllCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }
}
