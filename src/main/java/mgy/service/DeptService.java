package mgy.service;

import mgy.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public interface DeptService {


    public List findDept();

    public void addDept(Dept dept);
}
