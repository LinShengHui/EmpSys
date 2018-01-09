package mgy.service.impl;

import mgy.dao.impl.UserDaoImpl;
import mgy.entity.User;
import mgy.exception.LoginException;
import mgy.service.LoginService;
import mgy.zj.Compapent;
import mgy.zj.Inject;

@Compapent("loginService")
public class LoginServiceImpl implements LoginService {

    @Inject("userDao")
    private UserDaoImpl userDao;

    @Override
    public User login(User user) {
        user = userDao.findUser(user.getName(), user.getPassword());
        if(user == null){
            throw new LoginException("用户或密码错误!");
        }
        return user;
    }
}
