package com.keetica.persistence;

import com.keetica.models.Employee;
import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeDaoImpl implements IEmployeeDao{
    @Override
    public Employee getEmployeeById(int id) {

        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Employee employee = session.find(Employee.class, id);
        t.commit();
        factory.close();
        session.close();
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        List<Employee> employees = session.createSQLQuery("SELECT * FROM Employee").list();
        t.commit();
        factory.close();
        session.close();
        return employees;
    }
}
