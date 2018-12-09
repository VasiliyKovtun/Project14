package com.it;

import com.it.Steps.CommonSteps;
import com.it.Steps.DashBoardSteps;
import com.it.Steps.LoginSteps;

public class App {
    public CommonSteps common;
    public LoginSteps login;
    public DashBoardSteps dashBoard;

    public App() {
        common = new CommonSteps();
        login = new LoginSteps();
        dashBoard = new DashBoardSteps();
    }
}
