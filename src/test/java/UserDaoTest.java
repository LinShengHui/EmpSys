import mgy.dao.UserDao;
import mgy.dao.impl.UserDaoImpl;
import mgy.entity.User;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/8.
 */
public class UserDaoTest {
    @Test
    public void test01(){
        UserDao ed = new UserDaoImpl();
        User user = new User();
        user.setName("123");
        user.setPassword("123456");
        ed.addUser(user);
    }
}
