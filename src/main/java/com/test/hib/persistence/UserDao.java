package com.test.hib.persistence;

import com.test.hib.model.User;

public interface UserDao {
    public int createUser(User user);
    public User findUser(int id);
}
