package com.test.hib.service;

import com.test.hib.model.User;
import com.test.hib.persistence.UserDao;
import com.test.hib.persistence.UserDaoHibernateImpl;

public class MyUserService {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoHibernateImpl();

        // creat a new user
        User user = new User("sang shin",
                "sang@gmail.com",
                "password",
                10,
                100.0, "boston");
        int userId = userDao.createUser(user);
        System.out.println("returned userId = " + userId);

        // find a user
        User user2 = userDao.findUser(userId);
        System.out.println(user2);
    }
}
