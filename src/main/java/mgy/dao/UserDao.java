package mgy.dao;

import mgy.entity.User;

public interface UserDao {
    User findUser(String name, String epassword);

    boolean addUser(User user);

    boolean updateUser(String sql);
}
