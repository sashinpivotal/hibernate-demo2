package com.test.hib.controller;

import com.test.hib.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.List;

public class EmployeeController {
    public void createEmployeeTable() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Employee uone = new Employee();
        t.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();
    }

    public void findEmployeeByname() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //------------  Hibernate Named Query   -------------
        TypedQuery query = session.getNamedQuery("findEmployeeByName");
        query.setParameter("name", "Tom Thele");
        List<Employee> employees = query.getResultList();
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e);
        }
        factory.close();
        session.close();
    }

    public void findEmployeeById() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //------------  Hibernate Named Query   -------------
        //------------  Hibernate Named Query   -------------
        TypedQuery query = session.getNamedQuery("findEmployeeByName");
        query.setParameter("name", "Tom Thele");
        List<Object[]> emName = query.getResultList();
        for (Object[] o : emName) {
            System.out.println("Employee name: " + o[0] + " | Employee Salary: " +
                    o[1] + " | Emp Job Title: " + o[2]);
        }
        factory.close();
        session.close();
    }

    public void ShowOfficeCodes_AsDepartment() {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //------------  Hibernate Named Query   -------------
        TypedQuery query = session.getNamedQuery("empDepAlias");
        List<Object[]> list = query.getResultList();
        for (Object[] e : list) {
            System.out.println("OfficeCode: " + e[1] + " | Dep Name: " + e[3] +
                    " | Employee Name: " + e[2]);
        }
        factory.close();
        session.close();
    }

}

class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        EmployeeController e = new EmployeeController();
//e.createEmployeeTable();
//e.findEmployeeByname();
//e.findEmployeeById();
        e.ShowOfficeCodes_AsDepartment();
    }
}





