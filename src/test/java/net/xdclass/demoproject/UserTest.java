package net.xdclass.demoproject;

import junit.framework.TestCase;
import net.xdclass.demoproject.controller.UserController;
import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.utils.JsonData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoProjectApplication.class)
public class UserTest {
    @Autowired
    private UserController userController;

    @Test
    public void loginTest(){
        User user = new User();
        user.setUsername("jack");
        user.setPassword("123");
        JsonData jsonData = userController.login(user);
        TestCase.assertEquals(jsonData.getCode(), 0);
        TestCase.assertEquals(jsonData.getData().toString().length(), 36);
    }
}
