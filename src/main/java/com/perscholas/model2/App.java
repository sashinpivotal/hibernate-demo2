package com.perscholas.model2;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory factory
                = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        //----Create Cohort/class Entity set one----
        Cohort Class1 = new Cohort("Java Developer", "14 weeks");
        Cohort Class2 = new Cohort("FullStack Developer", "7 Weeks");
        Cohort Class3 = new Cohort("Python Developer", "12 Weeks");
        //------  Store Cohort  / Class  --------
        session.save(Class1);
        session.save(Class2);
        session.save(Class3);

        //-----Create Cohort one / Class one --------
        Set<Cohort> ClassSet1 = new HashSet<Cohort>();
        ClassSet1.add(Class1);
        ClassSet1.add(Class2);
        ClassSet1.add(Class3);

        //-----Create Cohort two / Class two --------
        Set<Cohort> ClassSet2 = new HashSet<Cohort>();
        ClassSet2.add(Class2);
        ClassSet2.add(Class3);
        ClassSet2.add(Class1);

        //-----Create Cohort Three / Class Three --------
        Set<Cohort> ClassSet3 = new HashSet<Cohort>();
        ClassSet3.add(Class3);
        ClassSet3.add(Class1);
        ClassSet3.add(Class2);

        Teacher2 t1 = new Teacher2("100", "Haseeb", ClassSet1);
        Teacher2 t2 = new Teacher2("200", "Jenny", ClassSet2);
        Teacher2 t3 = new Teacher2("200", "Charlie", ClassSet3);

        session.save(t1);
        session.save(t2);
        session.save(t3);
        t.commit();
    }
}

