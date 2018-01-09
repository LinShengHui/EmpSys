package mgy.dao.impl;

import mgy.dao.DeptDao;
import mgy.dao.EmpDao;
import mgy.entity.Dept;
import mgy.entity.Emp;
import mgy.util.ConnUtil;
import mgy.zj.Compapent;
import query.ResultHandler;
import query.SQLExectuor;
import query.impl.ArrayListHandler;
import query.impl.BeanListHandler;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
@Compapent("empDao")
public class EmpDaoImpl implements EmpDao {

    @Override
    public List findEmp() {
        String sql="select e.*,d.dname from emp e,dept d WHERE e.edno=d.dno";
        ResultHandler rh = new ArrayListHandler();
        List list=new SQLExectuor(ConnUtil.getConnection()).exectureQueryToArrayList(sql,rh);
        return list;
    }

    @Override
    public void addEmp(Emp emp) {
        String sql="INSERT into emp values(DEFAULT,?,?,?,?,?)";
        new SQLExectuor(ConnUtil.getConnection()).executeUpdate(sql,emp.getEname(),emp.getEsex(),emp.getEage(),emp.getEphone(),emp.getEdno());
    }

    @Override
    public void removerEmp(int eno) {
        String sql = "delete FROM emp where eno=?";
        new SQLExectuor(ConnUtil.getConnection()).executeUpdate(sql,eno);
    }
}
