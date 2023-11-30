package com.shototech.app.controller;

import com.shototech.app.dao.CustomerDao;
import com.shototech.app.entity.Customer;
import com.shototech.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public String allCustomers(Model model){
        List<Customer> list = customerService.findAllCustomers();
        model.addAttribute("customers",list);
        return "all-customers";

    }
}
