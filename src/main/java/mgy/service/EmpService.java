package mgy.service;

import mgy.entity.Dept;
import mgy.entity.Emp;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public interface EmpService {


    public List findEmp();

    public void addEmp(Emp emp);

    public void remover(int eno);
}
