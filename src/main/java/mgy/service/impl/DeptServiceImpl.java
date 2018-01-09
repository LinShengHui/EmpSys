package mgy.service.impl;

import mgy.dao.DeptDao;
import mgy.entity.Dept;
import mgy.service.DeptService;
import mgy.zj.Compapent;
import mgy.zj.Inject;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
@Compapent("deptService")
public class DeptServiceImpl implements DeptService {

    @Inject("deptDao")
    private DeptDao deptDao;

    @Override
    public List findDept() {
        return deptDao.findDept();
    }

    @Override
    public void addDept(Dept dept) {
        deptDao.addDept(dept);
    }
}
