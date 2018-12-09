package com.it.Steps;

import com.it.Pages.BasePage;

public class CommonSteps extends BasePage {
    public void stopApp() {
        driver.quit();
    }

}
