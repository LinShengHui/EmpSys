package mgy.dao;

import mgy.entity.Dept;
import mgy.entity.Emp;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public interface EmpDao {

    public List findEmp();

    public void addEmp(Emp emp);

    public void removerEmp(int eno);
}
