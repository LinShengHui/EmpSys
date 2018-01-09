import mgy.dao.DeptDao;
import mgy.dao.impl.DeptDaoImpl;
import mgy.entity.Dept;
import mgy.service.impl.DeptServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public class DeptTest {

    @Test
    public void addDept(){
       DeptDao deptDao = new DeptDaoImpl();
        /* deptDao.addDept(new Dept(4,"140"));*/
        List<Dept> depts =  deptDao.findDept();
        System.out.println(depts.size());

    }
}
