package mgy.dao;

import mgy.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public interface DeptDao {

    public List findDept();

    public void addDept(Dept dept);
}
