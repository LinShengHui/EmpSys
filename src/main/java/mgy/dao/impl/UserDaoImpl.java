package mgy.dao.impl;

import mgy.dao.UserDao;
import mgy.entity.User;
import mgy.util.ConnUtil;
import mgy.zj.Compapent;
import query.ResultHandler;
import query.SQLExectuor;
import query.impl.BeanHandler;

@Compapent("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public User findUser(String name, String password) {
        String sql = "select * from user where ename = ? and epassword = ?";
        ResultHandler rh = new BeanHandler(User.class);
        User user = new SQLExectuor(ConnUtil.getConnection()).executQueryToBean(sql,rh,name,password);
        return user;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "insert into user values(?,?,?)";
        new SQLExectuor(ConnUtil.getConnection()).executeUpdate(sql, user.getId(), user.getName(), user.getPassword());
        return true;

    }

    @Override
    public boolean updateUser(String sql) {

        return false;
    }


}
