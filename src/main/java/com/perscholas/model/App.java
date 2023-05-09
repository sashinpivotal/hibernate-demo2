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

        Department department1 = new Department();
        Department department2 = new Department();

        Teacher t1 = new Teacher();
        t1.setTeachername("Haseeb");
        t1.setSalary("100");
        t1.setDep(department1);
        Teacher t2 = new Teacher();
        t2.setTeachername("Jenny Finch");
        t2.setSalary("10000");
        t2.setDep(department1);
        Teacher t3 = new Teacher();
        t3.setTeachername("James");
        t3.setSalary("25000");
        t3.setDep(department1);

        Teacher t4 = new Teacher();
        t4.setTeachername("SID ROSE");
        t4.setSalary("3000");
        t4.setDep(department2);
        Teacher t5 = new Teacher();
        t5.setSalary("200");
        t5.setTeachername("Ali");
        t5.setDep(department2);

        List<Teacher> teachlist1 = new ArrayList();
        teachlist1.add(t1);
        teachlist1.add(t2);
        teachlist1.add(t3);

        List<Teacher> teacherList2 = new ArrayList<>();
        teacherList2.add(t4);
        teacherList2.add(t5);

//        session.save(t1);
//        session.save(t2);
//        session.save(t3);
//        session.save(t4);
//        session.save(t5);

        //Create Department

        department1.setDname("Development");
        department1.setTeachers(teachlist1);


        department2.setTeachers(teacherList2);
        department2.setDname("Marketing");

        //Store Department
        session.save(department1);
        session.save(department2);
        t.commit();
    }
}
