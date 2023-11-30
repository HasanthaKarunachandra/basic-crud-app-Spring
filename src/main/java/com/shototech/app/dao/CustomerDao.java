package com.shototech.app.dao;

import com.shototech.app.entity.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> findAllCustomers();
}

