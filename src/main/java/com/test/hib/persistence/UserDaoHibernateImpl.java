package com.test.hib.persistence;

import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;

public class UserDaoHibernateImpl implements UserDao{

    @Override
    public int createUser(User user) {
        // TODO Auto-generated method stub
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Serializable save = session.save(user);
        t.commit();
        factory.close();
        session.close();
        return (int) save;
    }

    @Override
    public User findUser(int id) {
        SessionFactory factory = new
                Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        User user = session.find(User.class, id);
        t.commit();
        factory.close();
        session.close();
        return user;
    }
}
