package mgy.dao.impl;

import mgy.dao.DeptDao;
import mgy.entity.Dept;
import mgy.entity.User;
import mgy.util.ConnUtil;
import mgy.zj.Compapent;
import query.ResultHandler;
import query.SQLExectuor;
import query.impl.BeanHandler;
import query.impl.BeanListHandler;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
@Compapent("deptDao")
public class DeptDaoImpl implements DeptDao {
    @Override
    public List findDept() {
        String sql="select * from dept";
        ResultHandler rh = new BeanListHandler(Dept.class);
        List list=new SQLExectuor(ConnUtil.getConnection()).executQueryToBeanList(sql,rh);
        return list;
    }

    @Override
    public void addDept(Dept dept) {
        String sql="insert into dept values(?,?)";
        new SQLExectuor(ConnUtil.getConnection()).executeUpdate(sql,dept.getDno(),dept.getDname());
    }
}
