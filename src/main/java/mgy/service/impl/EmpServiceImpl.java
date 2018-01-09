package mgy.service.impl;

import mgy.dao.DeptDao;
import mgy.dao.EmpDao;
import mgy.entity.Dept;
import mgy.entity.Emp;
import mgy.service.DeptService;
import mgy.service.EmpService;
import mgy.zj.Compapent;
import mgy.zj.Inject;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
@Compapent("empService")
public class EmpServiceImpl implements EmpService {

    @Inject("empDao")
    private EmpDao empDao;

    @Override
    public List findEmp() {
        return empDao.findEmp();
    }

    @Override
    public void addEmp(Emp emp) {
        empDao.addEmp(emp);
    }

    @Override
    public void remover(int eno) {
        empDao.removerEmp(eno);
    }
}
