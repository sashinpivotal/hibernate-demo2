package com.perscholas.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Teacher t1 = new Teacher();
        t1.setTeachername("Haseeb");
        t1.setSalary("100");
        Teacher t2 = new Teacher();
        t2.setTeachername("Jenny Finch");
        t2.setSalary("10000");
        Teacher t3 = new Teacher();
        t3.setTeachername("James");
        t3.setSalary("25000");
        Teacher t4 = new Teacher();
        t4.setTeachername("SID ROSE");
        t4.setSalary("3000");
        Teacher t5 = new Teacher();
        t5.setSalary("200");
        t5.setTeachername("Ali");
        //Add teacher entity object to the list
        List<Teacher> teachlist = new ArrayList();
        teachlist.add(t1);
        teachlist.add(t2);
        teachlist.add(t3);
        teachlist.add(t4);
        teachlist.add(t5);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        session.save(t5);
        //Create Department
        Department department = new Department();
        department.setDname("Development");
        department.setTeacherList(teachlist);
        //Store Department
        session.save(department);
        t.commit();
    }
}



