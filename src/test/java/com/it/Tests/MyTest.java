package com.it.Tests;

import com.it.App;
import com.it.Users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

        @Test
        public void test(){
           app.login.loginValidUser();
            System.out.println(UserFactory.getRandomUser(10));
            Assert.assertEquals(app.dashBoard.getloginEmail(), validUser.getEmail());

    }
}
