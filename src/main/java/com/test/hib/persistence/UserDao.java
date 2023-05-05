package com.test.hib.persistence;

import com.test.hib.model.User;

public interface UserDao {
    public void createUser(User user);
    public User findUser(int id);
}
