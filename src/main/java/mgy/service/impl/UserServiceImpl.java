package mgy.service.impl;

import mgy.dao.UserDao;
import mgy.entity.User;
import mgy.service.UserService;
import mgy.zj.Compapent;
import mgy.zj.Inject;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
@Compapent("userService")
public class UserServiceImpl implements UserService {

    @Inject("userDao")
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        try {
            userDao.addUser(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List findUser() {
        return null;
    }

    @Override
    public boolean updateUser() {
        return false;
    }
}
