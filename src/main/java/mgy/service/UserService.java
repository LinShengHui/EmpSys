package mgy.service;

import mgy.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public interface UserService {

    public boolean addUser(User user);

    public List findUser();

    public boolean updateUser();
}
