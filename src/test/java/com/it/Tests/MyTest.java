package com.it.Tests;

import com.it.App;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
@Test
        public void test(){


    App app = new App();
    app.login.login("vkovt", "tokyo1982");
    Assert.assertEquals(app.dashBoard.getloginEmail(), "vkovt@i.ua");
    app.common.stopApp();

    }
}
//дз. сделать тест который напишет письмо и отправить (не обязательно)