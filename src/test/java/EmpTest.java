import mgy.dao.impl.EmpDaoImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
public class EmpTest {

    @Test
    public void findEmp(){
        EmpDaoImpl empDao = new EmpDaoImpl();
        empDao.removerEmp(3);
    }
}
