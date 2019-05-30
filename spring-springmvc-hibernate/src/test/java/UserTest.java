/**
 * Created by Administrator on 2019/5/27.
 */

import com.hengzhi.dao.UserDao;
import com.hengzhi.entity.User;
import com.hengzhi.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * UserTest
 * Administrator
 * 2019/5/27
 *
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-common.xml"})
public class UserTest {
    @Autowired
    UserService userService;
    @Test
    public void newUser(){
        User user = new User("wang","123","132");
        int s = userService.newUser(user);
        Assert.assertTrue(s>=1);
    }
    @Test
    public void queryUser(){
        User user = userService.queryUser("1");
        System.out.println(user.toString());
    }
    @Test
    public void updateUser(){
        userService.updateUser(new User(5, "1","1","1"));
    }

}
