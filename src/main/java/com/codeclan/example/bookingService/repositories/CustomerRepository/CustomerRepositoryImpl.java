package com.codeclan.example.bookingService.repositories.CustomerRepository;

import com.codeclan.example.bookingService.models.Course;
import com.codeclan.example.bookingService.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getAllCustomersForCourse(Long id) {
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", id));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

        return results;
    }
}
