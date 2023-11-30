package com.shototech.app.dao.ompl;

import com.shototech.app.dao.CustomerDao;
import com.shototech.app.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> findAllCustomers() {
        Session session= sessionFactory.getCurrentSession();
       return session.createQuery("FROM Customer", Customer.class).getResultList();
  }
}
