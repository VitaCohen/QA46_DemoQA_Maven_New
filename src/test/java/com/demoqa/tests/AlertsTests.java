package com.demoqa.tests;

import com.demoqa.alertsFrameWindows.AlertsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();

    }

    @Test
    public void alertWaitTest(){
        new AlertsPage(driver).alertWithTimer();
    }

    @Test
    public void alertWithSelectTest(){
        new AlertsPage(driver).selectResult("Cancel")
                .veryfyResult("Cancel");
    }

    @Test
    public void sentMessageToAlertTest(){
        new AlertsPage(driver).sendMessageToAlert("Hello")
                .verifyMessage("Hello");
    }



}
