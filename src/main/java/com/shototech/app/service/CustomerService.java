package com.shototech.app.service;

import com.shototech.app.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> findAllCustomers();

    public void saveCustomer(Customer customer);
}
